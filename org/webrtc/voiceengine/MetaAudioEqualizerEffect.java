package org.webrtc.voiceengine;

import X.0Pz;
import X.AnonymousClass001;
import X.GOn;
import X.JQx;
import X.JQy;
import X.KgE;
import android.media.audiofx.Equalizer;
import java.lang.reflect.Array;
import org.webrtc.Logging;

/* loaded from: MetaAudioEqualizerEffect.class */
public class MetaAudioEqualizerEffect {
    public static final String TAG = "MetaAudioEqualizerEffect";
    public Equalizer eq;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [int] */
    public MetaAudioEqualizerEffect(int i, KgE kgE) {
        if (WebRtcAudioEffects.canUseEqualizer()) {
            try {
                this.eq = new Equalizer(0, i);
            } catch (Exception e) {
                Logging.e(TAG, "MetaAudioEqualizerEffect failed to create Equalizer object", e);
                this.eq = null;
            } catch (NoClassDefFoundError e2) {
                Logging.e(TAG, "MetaAudioEqualizerEffect creation encountered NoClassDefFoundError", e2);
            }
            Equalizer equalizer = this.eq;
            if (equalizer != null) {
                int numberOfPresets = equalizer.getNumberOfPresets();
                JQx.A1O("Equalizer: Number of presets: ", numberOfPresets, TAG);
                String[] strArr = new String[numberOfPresets];
                for (int i2 = 0; i2 < numberOfPresets; i2++) {
                    strArr[i2] = this.eq.getPresetName((short) i2);
                    Logging.d(TAG, 0Pz.A0W("Equalizer: Preset names: ", strArr[i2]));
                }
                if (kgE != null) {
                    short s = (short) kgE.A00;
                    if (s >= 0 && s < numberOfPresets) {
                        this.eq.usePreset(s);
                        JQx.A1O("Equalizer current preset: ", this.eq.getCurrentPreset(), TAG);
                    }
                } else {
                    Logging.e(TAG, "Equalizer config is null!");
                }
                short numberOfBands = this.eq.getNumberOfBands();
                JQx.A1O("Equalizer: Number of freq bands: ", numberOfBands, TAG);
                int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, numberOfBands, 2);
                for (short s2 = 0; s2 < numberOfBands; s2++) {
                    short s3 = s2;
                    iArr[s2] = this.eq.getBandFreqRange(s3);
                    short[] bandLevelRange = this.eq.getBandLevelRange();
                    this.eq.setBandLevel(s3, (short) -1000);
                    short bandLevel = this.eq.getBandLevel(s3);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Equalizer: Frequency range for band ");
                    A0k.append((int) s2);
                    A0k.append(" is: ");
                    int[] iArr2 = iArr[s2];
                    A0k.append(iArr2[0] / 1000);
                    A0k.append(" Hz, ");
                    A0k.append(iArr2[1] / 1000);
                    A0k.append(" Hz band level(dB): ");
                    A0k.append(bandLevel / 100);
                    A0k.append(" band level range(dB): ");
                    A0k.append(bandLevelRange[0] / 100);
                    A0k.append(" dB, ");
                    Logging.d(TAG, GOn.A1B(A0k, bandLevelRange[1] / 100));
                }
            }
        }
    }

    public void enable(boolean z) {
        synchronized (this) {
            Equalizer equalizer = this.eq;
            if (equalizer != null) {
                boolean enabled = equalizer.getEnabled();
                if (this.eq.setEnabled(z) != 0) {
                    Logging.e(TAG, "Failed to set the Equalizer state");
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Equalizer: was ");
                JQy.A1T(enabled ? "enabled" : "disabled", A0k, z);
                JQy.A1R(this.eq.getEnabled() ? "enabled" : "disabled", TAG, A0k);
            }
        }
    }

    public void release() {
        synchronized (this) {
            Equalizer equalizer = this.eq;
            if (equalizer != null) {
                equalizer.release();
                this.eq = null;
            }
        }
    }
}
