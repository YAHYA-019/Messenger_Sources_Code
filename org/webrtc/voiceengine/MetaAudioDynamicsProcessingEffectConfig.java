package org.webrtc.voiceengine;

import X.0Pz;
import X.JQx;
import android.media.audiofx.DynamicsProcessing;
import org.webrtc.Logging;

/* loaded from: MetaAudioDynamicsProcessingEffectConfig.class */
public class MetaAudioDynamicsProcessingEffectConfig {
    public static final int CONFIG_CHANNEL_COUNT = 1;
    public static final int CONFIG_DEFAULT_MBC_BANDS = 8;
    public static final int CONFIG_DEFAULT_POSTEQ_BANDS = 8;
    public static final int CONFIG_DEFAULT_PREEQ_BANDS = 8;
    public static final boolean CONFIG_DEFAULT_USE_LIMITER = true;
    public static final boolean CONFIG_DEFAULT_USE_MBC = true;
    public static final boolean CONFIG_DEFAULT_USE_POSTEQ = true;
    public static final boolean CONFIG_DEFAULT_USE_PREEQ = true;
    public static final int CONFIG_DEFAULT_VARIANT = 0;
    public static final String TAG = "MetaAudioDynamicsProcessingEffectConfig";
    public static DynamicsProcessing.Config config;
    public DynamicsProcessing.Config.Builder builder;
    public final long nativeDynamicsProcessingEffectConfig;

    public MetaAudioDynamicsProcessingEffectConfig(long j) {
        Logging.d(TAG, JQx.A0x("ctor"));
        this.nativeDynamicsProcessingEffectConfig = j;
        if (WebRtcAudioEffects.canUseDynamicsProcessing()) {
            try {
                DynamicsProcessing.Config.Builder builder = new DynamicsProcessing.Config.Builder(0, 1, true, 8, true, 8, true, 8, true);
                this.builder = builder;
                builder.setPreferredFrameDuration(10.0f);
                config = this.builder.build();
            } catch (Exception e) {
                Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to create the default config", e);
                reportDynamicProcessingEffectConfigInitError("MetaAudioDynamicsProcessingEffectConfig init failed");
            } catch (NoClassDefFoundError e2) {
                Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig creation encountered NoClassDefFoundError", e2);
            }
        }
    }

    public static DynamicsProcessing.Config getConfig() {
        return config;
    }

    private native void nativeReportDynamicProcessingEffectConfigInitError(String str, long j);

    private void reportDynamicProcessingEffectConfigInitError(String str) {
        Logging.e(TAG, 0Pz.A0W("Config creation error: ", str));
        nativeReportDynamicProcessingEffectConfigInitError(0Pz.A0W("DP config creation error: ", str), this.nativeDynamicsProcessingEffectConfig);
    }

    public boolean setLimiterAttackTime(float f) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter attack time failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setAttackTime(f);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter attack time", e);
            return false;
        }
    }

    public boolean setLimiterEnabled(boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set limiter enabled state failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setEnabled(z);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter enabled state", e);
            return false;
        }
    }

    public boolean setLimiterLinkGroup(int i) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter link group failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setLinkGroup(i);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter link group", e);
            return false;
        }
    }

    public boolean setLimiterPostGain(float f) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter post-gain failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setPostGain(f);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter post gain", e);
            return false;
        }
    }

    public boolean setLimiterRatio(float f) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter ratio failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setRatio(f);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter ratio", e);
            return false;
        }
    }

    public boolean setLimiterReleaseTime(float f) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter release time failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setReleaseTime(f);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter release time", e);
            return false;
        }
    }

    public boolean setLimiterThreshold(float f) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter threshold failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setThreshold(f);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter threshold", e);
            return false;
        }
    }

    public boolean setMbcAttackTime(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC attack time failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setAttackTime(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setAttackTime(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC attack time", e);
            return false;
        }
    }

    public boolean setMbcEnabled(boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC enabled state failed due to null config");
            return false;
        }
        try {
            JQx.A0U(config2).setEnabled(z);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC enabled state", e);
            return false;
        }
    }

    public boolean setMbcExpanderRatio(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC expander ratio failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setExpanderRatio(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setExpanderRatio(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC expander ratio", e);
            return false;
        }
    }

    public boolean setMbcKneeWidth(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC kneewidth failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setKneeWidth(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setKneeWidth(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC kneewidth", e);
            return false;
        }
    }

    public boolean setMbcNoiseGateThreshold(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC noise-gate threshold failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setNoiseGateThreshold(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setNoiseGateThreshold(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC noise-gate threshold", e);
            return false;
        }
    }

    public boolean setMbcPostGain(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC post-gain failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setPostGain(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setPostGain(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC post-gain", e);
            return false;
        }
    }

    public boolean setMbcPreGain(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC pre-gain failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setPreGain(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setPreGain(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC pre-gain", e);
            return false;
        }
    }

    public boolean setMbcRatio(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC ratio failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setRatio(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setRatio(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC compression ratio", e);
            return false;
        }
    }

    public boolean setMbcReleaseTime(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC release time failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setReleaseTime(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setReleaseTime(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC release time", e);
            return false;
        }
    }

    public boolean setMbcThreshold(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC threshold failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc A0U = JQx.A0U(config2);
            if (!z) {
                A0U.getBand(i).setThreshold(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= A0U.getBandCount()) {
                    return true;
                }
                A0U.getBand(i2).setThreshold(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC compression threshold", e);
            return false;
        }
    }

    public boolean setPostEqEnabled(boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set postEq enabled state failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getPostEq().setEnabled(z);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set postEq enabled state", e);
            return false;
        }
    }

    public boolean setPostEqGainDb(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set PostEq gain failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Eq postEq = config2.getChannelByChannelIndex(0).getPostEq();
            if (!z) {
                postEq.getBand(i).setGain(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= postEq.getBandCount()) {
                    return true;
                }
                postEq.getBand(i2).setGain(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set postEq gain", e);
            return false;
        }
    }

    public boolean setPreEqEnabled(boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set preEq enabled state failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getPreEq().setEnabled(z);
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set preEq enabled state", e);
            return false;
        }
    }

    public boolean setPreEqGainDb(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set preEq gain failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Eq preEq = config2.getChannelByChannelIndex(0).getPreEq();
            if (!z) {
                preEq.getBand(i).setGain(f);
                return true;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= preEq.getBandCount()) {
                    return true;
                }
                preEq.getBand(i2).setGain(f);
                i2++;
            }
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set preEq gain", e);
            return false;
        }
    }
}
