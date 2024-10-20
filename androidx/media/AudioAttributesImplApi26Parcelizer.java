package androidx.media;

import X.L5P;
import android.media.AudioAttributes;

/* loaded from: AudioAttributesImplApi26Parcelizer.class */
public class AudioAttributesImplApi26Parcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media.AudioAttributesImplApi26, androidx.media.AudioAttributesImplApi21] */
    public static AudioAttributesImplApi26 read(L5P l5p) {
        ?? audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) l5p.A02(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = l5p.A01(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, L5P l5p) {
        l5p.A07(audioAttributesImplApi26.A01, 1);
        l5p.A06(audioAttributesImplApi26.A00, 2);
    }
}
