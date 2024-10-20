package X;

/* renamed from: X.8rs, reason: invalid class name */
/* loaded from: 8rs.class */
public final class C8rs extends 99K {
    public final int A00;
    public final int A01;

    public C8rs(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8rs)) {
                return false;
            }
            C8rs c8rs = (C8rs) obj;
            if (this.A01 != c8rs.A01 || this.A00 != c8rs.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
