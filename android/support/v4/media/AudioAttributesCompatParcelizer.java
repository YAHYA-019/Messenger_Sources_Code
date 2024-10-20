package android.support.v4.media;

import X.L5P;
import androidx.media.AudioAttributesCompat;

/* loaded from: AudioAttributesCompatParcelizer.class */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(L5P l5p) {
        return androidx.media.AudioAttributesCompatParcelizer.read(l5p);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, L5P l5p) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, l5p);
    }
}
