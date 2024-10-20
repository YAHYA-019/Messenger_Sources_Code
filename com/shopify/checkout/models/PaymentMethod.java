package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BK;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LwF;

/* loaded from: PaymentMethod.class */
public final class PaymentMethod {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* loaded from: PaymentMethod$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwF.A00;
        }
    }

    public /* synthetic */ PaymentMethod(Address address, String str, String str2, String str3, String str4, String str5, int i) {
        if (63 != (i & 63)) {
            7mU.A00(LwF.A01, i, 63);
            throw 0Q8.createAndThrow();
        }
        this.A05 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A00 = address;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            if (!11T.A0O(this.A05, paymentMethod.A05) || !11T.A0O(this.A01, paymentMethod.A01) || !11T.A0O(this.A04, paymentMethod.A04) || !11T.A0O(this.A02, paymentMethod.A02) || !11T.A0O(this.A03, paymentMethod.A03) || !11T.A0O(this.A00, paymentMethod.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A02, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A01, 4YV.A02(this.A05))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PaymentMethod(referenceId=");
        A0k.append(this.A05);
        A0k.append(", cardType=");
        A0k.append(this.A01);
        A0k.append(", lastFourDigits=");
        A0k.append(this.A04);
        A0k.append(", expirationMonth=");
        A0k.append(this.A02);
        A0k.append(", expirationYear=");
        A0k.append(this.A03);
        A0k.append(", billingAddress=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
