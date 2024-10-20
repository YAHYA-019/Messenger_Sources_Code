package X;

/* loaded from: Jst.class */
public final class Jst extends C04v {
    public final int A00;
    public final Jss A01;
    public final C87v A02;
    public final String A03;
    public final String A04;

    public Jst(Jss jss, C87v c87v, String str, String str2) {
        11T.A0F(str2, 3);
        11T.A0F(jss, 5);
        this.A00 = 5;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = c87v;
        this.A01 = jss;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jst)) {
                return false;
            }
            Jst jst = (Jst) obj;
            if (this.A00 != jst.A00 || !11T.A0O(this.A03, jst.A03) || !11T.A0O(this.A04, jst.A04) || !11T.A0O(this.A02, jst.A02) || !11T.A0O(this.A01, jst.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A05(this.A02, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A03, this.A00 * 31))));
    }
}
