package org.webrtc.voiceengine;

import X.0Pz;
import X.AnonymousClass001;
import X.JQy;
import X.KgF;
import android.media.audiofx.LoudnessEnhancer;
import org.webrtc.Logging;

/* loaded from: MetaAudioLoudnessEnhancerEffect.class */
public class MetaAudioLoudnessEnhancerEffect {
    public static final String TAG = "MetaAudioLoudnessEnhancerEffect";
    public LoudnessEnhancer le;

    public MetaAudioLoudnessEnhancerEffect(int i, KgF kgF) {
        String str;
        if (WebRtcAudioEffects.canUseLoudnessEnhancer()) {
            try {
                this.le = new LoudnessEnhancer(i);
            } catch (Exception e) {
                Logging.e(TAG, "MetaAudioLoudnessEnhancerEffect failed to create LoudnessEnhancer object", e);
                this.le = null;
            } catch (NoClassDefFoundError e2) {
                Logging.e(TAG, "MetaAudioLoudnessEnhancerEffect creation encountered NoClassDefFoundError", e2);
            }
            LoudnessEnhancer loudnessEnhancer = this.le;
            if (loudnessEnhancer != null) {
                Logging.d(TAG, 0Pz.A0S("LoudnessEnhancer: Prior target gain(dB): ", loudnessEnhancer.getTargetGain() / 100.0f));
                if (kgF != null) {
                    this.le.setTargetGain(kgF.A00 * 100);
                    Logging.d(TAG, 0Pz.A0S("LoudnessEnhancer: Current target gain(dB): ", this.le.getTargetGain() / 100.0f));
                    return;
                }
                str = "LoudnessEnhancer config is null!";
            } else {
                str = "Failed to create LoudnessEnhancer effect!";
            }
            Logging.e(TAG, str);
        }
    }

    public void enable(boolean z) {
        synchronized (this) {
            LoudnessEnhancer loudnessEnhancer = this.le;
            if (loudnessEnhancer != null) {
                boolean enabled = loudnessEnhancer.getEnabled();
                if (this.le.setEnabled(z) != 0) {
                    Logging.e(TAG, "Failed to set the LoudnessEnhancer state");
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("LoudnessEnhancer: was ");
                JQy.A1T(enabled ? "enabled" : "disabled", A0k, z);
                JQy.A1R(this.le.getEnabled() ? "enabled" : "disabled", TAG, A0k);
            }
        }
    }

    public void release() {
        synchronized (this) {
            LoudnessEnhancer loudnessEnhancer = this.le;
            if (loudnessEnhancer != null) {
                loudnessEnhancer.release();
                this.le = null;
            }
        }
    }
}
