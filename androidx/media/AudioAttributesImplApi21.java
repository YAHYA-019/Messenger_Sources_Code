package androidx.media;

import X.AnonymousClass001;
import android.media.AudioAttributes;

/* loaded from: AudioAttributesImplApi21.class */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public int A00 = -1;
    public AudioAttributes A01;

    @Override // androidx.media.AudioAttributesImpl
    public Object AXh() {
        return this.A01;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.A01.equals(((AudioAttributesImplApi21) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioAttributesCompat: audioattributes=");
        return AnonymousClass001.A0a(this.A01, A0k);
    }
}
