package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.7zM;
import X.AnonymousClass001;
import X.DKH;
import X.JQz;
import X.LwB;

/* loaded from: Money.class */
public final class Money {
    public static final Companion Companion = new Object();
    public final float A00;
    public final String A01;

    /* loaded from: Money$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwB.A00;
        }
    }

    public /* synthetic */ Money(String str, int i, float f) {
        if (3 != (i & 3)) {
            7mU.A00(LwB.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A00 = f;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Money)) {
                return false;
            }
            Money money = (Money) obj;
            if (Float.compare(this.A00, money.A00) != 0 || !11T.A0O(this.A01, money.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, JQz.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Money(amount=");
        A0k.append(this.A00);
        A0k.append(", currencyCode=");
        return DKH.A0o(this.A01, A0k);
    }
}
