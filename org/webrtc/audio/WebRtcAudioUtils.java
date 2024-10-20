package org.webrtc.audio;

import X.0Pz;
import X.7zK;
import X.AnonymousClass001;
import X.GOn;
import X.JQy;
import X.JQz;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import org.webrtc.Logging;

/* loaded from: WebRtcAudioUtils.class */
public final class WebRtcAudioUtils {
    public static final String TAG = "WebRtcAudioUtilsExternal";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    public static String audioEncodingToString(int i) {
        if (i == 0) {
            return "INVALID";
        }
        String str = "AC3";
        switch (i) {
            case 2:
                return "PCM_16BIT";
            case 3:
                return "PCM_8BIT";
            case 4:
                return "PCM_FLOAT";
            case 5:
            case 6:
                return str;
            case 7:
                return "DTS";
            case 8:
                return "DTS_HD";
            case 9:
                return "MP3";
            default:
                str = 0Pz.A0T("Invalid encoding: ", i);
                return str;
        }
    }

    public static String audioSourceToString(int i) {
        switch (i) {
            case 0:
                return "DEFAULT";
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    public static String channelMaskToString(int i) {
        return i != 12 ? i != 16 ? "INVALID" : "IN_MONO" : "IN_STEREO";
    }

    public static String deviceTypeToString(int i) {
        return JQz.A0k(i);
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

    public static boolean hasMicrophone(Context context) {
        return context.getPackageManager().hasSystemFeature(7zK.A00(82));
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

    public static void logAudioState(String str, Context context, AudioManager audioManager) {
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    public static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Audio State: audio mode: ");
        A0k.append(modeToString(audioManager.getMode()));
        A0k.append(", has mic: ");
        JQz.A14(audioManager, str, A0k, hasMicrophone(context));
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
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioUtils.runningOnEmulator():boolean");
    }

    public static String streamTypeToString(int i) {
        return JQz.A0j(i);
    }
}
