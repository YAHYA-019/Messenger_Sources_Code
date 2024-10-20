package X;

import com.shopify.checkout.AndroidWebView$JSMessage$Companion;

/* loaded from: L43.class */
public final class L43 {
    public static final AndroidWebView$JSMessage$Companion Companion = new Object();
    public final String A00;
    public final String A01;

    public /* synthetic */ L43(String str, String str2, int i) {
        if (3 != (i & 3)) {
            7mU.A00(Lvv.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L43)) {
                return false;
            }
            L43 l43 = (L43) obj;
            if (!11T.A0O(this.A01, l43.A01) || !11T.A0O(this.A00, l43.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, 4YV.A02(this.A01));
    }

    public String toString() {
        return JQz.A0r("JSMessage(name=", this.A01, ", body=", this.A00);
    }
}
