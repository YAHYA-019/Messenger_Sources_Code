package X;

/* loaded from: C7m.class */
public final class C7m {
    public final 2MQ A00;
    public final C5ww A01;
    public final String A02;
    public final boolean A03;

    public C7m(CDw cDw) {
        C5ww c5ww = cDw.A01;
        C1pq.A08("clickListener", c5ww);
        this.A01 = c5ww;
        this.A00 = cDw.A00;
        this.A03 = cDw.A03;
        String str = cDw.A02;
        AbF.A1V(str);
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7m)) {
                return false;
            }
            C7m c7m = (C7m) obj;
            if (!11T.A0O(this.A01, c7m.A01) || this.A00 != c7m.A00 || this.A03 != c7m.A03 || !11T.A0O(this.A02, c7m.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        return C1pq.A04(this.A02, C1pq.A02((A03 * 31) + C3o5.A03(this.A00), this.A03));
    }
}
