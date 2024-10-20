package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.5Yu;
import X.5cI;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Lw7;
import X.LwD;
import X.LwE;
import java.util.List;

/* loaded from: OrderDetails.class */
public final class OrderDetails {
    public final Address A00;
    public final Address A01;
    public final CartInfo A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A08 = {null, null, null, null, null, new 5cI(LwE.A00), new 5cI(Lw7.A00), null};

    /* loaded from: OrderDetails$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwD.A00;
        }
    }

    public /* synthetic */ OrderDetails(Address address, Address address2, CartInfo cartInfo, String str, String str2, String str3, List list, List list2, int i) {
        if (41 != (i & 41)) {
            7mU.A00(LwD.A01, i, 41);
            throw 0Q8.createAndThrow();
        }
        this.A04 = str;
        if ((i & 2) != 0) {
            this.A03 = str2;
        }
        if ((i & 4) != 0) {
            this.A05 = str3;
        }
        this.A02 = cartInfo;
        if ((i & 16) != 0) {
            this.A00 = address;
        }
        this.A07 = list;
        if ((i & 64) != 0) {
            this.A06 = list2;
        }
        if ((i & 128) != 0) {
            this.A01 = address2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OrderDetails)) {
                return false;
            }
            OrderDetails orderDetails = (OrderDetails) obj;
            if (!11T.A0O(this.A04, orderDetails.A04) || !11T.A0O(this.A03, orderDetails.A03) || !11T.A0O(this.A05, orderDetails.A05) || !11T.A0O(this.A02, orderDetails.A02) || !11T.A0O(this.A00, orderDetails.A00) || !11T.A0O(this.A07, orderDetails.A07) || !11T.A0O(this.A06, orderDetails.A06) || !11T.A0O(this.A01, orderDetails.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A07, (AnonymousClass002.A05(this.A02, (((4YV.A02(this.A04) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A05)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OrderDetails(id=");
        A0k.append(this.A04);
        A0k.append(", email=");
        A0k.append(this.A03);
        A0k.append(", phone=");
        A0k.append(this.A05);
        A0k.append(", cart=");
        A0k.append(this.A02);
        A0k.append(", billingAddress=");
        A0k.append(this.A00);
        A0k.append(", paymentMethods=");
        A0k.append(this.A07);
        A0k.append(", deliveries=");
        A0k.append(this.A06);
        A0k.append(", shippingAddress=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
