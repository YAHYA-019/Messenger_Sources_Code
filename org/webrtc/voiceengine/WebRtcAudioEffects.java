package org.webrtc.voiceengine;

import X.0Pz;
import X.AnonymousClass001;
import X.JQx;
import X.KgE;
import X.KgF;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.webrtc.Logging;

/* loaded from: WebRtcAudioEffects.class */
public class WebRtcAudioEffects {
    public static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioEffects";
    public static AudioEffect.Descriptor[] cachedEffects;
    public static volatile MetaAudioDynamicsProcessingEffect dp;
    public static volatile MetaAudioEqualizerEffect eq;
    public static volatile MetaAudioLoudnessEnhancerEffect le;
    public AcousticEchoCanceler aec;
    public KgE eqConfig = new Object();
    public KgF leConfig = new Object();
    public NoiseSuppressor ns;
    public boolean shouldEnableAec;
    public boolean shouldEnableDp;
    public boolean shouldEnableEq;
    public boolean shouldEnableLe;
    public boolean shouldEnableNs;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.KgE] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.KgF] */
    public WebRtcAudioEffects() {
        Logging.d(TAG, JQx.A0x("ctor"));
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0J("Expected condition to be true");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (isAcousticEchoCancelerExcludedByUUID() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean canUseAcousticEchoCanceler() {
        /*
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC
            r301 = r0
            r0 = r301
            boolean r0 = isEffectTypeAvailable(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L27
            boolean r0 = org.webrtc.voiceengine.WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L27
            boolean r0 = isAcousticEchoCancelerBlacklisted()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L27
            boolean r0 = isAcousticEchoCancelerExcludedByUUID()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L29
        L27:
            r0 = 0
            r303 = r0
        L29:
            java.lang.String r0 = "canUseAcousticEchoCanceler: "
            r1 = r303
            java.lang.String r0 = X.0Pz.A1C(r0, r1)
            r304 = r0
            java.lang.String r0 = "WebRtcAudioEffects"
            r1 = r304
            org.webrtc.Logging.d(r0, r1)
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.canUseAcousticEchoCanceler():boolean");
    }

    public static boolean canUseDynamicsProcessing() {
        boolean isEffectTypeAvailable = isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
        Logging.d(TAG, 0Pz.A1C("canUseDynamicsProcessing: ", isEffectTypeAvailable));
        return isEffectTypeAvailable;
    }

    public static boolean canUseEqualizer() {
        boolean isEffectTypeAvailable = isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_EQUALIZER);
        Logging.d(TAG, 0Pz.A1C("canUseEqualizer: ", isEffectTypeAvailable));
        return isEffectTypeAvailable;
    }

    public static boolean canUseLoudnessEnhancer() {
        boolean isEffectTypeAvailable = isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
        Logging.d(TAG, 0Pz.A1C("canUseLoudnessEnhancer: ", isEffectTypeAvailable));
        return isEffectTypeAvailable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (isNoiseSuppressorExcludedByUUID() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean canUseNoiseSuppressor() {
        /*
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_NS
            r301 = r0
            r0 = r301
            boolean r0 = isEffectTypeAvailable(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L27
            boolean r0 = org.webrtc.voiceengine.WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L27
            boolean r0 = isNoiseSuppressorBlacklisted()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L27
            boolean r0 = isNoiseSuppressorExcludedByUUID()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L29
        L27:
            r0 = 0
            r303 = r0
        L29:
            java.lang.String r0 = "canUseNoiseSuppressor: "
            r1 = r303
            java.lang.String r0 = X.0Pz.A1C(r0, r1)
            r304 = r0
            java.lang.String r0 = "WebRtcAudioEffects"
            r1 = r304
            org.webrtc.Logging.d(r0, r1)
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.canUseNoiseSuppressor():boolean");
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (isEffectTypeAvailable(r0) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean effectTypeIsVoIP(java.util.UUID r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L1d
            r0 = r304
            boolean r0 = isEffectTypeAvailable(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L38
        L1d:
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_NS
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3a
            r0 = r304
            boolean r0 = isEffectTypeAvailable(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3a
        L38:
            r0 = 1
            r303 = r0
        L3a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.effectTypeIsVoIP(java.util.UUID):boolean");
    }

    public static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr == null) {
            descriptorArr = AudioEffect.queryEffects();
            cachedEffects = descriptorArr;
        }
        return descriptorArr;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List asList = Arrays.asList(WebRtcAudioUtils.BLACKLISTED_AEC_MODELS);
        String str = Build.MODEL;
        boolean contains = asList.contains(str);
        if (contains) {
            Logging.w(TAG, 0Pz.A0W(str, " is blacklisted for HW AEC usage!"));
        }
        return contains;
    }

    public static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean isAcousticEchoCancelerExcludedByUUID() {
        boolean z = false;
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        int length = availableEffects.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            AudioEffect.Descriptor descriptor = availableEffects[i2];
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean isDynamicsProcessingEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
    }

    public static boolean isDynamicsProcessingSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
    }

    public static boolean isEffectTypeAvailable(UUID uuid) {
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
                if (availableEffects[i2].type.equals(uuid)) {
                    z = true;
                    break;
                }
                i = i2 + 1;
            }
        }
        return z;
    }

    public static boolean isEqualizerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_EQUALIZER);
    }

    public static boolean isEqualizerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_EQUALIZER);
    }

    public static boolean isLoudnessEnhancerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
    }

    public static boolean isLoudnessEnhancerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List asList = Arrays.asList(WebRtcAudioUtils.BLACKLISTED_NS_MODELS);
        String str = Build.MODEL;
        boolean contains = asList.contains(str);
        if (contains) {
            Logging.w(TAG, 0Pz.A0W(str, " is blacklisted for HW NS usage!"));
        }
        return contains;
    }

    public static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    public static boolean isNoiseSuppressorExcludedByUUID() {
        boolean z = false;
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        int length = availableEffects.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            AudioEffect.Descriptor descriptor = availableEffects[i2];
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    public static void toggleAudioPlayerEffects(boolean z) {
        Logging.d(TAG, 0Pz.A1C("toggleAudioPlayerEffects to ", z));
        try {
            if (dp != null) {
                dp.enable(z);
            }
            if (eq != null) {
                eq.enable(z);
            }
            if (le != null) {
                le.enable(z);
            }
        } catch (Exception e) {
            Logging.e(TAG, "Failed to toggle audio effects for the player", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x026e, code lost:
    
        if (canUseAcousticEchoCanceler() == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (canUseEqualizer() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010d, code lost:
    
        if (canUseLoudnessEnhancer() == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void enable(int r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.enable(int, boolean):void");
    }

    public void release() {
        synchronized (this) {
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
            if (eq != null) {
                eq.release();
                eq = null;
            }
            if (le != null) {
                le.release();
                le = null;
            }
            if (dp != null) {
                dp.release();
                dp = null;
            }
        }
    }

    public boolean setAEC(boolean z) {
        Logging.d(TAG, 0Pz.A19("setAEC(", ")", z));
        if (!canUseAcousticEchoCanceler()) {
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

    public boolean setBuiltInEQPreset(int i) {
        if (canUseEqualizer()) {
            this.eqConfig.A00 = i;
            return true;
        }
        Logging.w(TAG, "Platform EQ is not supported");
        this.shouldEnableEq = false;
        return false;
    }

    public boolean setBuiltInLEGainDb(int i) {
        if (canUseLoudnessEnhancer()) {
            this.leConfig.A00 = i;
            return true;
        }
        Logging.w(TAG, "Platform LE is not supported");
        this.shouldEnableLe = false;
        return false;
    }

    public boolean setDP(boolean z) {
        Logging.d(TAG, 0Pz.A19("setDP(", ")", z));
        if (!canUseDynamicsProcessing()) {
            Logging.w(TAG, "Platform DP is not supported");
            this.shouldEnableDp = false;
            return false;
        }
        if (dp == null || z == this.shouldEnableDp) {
            this.shouldEnableDp = z;
            return true;
        }
        Logging.e(TAG, "Platform DP state can't be modified while playing");
        return false;
    }

    public boolean setEQ(boolean z) {
        Logging.d(TAG, 0Pz.A19("setEQ(", ")", z));
        if (!canUseEqualizer()) {
            Logging.w(TAG, "Platform EQ is not supported");
            this.shouldEnableEq = false;
            return false;
        }
        if (eq == null || z == this.shouldEnableEq) {
            this.shouldEnableEq = z;
            return true;
        }
        Logging.e(TAG, "Platform EQ state can't be modified while playing");
        return false;
    }

    public boolean setLE(boolean z) {
        Logging.d(TAG, 0Pz.A19("setLE(", ")", z));
        if (!canUseLoudnessEnhancer()) {
            Logging.w(TAG, "Platform LE is not supported");
            this.shouldEnableLe = false;
            return false;
        }
        if (le == null || z == this.shouldEnableLe) {
            this.shouldEnableLe = z;
            return true;
        }
        Logging.e(TAG, "Platform LE state can't be modified while playing");
        return false;
    }

    public boolean setNS(boolean z) {
        Logging.d(TAG, 0Pz.A19("setNS(", ")", z));
        if (!canUseNoiseSuppressor()) {
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
