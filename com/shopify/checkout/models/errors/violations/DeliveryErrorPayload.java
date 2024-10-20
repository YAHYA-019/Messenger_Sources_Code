package com.shopify.checkout.models.errors.violations;

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
import X.LwN;
import com.shopify.checkout.models.errors.ErrorGroup;

/* loaded from: DeliveryErrorPayload.class */
public final class DeliveryErrorPayload {
    public static final Companion Companion = new Object();
    public final ErrorGroup A00;
    public final DeliveryErrorCode A01;
    public final ViolationErrorType A02;
    public final String A03;
    public final String A04;

    /* loaded from: DeliveryErrorPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwN.A00;
        }
    }

    public /* synthetic */ DeliveryErrorPayload(ErrorGroup errorGroup, DeliveryErrorCode deliveryErrorCode, ViolationErrorType violationErrorType, String str, String str2, int i) {
        if (27 != (i & 27)) {
            7mU.A00(LwN.A01, i, 27);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A01 = deliveryErrorCode;
        if ((i & 4) != 0) {
            this.A04 = str2;
        }
        this.A00 = errorGroup;
        this.A02 = violationErrorType;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DeliveryErrorPayload)) {
                return false;
            }
            DeliveryErrorPayload deliveryErrorPayload = (DeliveryErrorPayload) obj;
            if (!11T.A0O(this.A03, deliveryErrorPayload.A03) || this.A01 != deliveryErrorPayload.A01 || !11T.A0O(this.A04, deliveryErrorPayload.A04) || this.A00 != deliveryErrorPayload.A00 || this.A02 != deliveryErrorPayload.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A05(this.A00, (AnonymousClass002.A05(this.A01, 4YV.A02(this.A03)) + 1BL.A05(this.A04)) * 31));
    }

    public String toString() {
        StringBuilder A0s = JR0.A0s();
        JR0.A1H(A0s, this.A00);
        A0s.append(this.A04);
        A0s.append("\n            Code: ");
        A0s.append(this.A01);
        return AnonymousClass001.A0d("\n        ", A0s);
    }
}
