package X;

/* renamed from: X.77w, reason: invalid class name */
/* loaded from: 77w.class */
public final class C77w implements C6xq {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public C77w(int i, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C77w)) {
                return false;
            }
            C77w c77w = (C77w) obj;
            if (this.A01 != c77w.A01 || this.A02 != c77w.A02 || this.A03 != c77w.A03 || this.A00 != c77w.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A02(C1pq.A02(C1pq.A05(this.A01), this.A02), this.A03) * 31) + this.A00;
    }
}
