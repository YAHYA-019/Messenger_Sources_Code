package X;

/* loaded from: Dq7.class */
public final class Dq7 extends C04v {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public Dq7(String str, String str2, String str3, String str4, String str5, String str6) {
        7zR.A1N(str, str3);
        1BL.A1G(str5, str6);
        this.A05 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A04 = str6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dq7)) {
                return false;
            }
            Dq7 dq7 = (Dq7) obj;
            if (!11T.A0O(this.A05, dq7.A05) || !11T.A0O(this.A00, dq7.A00) || !11T.A0O(this.A01, dq7.A01) || !11T.A0O(this.A02, dq7.A02) || !11T.A0O(this.A03, dq7.A03) || !11T.A0O(this.A04, dq7.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A04, AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A02, AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A00, 4YV.A02(this.A05))))));
    }
}
