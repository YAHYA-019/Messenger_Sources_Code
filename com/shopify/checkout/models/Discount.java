package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Lw8;

/* loaded from: Discount.class */
public final class Discount {
    public static final Companion Companion = new Object();
    public final Money A00;
    public final Float A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* loaded from: Discount$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw8.A00;
        }
    }

    public /* synthetic */ Discount(Money money, Float f, String str, String str2, String str3, int i) {
        if (7 != (i & 7)) {
            7mU.A00(Lw8.A01, i, 7);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A00 = money;
        this.A02 = str2;
        if ((i & 8) != 0) {
            this.A04 = str3;
        }
        if ((i & 16) != 0) {
            this.A01 = f;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) obj;
            if (!11T.A0O(this.A03, discount.A03) || !11T.A0O(this.A00, discount.A00) || !11T.A0O(this.A02, discount.A02) || !11T.A0O(this.A04, discount.A04) || !11T.A0O(this.A01, discount.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A02, AnonymousClass002.A05(this.A00, 4YV.A02(this.A03))) + 1BL.A05(this.A04)) * 31) + 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Discount(title=");
        A0k.append(this.A03);
        A0k.append(", amount=");
        A0k.append(this.A00);
        A0k.append(", applicationType=");
        A0k.append(this.A02);
        A0k.append(", valueType=");
        A0k.append(this.A04);
        A0k.append(", value=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
