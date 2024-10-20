package org.webrtc.voiceengine;

import X.0Pz;
import X.1BL;
import X.AnonymousClass001;
import X.Hn4;
import X.JQx;
import X.JQz;
import X.KMZ;
import X.Lxc;
import X.MDq;
import X.MDr;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioTrack;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

/* loaded from: WebRtcAudioTrack.class */
public class WebRtcAudioTrack {
    public static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioTrack";
    public static MDq errorCallback;
    public static MDr errorCallbackOld;
    public static volatile boolean speakerMute;
    public final AudioManager audioManager;
    public Lxc audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final long nativeAudioTrack;
    public final Hn4 threadChecker;
    public static final int DEFAULT_USAGE = 2;
    public static int usageAttribute = 2;

    public WebRtcAudioTrack(long j) {
        Hn4 hn4 = new Hn4();
        this.threadChecker = hn4;
        hn4.A00();
        Logging.d(TAG, JQx.A0x("ctor"));
        this.nativeAudioTrack = j;
        this.audioManager = JQx.A0T(ContextUtils.applicationContext);
        this.effects = new WebRtcAudioEffects();
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0J("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        int i2 = 12;
        if (i == 1) {
            i2 = 4;
        }
        return i2;
    }

    public static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        JQx.A1O("nativeOutputSampleRate: ", nativeOutputSampleRate, TAG);
        if (i != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        int i4 = usageAttribute;
        if (i4 != DEFAULT_USAGE) {
            Logging.w(TAG, 0Pz.A0T("A non default usage attribute is used: ", i4));
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), JQz.A0K(i, i2), i3, 1, 0);
    }

    public static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private boolean enableBuiltInDP(boolean z) {
        Logging.d(TAG, 0Pz.A0R("enableBuiltInDP(", ')', z));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setDP(z);
        }
        Logging.e(TAG, "Built-in audio effects are not supported on this platform");
        return false;
    }

    private boolean enableBuiltInEQ(boolean z) {
        Logging.d(TAG, 0Pz.A0R("enableBuiltInEQ(", ')', z));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setEQ(z);
        }
        Logging.e(TAG, "Built-in audio effects are not supported on this platform");
        return false;
    }

    private boolean enableBuiltInLE(boolean z) {
        Logging.d(TAG, 0Pz.A0R("enableBuiltInLE(", ')', z));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setLE(z);
        }
        Logging.e(TAG, "Built-in audio effects are not supported on this platform");
        return false;
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    public static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.A00();
        Logging.d(TAG, "getStreamMaxVolume");
        assertTrue(AnonymousClass001.A1T(this.audioManager));
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.A00();
        Logging.d(TAG, "getStreamVolume");
        assertTrue(AnonymousClass001.A1T(this.audioManager));
        return this.audioManager.getStreamVolume(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int initPlayout(int r302, int r303, double r304, boolean r306, int r307) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioTrack.initPlayout(int, int, double, boolean, int):int");
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        Logging.d(TAG, 0Pz.A0T("AudioTrack: buffer capacity in frames: ", this.audioTrack.getBufferCapacityInFrames()));
    }

    private void logBufferSizeInFrames() {
        Logging.d(TAG, 0Pz.A0T("AudioTrack: buffer size in frames: ", this.audioTrack.getBufferSizeInFrames()));
    }

    private void logMainParameters() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioTrack: session ID: ");
        A0k.append(this.audioTrack.getAudioSessionId());
        A0k.append(", channels: ");
        A0k.append(this.audioTrack.getChannelCount());
        A0k.append(", sample rate: ");
        A0k.append(this.audioTrack.getSampleRate());
        A0k.append(", max gain: ");
        A0k.append(AudioTrack.getMaxVolume());
        Logging.d(TAG, A0k.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        Logging.d(TAG, 0Pz.A0T("underrun count: ", this.audioTrack.getUnderrunCount()));
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i, long j);

    private native void nativeReportWebRtcAudioTrackError(String str, long j);

    private native void nativeReportWebRtcAudioTrackInitError(String str, long j);

    private native void nativeReportWebRtcAudioTrackStartError(String str, String str2, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeReportWebRtcTrackLatencyInMs(int i, long j);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, 0Pz.A0W("Run-time playback error: ", str));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackError(0Pz.A0W("Run-time playback error: ", str), this.nativeAudioTrack);
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, 0Pz.A0W("Init playout error: ", str));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackInitError(0Pz.A0W("Init playout error: ", str), this.nativeAudioTrack);
    }

    private void reportWebRtcAudioTrackStartError(KMZ kmz, String str) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Start playout error: ");
        A0k.append(kmz);
        Logging.e(TAG, 1BL.A0u(". ", str, A0k));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackStartError(kmz.toString(), 0Pz.A0W("Start playout error: ", str), this.nativeAudioTrack);
    }

    public static void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            Logging.w(TAG, 0Pz.A0C(DEFAULT_USAGE, i, "Default usage attribute is changed from: ", " to "));
            usageAttribute = i;
        }
    }

    private boolean setBuiltInEQPreset(int i) {
        Logging.d(TAG, JQz.A0p("setBuiltInEQPreset(", i));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setBuiltInEQPreset(i);
        }
        Logging.e(TAG, "Built-in audio effects are not supported on this platform");
        return false;
    }

    private boolean setBuiltInLEGainDb(int i) {
        Logging.d(TAG, JQz.A0p("setBuiltInLEGainDb(", i));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setBuiltInLEGainDb(i);
        }
        Logging.e(TAG, "Built-in audio effects are not supported on this platform");
        return false;
    }

    public static void setErrorCallback(MDq mDq) {
        Logging.d(TAG, "Set extended error callback");
        errorCallback = mDq;
    }

    public static void setErrorCallback(MDr mDr) {
        Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = mDr;
    }

    public static void setSpeakerMute(boolean z) {
        Logging.w(TAG, 0Pz.A19("setSpeakerMute(", ")", z));
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.A00();
        Logging.d(TAG, 0Pz.A0d("setStreamVolume(", ")", i));
        assertTrue(AnonymousClass001.A1T(this.audioManager));
        if (this.audioManager.isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.A00();
        Logging.d(TAG, "startPlayout");
        assertTrue(AnonymousClass001.A1T(this.audioTrack));
        assertTrue(AnonymousClass001.A1U(this.audioThread));
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(KMZ.A02, 0Pz.A0T("AudioTrack.play failed - incorrect state :", this.audioTrack.getPlayState()));
                releaseAudioResources();
                return false;
            }
            Lxc lxc = new Lxc(this);
            this.audioThread = lxc;
            lxc.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(KMZ.A01, 0Pz.A1B("AudioTrack.play failed: ", e));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.A00();
        Logging.d(TAG, "stopPlayout");
        assertTrue(AnonymousClass001.A1T(this.audioThread));
        logUnderrunCount();
        Lxc lxc = this.audioThread;
        Logging.d(TAG, "stopThread");
        lxc.A00 = false;
        Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }
}
