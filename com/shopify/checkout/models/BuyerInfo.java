package com.shopify.checkout.models;

import X.11T;
import X.1BL;
import X.4YU;
import X.5Yu;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Lvy;

/* loaded from: BuyerInfo.class */
public final class BuyerInfo {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final PaymentMethod A01;
    public final String A02;
    public final boolean A03;

    /* loaded from: BuyerInfo$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvy.A00;
        }
    }

    public BuyerInfo() {
        this.A02 = null;
        this.A03 = false;
        this.A01 = null;
        this.A00 = null;
    }

    public /* synthetic */ BuyerInfo(Address address, PaymentMethod paymentMethod, String str, int i, boolean z) {
        if ((i & 1) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str;
        }
        if ((i & 2) == 0) {
            this.A03 = false;
        } else {
            this.A03 = z;
        }
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = paymentMethod;
        }
        if ((i & 8) == 0) {
            this.A00 = null;
        } else {
            this.A00 = address;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BuyerInfo)) {
                return false;
            }
            BuyerInfo buyerInfo = (BuyerInfo) obj;
            if (!11T.A0O(this.A02, buyerInfo.A02) || this.A03 != buyerInfo.A03 || !11T.A0O(this.A01, buyerInfo.A01) || !11T.A0O(this.A00, buyerInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((1BL.A05(this.A02) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BuyerInfo(email=");
        A0k.append(this.A02);
        A0k.append(", acceptsMarketing=");
        A0k.append(this.A03);
        A0k.append(", selectedPaymentMethod=");
        A0k.append(this.A01);
        A0k.append(", selectedShippingAddress=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
