package com.shopify.checkout.models.errors;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JR0;
import X.LwI;

/* loaded from: CheckoutErrorPayload.class */
public final class CheckoutErrorPayload {
    public static final Companion Companion = new Object();
    public final CheckoutErrorType A00;
    public final ErrorGroup A01;
    public final String A02;
    public final String A03;

    /* loaded from: CheckoutErrorPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwI.A00;
        }
    }

    public /* synthetic */ CheckoutErrorPayload(CheckoutErrorType checkoutErrorType, ErrorGroup errorGroup, String str, String str2, int i) {
        if (15 != (i & 15)) {
            7mU.A00(LwI.A01, i, 15);
            throw 0Q8.createAndThrow();
        }
        this.A02 = str;
        this.A00 = checkoutErrorType;
        this.A03 = str2;
        this.A01 = errorGroup;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutErrorPayload)) {
                return false;
            }
            CheckoutErrorPayload checkoutErrorPayload = (CheckoutErrorPayload) obj;
            if (!11T.A0O(this.A02, checkoutErrorPayload.A02) || this.A00 != checkoutErrorPayload.A00 || !11T.A0O(this.A03, checkoutErrorPayload.A03) || this.A01 != checkoutErrorPayload.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, (AnonymousClass002.A05(this.A00, 4YV.A02(this.A02)) + 1BL.A05(this.A03)) * 31);
    }

    public String toString() {
        StringBuilder A0s = JR0.A0s();
        A0s.append(this.A01);
        A0s.append("\n            Type: ");
        JR0.A1H(A0s, this.A00);
        A0s.append(this.A03);
        return AnonymousClass001.A0d("\n        ", A0s);
    }
}
