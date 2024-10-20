package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.7zM;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import X.Lw2;

/* loaded from: CheckoutCompletedPayload.class */
public final class CheckoutCompletedPayload {
    public static final Companion Companion = new Object();
    public final CartInfo A00;
    public final OrderDetails A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* loaded from: CheckoutCompletedPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw2.A00;
        }
    }

    public /* synthetic */ CheckoutCompletedPayload(CartInfo cartInfo, OrderDetails orderDetails, String str, String str2, String str3, String str4, int i) {
        if (63 != (i & 63)) {
            7mU.A00(Lw2.A01, i, 63);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A01 = orderDetails;
        this.A02 = str2;
        this.A04 = str3;
        this.A00 = cartInfo;
        this.A05 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutCompletedPayload)) {
                return false;
            }
            CheckoutCompletedPayload checkoutCompletedPayload = (CheckoutCompletedPayload) obj;
            if (!11T.A0O(this.A03, checkoutCompletedPayload.A03) || !11T.A0O(this.A01, checkoutCompletedPayload.A01) || !11T.A0O(this.A02, checkoutCompletedPayload.A02) || !11T.A0O(this.A04, checkoutCompletedPayload.A04) || !11T.A0O(this.A00, checkoutCompletedPayload.A00) || !11T.A0O(this.A05, checkoutCompletedPayload.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A05, AnonymousClass002.A05(this.A00, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A02, AnonymousClass002.A05(this.A01, 4YV.A02(this.A03))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CheckoutCompletedPayload(flowType=");
        A0k.append(this.A03);
        A0k.append(", orderDetails=");
        A0k.append(this.A01);
        A0k.append(", confirmationURL=");
        A0k.append(this.A02);
        A0k.append(", orderId=");
        A0k.append(this.A04);
        A0k.append(", cart=");
        A0k.append(this.A00);
        A0k.append(", thankYouPageUrl=");
        return DKH.A0o(this.A05, A0k);
    }
}
