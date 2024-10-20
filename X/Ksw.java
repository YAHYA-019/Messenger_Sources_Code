package X;

import com.facebookpay.otc.models.OtcInput;

/* loaded from: Ksw.class */
public final class Ksw {
    public final OtcInput A00;
    public final String A01;

    public Ksw(OtcInput otcInput, String str) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = otcInput;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksw)) {
                return false;
            }
            Ksw ksw = (Ksw) obj;
            if (!11T.A0O(this.A01, ksw.A01) || !11T.A0O(this.A00, ksw.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ProductComponent(productId=");
        A0k.append(this.A01);
        A0k.append(", otcInput=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
