package X;

import java.util.Arrays;

/* renamed from: X.Giw, reason: case insensitive filesystem */
/* loaded from: Giw.class */
public final class C2607Giw extends C04v {
    public final int A00;
    public final long A01;
    public final float[] A02;

    public C2607Giw(int i, float[] fArr, long j) {
        this.A00 = i;
        this.A02 = fArr;
        this.A01 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2607Giw)) {
                return false;
            }
            C2607Giw c2607Giw = (C2607Giw) obj;
            if (this.A00 != c2607Giw.A00 || !11T.A0O(this.A02, c2607Giw.A02) || this.A01 != c2607Giw.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + Arrays.hashCode(this.A02)) * 31) + 1BL.A01(this.A01);
    }
}
