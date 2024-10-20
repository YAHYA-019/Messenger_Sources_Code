package androidx.media;

import X.L5P;

/* loaded from: AudioAttributesImplBaseParcelizer.class */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(L5P l5p) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.A03 = l5p.A01(audioAttributesImplBase.A03, 1);
        audioAttributesImplBase.A00 = l5p.A01(audioAttributesImplBase.A00, 2);
        audioAttributesImplBase.A01 = l5p.A01(audioAttributesImplBase.A01, 3);
        audioAttributesImplBase.A02 = l5p.A01(audioAttributesImplBase.A02, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, L5P l5p) {
        l5p.A06(audioAttributesImplBase.A03, 1);
        l5p.A06(audioAttributesImplBase.A00, 2);
        l5p.A06(audioAttributesImplBase.A01, 3);
        l5p.A06(audioAttributesImplBase.A02, 4);
    }
}
