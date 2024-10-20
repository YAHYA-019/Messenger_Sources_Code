package X;

import com.shopify.checkout.models.OrderDetails$PaymentMethod$Companion;

/* loaded from: L49.class */
public final class L49 {
    public static final 5Yu[] A02;
    public static final OrderDetails$PaymentMethod$Companion Companion = new Object();
    public final String A00;
    public final java.util.Map A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.shopify.checkout.models.OrderDetails$PaymentMethod$Companion, java.lang.Object] */
    static {
        5ZL r0 = 5ZL.A01;
        A02 = new 5Yu[]{null, new 5ZR(r0, r0)};
    }

    public /* synthetic */ L49(String str, int i, java.util.Map map) {
        if (3 != (i & 3)) {
            7mU.A00(LwE.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A00 = str;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L49)) {
                return false;
            }
            L49 l49 = (L49) obj;
            if (!11T.A0O(this.A00, l49.A00) || !11T.A0O(this.A01, l49.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 4YV.A02(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PaymentMethod(type=");
        A0k.append(this.A00);
        A0k.append(", details=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
