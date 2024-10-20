package X;

/* loaded from: Eyr.class */
public final class Eyr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final java.util.Map A03;

    public Eyr(String str, String str2, String str3, java.util.Map map) {
        7zR.A1O(str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyr)) {
                return false;
            }
            Eyr eyr = (Eyr) obj;
            if (!11T.A0O(this.A00, eyr.A00) || !11T.A0O(this.A01, eyr.A01) || !11T.A0O(this.A02, eyr.A02) || !11T.A0O(this.A03, eyr.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A03, AnonymousClass002.A07(this.A02, AnonymousClass002.A07(this.A01, 1BL.A05(this.A00) * 31)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VerifyAuthFactor(authType=");
        A0k.append(this.A00);
        A0k.append(", paymentType=");
        A0k.append(this.A01);
        A0k.append(4YT.A00(45));
        A0k.append(this.A02);
        A0k.append(", authParam=");
        A0k.append(this.A03);
        A0k.append(", targetAccountId=");
        return DKH.A0o((String) null, A0k);
    }
}
