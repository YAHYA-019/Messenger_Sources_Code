package com.shopify.checkout.models;

import X.11T;
import X.4YU;
import X.5Yu;
import X.5cI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Lw8;
import X.LwG;
import java.util.List;

/* loaded from: Price.class */
public final class Price {
    public final Money A00;
    public final Money A01;
    public final Money A02;
    public final Money A03;
    public final Boolean A04;
    public final List A05;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A06 = {null, null, null, null, null, new 5cI(Lw8.A00)};

    /* loaded from: Price$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwG.A00;
        }
    }

    public Price() {
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A00 = null;
        this.A05 = null;
    }

    public /* synthetic */ Price(Money money, Money money2, Money money3, Money money4, Boolean bool, List list, int i) {
        if ((i & 1) == 0) {
            this.A03 = null;
        } else {
            this.A03 = money;
        }
        if ((i & 2) == 0) {
            this.A01 = null;
        } else {
            this.A01 = money2;
        }
        if ((i & 4) == 0) {
            this.A02 = null;
        } else {
            this.A02 = money3;
        }
        if ((i & 8) == 0) {
            this.A04 = null;
        } else {
            this.A04 = bool;
        }
        if ((i & 16) == 0) {
            this.A00 = null;
        } else {
            this.A00 = money4;
        }
        if ((i & 32) == 0) {
            this.A05 = null;
        } else {
            this.A05 = list;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Price)) {
                return false;
            }
            Price price = (Price) obj;
            if (!11T.A0O(this.A03, price.A03) || !11T.A0O(this.A01, price.A01) || !11T.A0O(this.A02, price.A02) || !11T.A0O(this.A04, price.A04) || !11T.A0O(this.A00, price.A00) || !11T.A0O(this.A05, price.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((AnonymousClass001.A02(this.A03) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 4YU.A03(this.A05);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Price(total=");
        A0k.append(this.A03);
        A0k.append(", subtotal=");
        A0k.append(this.A01);
        A0k.append(", taxes=");
        A0k.append(this.A02);
        A0k.append(", taxesIncluded=");
        A0k.append(this.A04);
        A0k.append(", shipping=");
        A0k.append(this.A00);
        A0k.append(", discounts=");
        return AnonymousClass002.A0K(this.A05, A0k);
    }
}
