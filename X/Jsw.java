package X;

/* loaded from: Jsw.class */
public final class Jsw extends C04v {
    public JtF A00;
    public JtB A01;
    public JtB A02;
    public JtB A03;
    public String A04;
    public String A05;
    public java.util.Map A06;

    public Jsw() {
        String A0s = 7zR.A0s();
        03W A0G = 04R.A0G();
        11T.A0F(A0G, 7);
        this.A04 = A0s;
        this.A05 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
        this.A06 = A0G;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsw)) {
                return false;
            }
            Jsw jsw = (Jsw) obj;
            if (!11T.A0O(this.A04, jsw.A04) || !11T.A0O(this.A05, jsw.A05) || !11T.A0O(this.A01, jsw.A01) || !11T.A0O(this.A03, jsw.A03) || !11T.A0O(this.A02, jsw.A02) || !11T.A0O(this.A00, jsw.A00) || !11T.A0O(this.A06, jsw.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A06, (((((((((4YV.A02(this.A04) + 1BL.A05(this.A05)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 4YU.A03(this.A00)) * 31);
    }
}
