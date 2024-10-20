package X;

/* renamed from: X.AsF, reason: case insensitive filesystem */
/* loaded from: AsF.class */
public final class C1781AsF extends C04v {
    public final int A00;
    public final int A01;

    public C1781AsF() {
        this(0, 0);
    }

    public C1781AsF(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1781AsF)) {
                return false;
            }
            C1781AsF c1781AsF = (C1781AsF) obj;
            if (this.A00 != c1781AsF.A00 || this.A01 != c1781AsF.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }
}
