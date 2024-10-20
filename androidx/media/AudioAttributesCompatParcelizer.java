package androidx.media;

import X.4iR;
import X.L5P;

/* loaded from: AudioAttributesCompatParcelizer.class */
public class AudioAttributesCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static AudioAttributesCompat read(L5P l5p) {
        ?? obj = new Object();
        4iR r303 = obj.A00;
        if (l5p.A09(1)) {
            r303 = l5p.A04();
        }
        obj.A00 = (AudioAttributesImpl) r303;
        return obj;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, L5P l5p) {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
        l5p.A05(1);
        l5p.A08(audioAttributesImpl);
    }
}
