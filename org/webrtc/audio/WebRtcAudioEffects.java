package org.webrtc.audio;

import X.0Pz;
import X.AnonymousClass001;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;
import org.webrtc.Logging;

/* loaded from: WebRtcAudioEffects.class */
public class WebRtcAudioEffects {
    public static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioEffectsExternal";
    public static AudioEffect.Descriptor[] cachedEffects;
    public AcousticEchoCanceler aec;
    public NoiseSuppressor ns;
    public boolean shouldEnableAec;
    public boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        Logging.d(TAG, 0Pz.A0W("ctor", WebRtcAudioUtils.getThreadInfo()));
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0J("Expected condition to be true");
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        boolean z = false;
        if ((AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported())) {
            z = true;
        }
        return z;
    }

    public static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr == null) {
            descriptorArr = AudioEffect.queryEffects();
            cachedEffects = descriptorArr;
        }
        return descriptorArr;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    public static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        boolean z = false;
        if (availableEffects != null) {
            int length = availableEffects.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                AudioEffect.Descriptor descriptor = availableEffects[i2];
                if (descriptor.type.equals(uuid)) {
                    z = !descriptor.uuid.equals(uuid2);
                    break;
                }
                i = i2 + 1;
            }
        }
        return z;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0073, code lost:
    
        if (isAcousticEchoCancelerSupported() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void enable(int r302) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioEffects.enable(int):void");
    }

    public void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        Logging.d(TAG, 0Pz.A19("setAEC(", ")", z));
        if (!isAcousticEchoCancelerSupported()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        }
        Logging.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z) {
        Logging.d(TAG, 0Pz.A19("setNS(", ")", z));
        if (!isNoiseSuppressorSupported()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        }
        Logging.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
