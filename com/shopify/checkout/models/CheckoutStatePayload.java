package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.4YU;
import X.4YV;
import X.5Yu;
import X.5cI;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Lw4;
import X.Lw7;
import java.util.List;

/* loaded from: CheckoutStatePayload.class */
public final class CheckoutStatePayload {
    public final BuyerInfo A00;
    public final CartInfo A01;
    public final String A02;
    public final List A03;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A04 = {null, null, null, new 5cI(Lw7.A00)};

    /* loaded from: CheckoutStatePayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw4.A00;
        }
    }

    public /* synthetic */ CheckoutStatePayload(BuyerInfo buyerInfo, CartInfo cartInfo, String str, List list, int i) {
        if (3 != (i & 3)) {
            7mU.A00(Lw4.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A02 = str;
        this.A01 = cartInfo;
        if ((i & 4) != 0) {
            this.A00 = buyerInfo;
        }
        if ((i & 8) != 0) {
            this.A03 = list;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutStatePayload)) {
                return false;
            }
            CheckoutStatePayload checkoutStatePayload = (CheckoutStatePayload) obj;
            if (!11T.A0O(this.A02, checkoutStatePayload.A02) || !11T.A0O(this.A01, checkoutStatePayload.A01) || !11T.A0O(this.A00, checkoutStatePayload.A00) || !11T.A0O(this.A03, checkoutStatePayload.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A01, 4YV.A02(this.A02)) + AnonymousClass001.A02(this.A00)) * 31) + 4YU.A03(this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CheckoutStatePayload(flowType=");
        A0k.append(this.A02);
        A0k.append(", cart=");
        A0k.append(this.A01);
        A0k.append(", buyer=");
        A0k.append(this.A00);
        A0k.append(", deliveries=");
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}
