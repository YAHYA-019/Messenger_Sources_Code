package X;

import java.util.Arrays;

/* loaded from: Jt2.class */
public final class Jt2 extends C04v {
    public final byte[] A00;

    public Jt2(byte[] bArr) {
        this.A00 = bArr;
    }

    public final String A00() {
        return DKC.A1B(this.A00, 11);
    }

    public boolean equals(Object obj) {
        Jt2 jt2;
        boolean z = false;
        if (this == obj) {
            z = true;
        } else {
            Class<?> cls = getClass();
            Class<?> cls2 = null;
            if (obj != null) {
                cls2 = obj.getClass();
            }
            if (11T.A0O(cls, cls2) && (obj instanceof Jt2) && (jt2 = (Jt2) obj) != null) {
                return Arrays.equals(this.A00, jt2.A00);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        return A00();
    }
}
