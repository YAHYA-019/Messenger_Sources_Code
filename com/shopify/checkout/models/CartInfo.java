package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BK;
import X.4YV;
import X.5Yu;
import X.5cI;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Lvz;
import X.Lw0;
import java.util.List;

/* loaded from: CartInfo.class */
public final class CartInfo {
    public final Price A00;
    public final String A01;
    public final List A02;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A03 = {null, new 5cI(Lw0.A00), null};

    /* loaded from: CartInfo$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvz.A00;
        }
    }

    public /* synthetic */ CartInfo(Price price, String str, List list, int i) {
        if (7 != (i & 7)) {
            7mU.A00(Lvz.A01, i, 7);
            throw 0Q8.createAndThrow();
        }
        this.A01 = str;
        this.A02 = list;
        this.A00 = price;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CartInfo)) {
                return false;
            }
            CartInfo cartInfo = (CartInfo) obj;
            if (!11T.A0O(this.A01, cartInfo.A01) || !11T.A0O(this.A02, cartInfo.A02) || !11T.A0O(this.A00, cartInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A05(this.A02, 4YV.A02(this.A01)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CartInfo(token=");
        A0k.append(this.A01);
        A0k.append(", lines=");
        A0k.append(this.A02);
        A0k.append(", price=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
