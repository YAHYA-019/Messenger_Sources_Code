package X;

/* renamed from: X.77r, reason: invalid class name */
/* loaded from: 77r.class */
public final class C77r {
    public final int A00;
    public final int A01;
    public final C6zq A02;

    public C77r(C6zq c6zq, int i, int i2) {
        this.A02 = c6zq;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C77r)) {
                return false;
            }
            C77r c77r = (C77r) obj;
            if (!11T.A0O(this.A02, c77r.A02) || this.A00 != c77r.A00 || this.A01 != c77r.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C1pq.A03(this.A02) * 31) + this.A00) * 31) + this.A01;
    }
}
