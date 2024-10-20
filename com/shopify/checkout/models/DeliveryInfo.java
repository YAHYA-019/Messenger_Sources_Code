package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Lw7;

/* loaded from: DeliveryInfo.class */
public final class DeliveryInfo {
    public static final Companion Companion = new Object();
    public final DeliveryDetails A00;
    public final DeliveryMethod A01;

    /* loaded from: DeliveryInfo$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw7.A00;
        }
    }

    public /* synthetic */ DeliveryInfo(DeliveryDetails deliveryDetails, DeliveryMethod deliveryMethod, int i) {
        if (3 != (i & 3)) {
            7mU.A00(Lw7.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A01 = deliveryMethod;
        this.A00 = deliveryDetails;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DeliveryInfo)) {
                return false;
            }
            DeliveryInfo deliveryInfo = (DeliveryInfo) obj;
            if (this.A01 != deliveryInfo.A01 || !11T.A0O(this.A00, deliveryInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DeliveryInfo(method=");
        A0k.append(this.A01);
        A0k.append(", details=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
