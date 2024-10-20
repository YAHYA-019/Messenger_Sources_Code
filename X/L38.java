package X;

/* loaded from: L38.class */
public final class L38 {
    public final KOL A00;
    public final Boolean A01;
    public final Number A02;
    public final Number A03;

    public L38(KOL kol, Boolean bool, Number number, Number number2) {
        this.A02 = number;
        this.A00 = kol;
        this.A03 = number2;
        this.A01 = bool;
    }

    public L38(Kgu kgu) {
        this.A02 = null;
        this.A00 = kgu.A00;
        this.A03 = null;
        this.A01 = kgu.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L38)) {
                return false;
            }
            L38 l38 = (L38) obj;
            if (!11T.A0O(this.A02, l38.A02) || this.A00 != l38.A00 || !11T.A0O(this.A03, l38.A03) || !11T.A0O(this.A01, l38.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A02);
        return C1pq.A04(this.A01, C1pq.A04(this.A03, (A03 * 31) + C3o5.A03(this.A00)));
    }
}
