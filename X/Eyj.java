package X;

/* loaded from: Eyj.class */
public final class Eyj {
    public final String A00;
    public final String A01;
    public final FA7 A02;

    public Eyj(FA7 fa7, String str, String str2) {
        11T.A0F(fa7, 2);
        this.A01 = str;
        this.A02 = fa7;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyj)) {
                return false;
            }
            Eyj eyj = (Eyj) obj;
            if (!11T.A0O(this.A01, eyj.A01) || !11T.A0O(this.A02, eyj.A02) || !11T.A0O(this.A00, eyj.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A02, 4YV.A02(this.A01)) + 1BL.A05(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("StackParams(screenName=");
        A0k.append(this.A01);
        A0k.append(", bottomSheetParams=");
        A0k.append(this.A02);
        A0k.append(", fromScreenName=");
        return DKH.A0o(this.A00, A0k);
    }
}
