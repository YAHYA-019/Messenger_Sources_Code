package org.webrtc.voiceengine;

import X.0Pz;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import android.media.audiofx.DynamicsProcessing;
import org.webrtc.Logging;

/* loaded from: MetaAudioDynamicsProcessingEffect.class */
public class MetaAudioDynamicsProcessingEffect {
    public static final String TAG = "MetaAudioDynamicsProcessingEffect";
    public int audioSessionId;
    public DynamicsProcessing dp;

    public MetaAudioDynamicsProcessingEffect(int i, DynamicsProcessing.Config config) {
        String str;
        this.audioSessionId = i;
        if (!WebRtcAudioEffects.canUseDynamicsProcessing()) {
            return;
        }
        try {
            this.dp = new DynamicsProcessing(0, this.audioSessionId, config);
            Logging.d(TAG, "Succeeded in creating DynamicsProcessing effect");
            DynamicsProcessing.Eq preEq = config.getChannelByChannelIndex(0).getPreEq();
            Logging.d(TAG, 0Pz.A1C("PreEQ enabled: ", preEq.isEnabled()));
            int i2 = 0;
            while (true) {
                if (i2 >= preEq.getBandCount()) {
                    break;
                }
                DynamicsProcessing.EqBand band = preEq.getBand(i2);
                StringBuilder A0k = AnonymousClass001.A0k();
                JQy.A1S("PreEQ band ", " cutoff freq: ", A0k, i2);
                A0k.append(band.getCutoffFrequency());
                A0k.append("Hz, gain: ");
                A0k.append(band.getGain());
                JQy.A1R("dB", TAG, A0k);
                i2++;
            }
            DynamicsProcessing.Mbc A0U = JQx.A0U(config);
            Logging.d(TAG, 0Pz.A1C("MBC enabled: ", A0U.isEnabled()));
            int i3 = 0;
            while (true) {
                if (i3 >= A0U.getBandCount()) {
                    break;
                }
                DynamicsProcessing.MbcBand band2 = A0U.getBand(i3);
                StringBuilder A0k2 = AnonymousClass001.A0k();
                JQy.A1S("MBC band ", " cutoff freq: ", A0k2, i3);
                A0k2.append(band2.getCutoffFrequency());
                A0k2.append("Hz, attack time: ");
                A0k2.append(band2.getAttackTime());
                A0k2.append("ms, release time: ");
                A0k2.append(band2.getReleaseTime());
                A0k2.append("ms, threshold: ");
                A0k2.append(band2.getThreshold());
                A0k2.append("dBFS, ratio: ");
                A0k2.append(band2.getRatio());
                A0k2.append(":1, kneewidth: ");
                A0k2.append(band2.getKneeWidth());
                A0k2.append("dB, noise gate threshold:");
                A0k2.append(band2.getNoiseGateThreshold());
                A0k2.append("dBFS, expander ratio: ");
                A0k2.append(band2.getExpanderRatio());
                A0k2.append(":1, pre gain: ");
                A0k2.append(band2.getPreGain());
                A0k2.append("dB, post gain: ");
                A0k2.append(band2.getPostGain());
                JQy.A1R("dB", TAG, A0k2);
                i3++;
            }
            DynamicsProcessing.Eq postEq = config.getChannelByChannelIndex(0).getPostEq();
            Logging.d(TAG, 0Pz.A1C("PostEQ enabled: ", postEq.isEnabled()));
            int i4 = 0;
            while (true) {
                if (i4 >= postEq.getBandCount()) {
                    DynamicsProcessing.Limiter limiter = config.getChannelByChannelIndex(0).getLimiter();
                    Logging.d(TAG, 0Pz.A1C("Limiter enabled: ", limiter.isEnabled()));
                    StringBuilder A0k3 = AnonymousClass001.A0k();
                    A0k3.append("Limiter attack time: ");
                    A0k3.append(limiter.getAttackTime());
                    A0k3.append("ms, release time: ");
                    A0k3.append(limiter.getReleaseTime());
                    A0k3.append("ms, threshold: ");
                    A0k3.append(limiter.getThreshold());
                    A0k3.append("dBFS, post gain: ");
                    A0k3.append(limiter.getPostGain());
                    A0k3.append("dB, ratio: ");
                    A0k3.append(limiter.getRatio());
                    A0k3.append(":1, link group: ");
                    A0k3.append(limiter.getLinkGroup());
                    JQy.A1R("", TAG, A0k3);
                    return;
                }
                DynamicsProcessing.EqBand band3 = postEq.getBand(i4);
                StringBuilder A0k4 = AnonymousClass001.A0k();
                JQy.A1S("PostEQ band ", " cutoff freq: ", A0k4, i4);
                A0k4.append(band3.getCutoffFrequency());
                A0k4.append("Hz, gain: ");
                A0k4.append(band3.getGain());
                JQy.A1R("dB", TAG, A0k4);
                i4++;
            }
        } catch (Exception e) {
            e = e;
            str = "MetaAudioDynamicsProcessingEffect failed to create";
            Logging.e(TAG, str, e);
        } catch (NoClassDefFoundError e2) {
            e = e2;
            str = "MetaAudioDynamicsProcessingEffect creation encountered NoClassDefFoundError";
            Logging.e(TAG, str, e);
        }
    }

    public void enable(boolean z) {
        synchronized (this) {
            DynamicsProcessing dynamicsProcessing = this.dp;
            if (dynamicsProcessing != null) {
                boolean enabled = dynamicsProcessing.getEnabled();
                if (this.dp.setEnabled(z) != 0) {
                    Logging.e(TAG, "Failed to set the DynamicsProcessing state");
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("DynamicsProcessing: was ");
                JQy.A1T(enabled ? "enabled" : "disabled", A0k, z);
                JQy.A1R(this.dp.getEnabled() ? "enabled" : "disabled", TAG, A0k);
            }
        }
    }

    public void release() {
        synchronized (this) {
            DynamicsProcessing dynamicsProcessing = this.dp;
            if (dynamicsProcessing != null) {
                dynamicsProcessing.release();
                this.dp = null;
            }
        }
    }
}
