package X;

import java.util.List;

/* loaded from: Eyw.class */
public final class Eyw {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public Eyw(String str, String str2, String str3, List list) {
        1BL.A11(1, str, str2, str3);
        this.A02 = str;
        this.A03 = list;
        this.A00 = str2;
        this.A01 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyw)) {
                return false;
            }
            Eyw eyw = (Eyw) obj;
            if (!11T.A0O(this.A02, eyw.A02) || !11T.A0O(this.A03, eyw.A03) || !11T.A0O(this.A00, eyw.A00) || !11T.A0O(this.A01, eyw.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, AnonymousClass002.A07(this.A00, AnonymousClass002.A05(this.A03, 4YV.A02(this.A02))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UserLoginCredential(userId=");
        A0k.append(this.A02);
        A0k.append(", credentials=");
        A0k.append(this.A03);
        A0k.append(", displayName=");
        A0k.append(this.A00);
        A0k.append(7zK.A00(5));
        return DKH.A0o(this.A01, A0k);
    }
}
