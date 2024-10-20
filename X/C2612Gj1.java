package X;

/* renamed from: X.Gj1, reason: case insensitive filesystem */
/* loaded from: Gj1.class */
public final class C2612Gj1 extends C04v {
    public final int A00;
    public final int A01;
    public final String A02;

    public C2612Gj1(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2612Gj1)) {
                return false;
            }
            C2612Gj1 c2612Gj1 = (C2612Gj1) obj;
            if (!11T.A0O(this.A02, c2612Gj1.A02) || this.A00 != c2612Gj1.A00 || this.A01 != c2612Gj1.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((4YV.A02(this.A02) + this.A00) * 31) + this.A01) * 31;
    }
}
