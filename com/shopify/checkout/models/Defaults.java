package com.shopify.checkout.models;

import X.11T;
import X.1BL;
import X.5Yu;
import X.5cI;
import X.7zN;
import X.AnonymousClass001;
import X.DKH;
import X.Lvw;
import X.Lw5;
import X.LwF;
import java.util.List;

/* loaded from: Defaults.class */
public final class Defaults {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A04 = {null, new 5cI(Lvw.A00), new 5cI(LwF.A00), null};

    /* loaded from: Defaults$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw5.A00;
        }
    }

    public Defaults() {
        this.A00 = null;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
    }

    public /* synthetic */ Defaults(String str, String str2, List list, List list2, int i) {
        if ((i & 1) == 0) {
            this.A00 = null;
        } else {
            this.A00 = str;
        }
        if ((i & 2) == 0) {
            this.A03 = null;
        } else {
            this.A03 = list;
        }
        if ((i & 4) == 0) {
            this.A02 = null;
        } else {
            this.A02 = list2;
        }
        if ((i & 8) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) obj;
            if (!11T.A0O(this.A00, defaults.A00) || !11T.A0O(this.A03, defaults.A03) || !11T.A0O(this.A02, defaults.A02) || !11T.A0O(this.A01, defaults.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((1BL.A05(this.A00) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 7zN.A05(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Defaults(email=");
        A0k.append(this.A00);
        A0k.append(", shippingAddresses=");
        A0k.append(this.A03);
        A0k.append(", paymentMethods=");
        A0k.append(this.A02);
        A0k.append(", levelOfPriorConsentGiven=");
        return DKH.A0o(this.A01, A0k);
    }
}
