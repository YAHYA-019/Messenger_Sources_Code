package com.shopify.checkout.models;

import X.11T;
import X.1BL;
import X.5Yu;
import X.7zN;
import X.AnonymousClass001;
import X.DKH;
import X.Lw6;

/* loaded from: DeliveryDetails.class */
public final class DeliveryDetails {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final String A01;
    public final String A02;

    /* loaded from: DeliveryDetails$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw6.A00;
        }
    }

    public DeliveryDetails() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public /* synthetic */ DeliveryDetails(Address address, String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str;
        }
        if ((i & 2) == 0) {
            this.A00 = null;
        } else {
            this.A00 = address;
        }
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DeliveryDetails)) {
                return false;
            }
            DeliveryDetails deliveryDetails = (DeliveryDetails) obj;
            if (!11T.A0O(this.A02, deliveryDetails.A02) || !11T.A0O(this.A00, deliveryDetails.A00) || !11T.A0O(this.A01, deliveryDetails.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((1BL.A05(this.A02) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 7zN.A05(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DeliveryDetails(name=");
        A0k.append(this.A02);
        A0k.append(", location=");
        A0k.append(this.A00);
        A0k.append(", additionalInfo=");
        return DKH.A0o(this.A01, A0k);
    }
}
