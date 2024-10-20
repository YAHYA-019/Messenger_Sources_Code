package X;

/* loaded from: Krp.class */
public final class Krp {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public Krp(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Krp)) {
                return false;
            }
            Krp krp = (Krp) obj;
            if (this.A00 != krp.A00 || this.A01 != krp.A01 || this.A02 != krp.A02 || this.A03 != krp.A03 || this.A04 != krp.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A05(this.A00), this.A01), this.A02), this.A03), this.A04);
    }
}
