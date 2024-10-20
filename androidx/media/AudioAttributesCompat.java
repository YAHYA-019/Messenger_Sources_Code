package androidx.media;

import X.4iR;
import android.util.SparseIntArray;

/* loaded from: AudioAttributesCompat.class */
public class AudioAttributesCompat implements 4iR {
    public static final SparseIntArray A01;
    public AudioAttributesImpl A00;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A01 = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesImpl audioAttributesImpl = this.A00;
            AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).A00;
            if (audioAttributesImpl != null) {
                return audioAttributesImpl.equals(audioAttributesImpl2);
            }
            if (audioAttributesImpl2 == null) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
