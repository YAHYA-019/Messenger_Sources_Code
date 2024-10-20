package org.webrtc.audio;

import X.0Pz;
import X.AnonymousClass001;
import X.JQx;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import org.webrtc.Logging;

/* loaded from: WebRtcAudioManager.class */
public class WebRtcAudioManager {
    public static final int BITS_PER_SAMPLE = 16;
    public static final int DEFAULT_FRAME_PER_BUFFER = 256;
    public static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    public static final String TAG = "WebRtcAudioManagerExternal";

    public static AudioManager getAudioManager(Context context) {
        return JQx.A0T(context);
    }

    public static int getInputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        return AnonymousClass001.A1N(isLowLatencyOutputSupported(context) ? 1 : 0) ? getLowLatencyFramesPerBuffer(audioManager) : getMinInputFrameSize(i, i2);
    }

    public static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        int i = 256;
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            i = Integer.parseInt(property);
        }
        return i;
    }

    public static int getMinInputFrameSize(int i, int i2) {
        int i3 = i2 * 2;
        int i4 = 12;
        if (i2 == 1) {
            i4 = 16;
        }
        return AudioRecord.getMinBufferSize(i, i4, 2) / i3;
    }

    public static int getMinOutputFrameSize(int i, int i2) {
        int i3 = i2 * 2;
        int i4 = 12;
        if (i2 == 1) {
            i4 = 4;
        }
        return AudioTrack.getMinBufferSize(i, i4, 2) / i3;
    }

    public static int getOutputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        return isLowLatencyOutputSupported(context) ? getLowLatencyFramesPerBuffer(audioManager) : getMinOutputFrameSize(i, i2);
    }

    public static int getSampleRate(AudioManager audioManager) {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel(audioManager);
        Logging.d(TAG, 0Pz.A0d("Sample rate is set to ", " Hz", sampleRateForApiLevel));
        return sampleRateForApiLevel;
    }

    public static int getSampleRateForApiLevel(AudioManager audioManager) {
        int i = 16000;
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property != null) {
            i = Integer.parseInt(property);
        }
        return i;
    }

    public static boolean isLowLatencyInputSupported(Context context) {
        return AnonymousClass001.A1N(isLowLatencyOutputSupported(context) ? 1 : 0);
    }

    public static boolean isLowLatencyOutputSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
