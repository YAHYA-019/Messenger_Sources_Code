package org.webrtc.audio;

import X.0Pz;
import X.AnonymousClass001;
import X.JQy;
import android.media.AudioManager;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

/* loaded from: VolumeLogger.class */
public class VolumeLogger {
    public static final String TAG = "VolumeLogger";
    public static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    public static final int TIMER_PERIOD_IN_SECONDS = 30;
    public final AudioManager audioManager;
    public Timer timer;

    /* loaded from: VolumeLogger$LogVolumeTask.class */
    public class LogVolumeTask extends TimerTask {
        public final int maxRingVolume;
        public final int maxVoiceCallVolume;

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            StringBuilder A0k;
            int i;
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                A0k = AnonymousClass001.A0k();
                A0k.append("STREAM_RING stream volume: ");
                A0k.append(VolumeLogger.this.audioManager.getStreamVolume(2));
                A0k.append(" (max=");
                i = this.maxRingVolume;
            } else {
                if (mode != 3) {
                    return;
                }
                A0k = AnonymousClass001.A0k();
                A0k.append("VOICE_CALL stream volume: ");
                A0k.append(VolumeLogger.this.audioManager.getStreamVolume(0));
                A0k.append(" (max=");
                i = this.maxVoiceCallVolume;
            }
            A0k.append(i);
            JQy.A1R(")", VolumeLogger.TAG, A0k);
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        Logging.d(TAG, 0Pz.A0W("start", WebRtcAudioUtils.getThreadInfo()));
        if (this.timer == null) {
            Logging.d(TAG, 0Pz.A0W("audio mode is: ", WebRtcAudioUtils.modeToString(this.audioManager.getMode())));
            Timer timer = new Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, LocationComponentOptions.STALE_STATE_DELAY_MS);
        }
    }

    public void stop() {
        Logging.d(TAG, 0Pz.A0W("stop", WebRtcAudioUtils.getThreadInfo()));
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
