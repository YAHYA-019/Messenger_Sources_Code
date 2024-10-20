package X;

/* renamed from: X.8rr, reason: invalid class name */
/* loaded from: 8rr.class */
public final class C8rr extends 99K {
    public final int A00;
    public final int A01;

    public C8rr(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8rr)) {
                return false;
            }
            C8rr c8rr = (C8rr) obj;
            if (this.A01 != c8rr.A01 || this.A00 != c8rr.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
