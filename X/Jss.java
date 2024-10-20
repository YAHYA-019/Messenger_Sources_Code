package X;

/* loaded from: Jss.class */
public final class Jss extends C04v {
    public final Jt2 A00;
    public final Jt2 A01;
    public final Jt2 A02;
    public final Jt2 A03;
    public final Jt2 A04;

    public Jss(Jt2 jt2, Jt2 jt22, Jt2 jt23, Jt2 jt24, Jt2 jt25) {
        1BL.A1H(jt2, jt22, jt23);
        this.A01 = jt2;
        this.A00 = jt22;
        this.A02 = jt23;
        this.A04 = jt24;
        this.A03 = jt25;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jss)) {
                return false;
            }
            Jss jss = (Jss) obj;
            if (!11T.A0O(this.A01, jss.A01) || !11T.A0O(this.A00, jss.A00) || !11T.A0O(this.A02, jss.A02) || !11T.A0O(this.A04, jss.A04) || !11T.A0O(this.A03, jss.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A03, AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A00, 1BL.A03(this.A01)))));
    }
}
