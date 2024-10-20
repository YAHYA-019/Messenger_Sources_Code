package org.webrtc.voiceengine;

import X.0Pz;
import X.7zK;
import X.AnonymousClass001;
import X.GOn;
import X.JQx;
import X.JQy;
import X.JQz;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* loaded from: WebRtcAudioUtils.class */
public final class WebRtcAudioUtils {
    public static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    public static final String TAG = "WebRtcAudioUtils";
    public static int defaultSampleRateHz = 16000;
    public static boolean isDefaultSampleRateOverridden;
    public static boolean useWebRtcBasedAcousticEchoCanceler;
    public static boolean useWebRtcBasedNoiseSuppressor;
    public static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    public static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    public static final String[] BLACKLISTED_NS_MODELS = new String[0];

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static String deviceTypeToString(int i) {
        return JQz.A0k(i);
    }

    public static List getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static int getDefaultSampleRateHz() {
        int i;
        synchronized (WebRtcAudioUtils.class) {
            i = defaultSampleRateHz;
        }
        return i;
    }

    public static String getThreadInfo() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("@[name=");
        Thread currentThread = Thread.currentThread();
        A0k.append(currentThread.getName());
        A0k.append(", id=");
        A0k.append(currentThread.getId());
        return AnonymousClass001.A0d("]", A0k);
    }

    public static boolean hasMicrophone() {
        return ContextUtils.applicationContext.getPackageManager().hasSystemFeature(7zK.A00(82));
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static boolean isDefaultSampleRateOverridden() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = isDefaultSampleRateOverridden;
        }
        return z;
    }

    public static boolean isDynamicsProcessingSupported() {
        return WebRtcAudioEffects.canUseDynamicsProcessing();
    }

    public static boolean isEqualizerSupported() {
        return WebRtcAudioEffects.canUseEqualizer();
    }

    public static boolean isLoudnessEnhancerSupported() {
        return WebRtcAudioEffects.canUseLoudnessEnhancer();
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    public static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    public static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        int length = devices.length;
        if (length != 0) {
            Logging.d(str, "Audio Devices: ");
            int i = 0;
            do {
                AudioDeviceInfo audioDeviceInfo = devices[i];
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("  ");
                A0k.append(JQz.A0k(audioDeviceInfo.getType()));
                A0k.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    A0k.append("channels=");
                    JQy.A1U(A0k, audioDeviceInfo.getChannelCounts());
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    A0k.append("encodings=");
                    JQy.A1U(A0k, audioDeviceInfo.getEncodings());
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    A0k.append("sample rates=");
                    JQy.A1U(A0k, audioDeviceInfo.getSampleRates());
                }
                A0k.append("id=");
                Logging.d(str, GOn.A1B(A0k, audioDeviceInfo.getId()));
                i++;
            } while (i < length);
        }
    }

    public static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager A0T = JQx.A0T(ContextUtils.applicationContext);
        logAudioStateBasic(str, A0T);
        logAudioStateVolume(str, A0T);
        logAudioDeviceInfo(str, A0T);
    }

    public static void logAudioStateBasic(String str, AudioManager audioManager) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Audio State: audio mode: ");
        A0k.append(modeToString(audioManager.getMode()));
        A0k.append(", has mic: ");
        JQz.A14(audioManager, str, A0k, hasMicrophone());
    }

    public static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        boolean isVolumeFixed = audioManager.isVolumeFixed();
        Logging.d(str, 0Pz.A1C("  fixed volume=", isVolumeFixed));
        if (isVolumeFixed) {
            return;
        }
        int i = 0;
        do {
            int i2 = iArr[i];
            StringBuilder A0k = AnonymousClass001.A0k();
            JQz.A1M(JQz.A0j(i2), audioManager, i2, A0k);
            logIsStreamMute(str, audioManager, i2, A0k);
            Logging.d(str, A0k.toString());
            i++;
        } while (i < 6);
    }

    public static void logDeviceInfo(String str) {
        StringBuilder A0k = AnonymousClass001.A0k();
        JQz.A1P(A0k);
        JQy.A1R(Build.PRODUCT, str, A0k);
    }

    public static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        sb.append(", muted=");
        sb.append(audioManager.isStreamMute(i));
    }

    public static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (android.os.Build.BRAND.startsWith("generic_") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean runningOnEmulator() {
        /*
            java.lang.String r0 = android.os.Build.HARDWARE
            r301 = r0
            java.lang.String r0 = "goldfish"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L26
            java.lang.String r0 = android.os.Build.BRAND
            r301 = r0
            java.lang.String r0 = "generic_"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2a
        L26:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L2a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioUtils.runningOnEmulator():boolean");
    }

    public static void setDefaultSampleRateHz(int i) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i;
        }
    }

    public static void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z;
        }
    }

    public static void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            Logging.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z;
        }
    }

    public static String streamTypeToString(int i) {
        return JQz.A0j(i);
    }

    public static boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            z = useWebRtcBasedAcousticEchoCanceler;
        }
        return z;
    }

    public static boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static boolean useWebRtcBasedNoiseSuppressor() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            z = useWebRtcBasedNoiseSuppressor;
        }
        return z;
    }
}
