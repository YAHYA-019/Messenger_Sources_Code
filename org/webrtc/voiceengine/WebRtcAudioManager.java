package org.webrtc.voiceengine;

import X.0Pz;
import X.1BJ;
import X.AnonymousClass001;
import X.JQx;
import X.KiM;
import X.Lyj;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.Timer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.audio.VolumeLogger;

/* loaded from: WebRtcAudioManager.class */
public class WebRtcAudioManager {
    public static final int BITS_PER_SAMPLE = 16;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_FRAME_PER_BUFFER = 256;
    public static final String TAG = "WebRtcAudioManager";
    public static final boolean blacklistDeviceForAAudioUsage = true;
    public static boolean blacklistDeviceForOpenSLESUsage;
    public static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    public static boolean useStereoInput;
    public static boolean useStereoOutput;
    public boolean aAudio;
    public final AudioManager audioManager;
    public boolean hardwareAEC;
    public boolean hardwareAGC;
    public boolean hardwareDP;
    public boolean hardwareEQ;
    public boolean hardwareLE;
    public boolean hardwareNS;
    public boolean initialized;
    public int inputBufferSize;
    public int inputChannels;
    public boolean lowLatencyInput;
    public boolean lowLatencyOutput;
    public final long nativeAudioManager;
    public int nativeChannels;
    public int nativeSampleRate;
    public int outputBufferSize;
    public int outputChannels;
    public boolean proAudio;
    public int sampleRate;
    public final KiM volumeLogger;

    public WebRtcAudioManager(long j) {
        Logging.d(TAG, JQx.A0x("ctor"));
        this.nativeAudioManager = j;
        AudioManager A0T = JQx.A0T(ContextUtils.applicationContext);
        this.audioManager = A0T;
        this.volumeLogger = new KiM(A0T);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.hardwareEQ, this.hardwareLE, this.hardwareDP, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0J("Expected condition to be true");
        }
    }

    private void dispose() {
        KiM kiM;
        Timer timer;
        Logging.d(TAG, JQx.A0x("dispose"));
        if (!this.initialized || (timer = (kiM = this.volumeLogger).A00) == null) {
            return;
        }
        timer.cancel();
        kiM.A00 = null;
    }

    private void enableCommunicationMode() {
        this.audioManager.setMode(3);
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(AnonymousClass001.A1N(isLowLatencyOutputSupported() ? 1 : 0));
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        int i = 256;
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
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

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.d(TAG, 0Pz.A0d("Default sample rate is overriden to ", " Hz", WebRtcAudioUtils.getDefaultSampleRateHz()));
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel();
        Logging.d(TAG, 0Pz.A0d("Sample rate is set to ", " Hz", sampleRateForApiLevel));
        return sampleRateForApiLevel;
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.applicationContext.getPackageManager().hasSystemFeature(1BJ.A00(945));
    }

    private boolean init() {
        Logging.d(TAG, JQx.A0x("init"));
        if (!this.initialized) {
            Logging.d(TAG, 0Pz.A0W("audio mode is: ", WebRtcAudioUtils.modeToString(this.audioManager.getMode())));
            this.initialized = true;
            KiM kiM = this.volumeLogger;
            Timer timer = new Timer(VolumeLogger.THREAD_NAME);
            kiM.A00 = timer;
            AudioManager audioManager = kiM.A01;
            timer.schedule(new Lyj(kiM, audioManager.getStreamMaxVolume(2), audioManager.getStreamMaxVolume(0)), 0L, LocationComponentOptions.STALE_STATE_DELAY_MS);
        }
        return true;
    }

    private boolean isAAudioSupported() {
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        return AnonymousClass001.A1Q(this.audioManager.getMode(), 3);
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (deviceIsBlacklistedForOpenSLESUsage) {
            Logging.d(TAG, 0Pz.A0W(Build.MODEL, " is blacklisted for OpenSL ES usage!"));
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    public static boolean isDynamicsProcessingSupported() {
        Logging.w(TAG, 0Pz.A1C("isDynamicsProcessingSupported() ", WebRtcAudioEffects.canUseDynamicsProcessing()));
        return WebRtcAudioEffects.canUseDynamicsProcessing();
    }

    public static boolean isEqualizerSupported() {
        Logging.w(TAG, 0Pz.A1C("isEqualizerSupported() ", WebRtcAudioEffects.canUseEqualizer()));
        return WebRtcAudioEffects.canUseEqualizer();
    }

    public static boolean isLoudnessEnhancerSupported() {
        Logging.w(TAG, 0Pz.A1C("isLoudnessEnhancerSupported() ", WebRtcAudioEffects.canUseLoudnessEnhancer()));
        return WebRtcAudioEffects.canUseLoudnessEnhancer();
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.applicationContext.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        return AnonymousClass001.A1N(ContextUtils.applicationContext.getPackageManager().hasSystemFeature("android.hardware.audio.pro") ? 1 : 0);
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i4, int i5, long j);

    public static void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            Logging.w(TAG, 0Pz.A0R("Overriding default input behavior: setStereoInput(", ')', z));
            useStereoInput = z;
        }
    }

    public static void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            Logging.w(TAG, 0Pz.A0R("Overriding default output behavior: setStereoOutput(", ')', z));
            useStereoOutput = z;
        }
    }

    private void storeAudioParameters() {
        int i = 2;
        int i2 = 1;
        if (getStereoOutput()) {
            i2 = 2;
        }
        this.outputChannels = i2;
        if (!getStereoInput()) {
            i = 1;
        }
        this.inputChannels = i;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = WebRtcAudioEffects.canUseAcousticEchoCanceler();
        this.hardwareAGC = false;
        this.hardwareNS = WebRtcAudioEffects.canUseNoiseSuppressor();
        this.hardwareEQ = isEqualizerSupported();
        this.hardwareLE = isLoudnessEnhancerSupported();
        this.hardwareDP = isDynamicsProcessingSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = AnonymousClass001.A1N(isLowLatencyOutputSupported() ? 1 : 0);
        this.proAudio = isProAudioSupported();
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        this.aAudio = false;
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
    }

    public boolean isLowLatencyInputSupported() {
        return AnonymousClass001.A1N(isLowLatencyOutputSupported() ? 1 : 0);
    }
}
