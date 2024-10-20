package X;

/* renamed from: X.41b, reason: invalid class name */
/* loaded from: 41b.class */
public final class C41b extends C04v {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C41b(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C41b)) {
                return false;
            }
            C41b c41b = (C41b) obj;
            if (this.A03 != c41b.A03 || this.A01 != c41b.A01 || this.A00 != c41b.A00 || this.A02 != c41b.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A03 * 31) + this.A01) * 31) + this.A00) * 31) + this.A02;
    }
}
