package X;

/* loaded from: Jsq.class */
public final class Jsq extends C04v {
    public final KsV A00;
    public final Jt2 A01;
    public final Jt2 A02;
    public final Jt2 A03;

    public Jsq(KsV ksV, Jt2 jt2, Jt2 jt22, Jt2 jt23) {
        11T.A0F(ksV, 1);
        this.A00 = ksV;
        this.A02 = jt2;
        this.A01 = jt22;
        this.A03 = jt23;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsq)) {
                return false;
            }
            Jsq jsq = (Jsq) obj;
            if (!11T.A0O(this.A00, jsq.A00) || !11T.A0O(this.A02, jsq.A02) || !11T.A0O(this.A01, jsq.A01) || !11T.A0O(this.A03, jsq.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A03, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A02, 1BL.A03(this.A00))));
    }
}
