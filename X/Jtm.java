package X;

/* loaded from: Jtm.class */
public final class Jtm extends C04v implements MCL {
    public final KMk A00;
    public final String A01;
    public final String A02;

    public Jtm(KMk kMk, String str, String str2) {
        11T.A0F(kMk, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = kMk;
        if (str2 != null && str2.length() != 0 && kMk != KMk.A03) {
            throw AnonymousClass001.A0N("Subtitles can only be added for REGULAR title sizes");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jtm)) {
                return false;
            }
            Jtm jtm = (Jtm) obj;
            if (!11T.A0O(this.A02, jtm.A02) || !11T.A0O(this.A01, jtm.A01) || this.A00 != jtm.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, (4YV.A02(this.A02) + 1BL.A05(this.A01)) * 31);
    }
}
