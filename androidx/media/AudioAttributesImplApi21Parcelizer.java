package androidx.media;

import X.L5P;
import android.media.AudioAttributes;

/* loaded from: AudioAttributesImplApi21Parcelizer.class */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(L5P l5p) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) l5p.A02(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = l5p.A01(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, L5P l5p) {
        l5p.A07(audioAttributesImplApi21.A01, 1);
        l5p.A06(audioAttributesImplApi21.A00, 2);
    }
}
