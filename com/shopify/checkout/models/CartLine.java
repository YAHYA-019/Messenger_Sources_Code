package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BL;
import X.4YU;
import X.5Yu;
import X.5cI;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Lw0;
import X.Lw8;
import java.util.List;

/* loaded from: CartLine.class */
public final class CartLine {
    public final int A00;
    public final CartLineImage A01;
    public final Money A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A07 = {null, null, null, null, null, null, new 5cI(Lw8.A00)};

    /* loaded from: CartLine$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw0.A00;
        }
    }

    public /* synthetic */ CartLine(CartLineImage cartLineImage, Money money, String str, String str2, String str3, List list, int i, int i2) {
        if (56 != (i & 56)) {
            7mU.A00(Lw0.A01, i, 56);
            throw 0Q8.createAndThrow();
        }
        if ((i & 1) != 0) {
            this.A03 = str;
        }
        if ((i & 2) != 0) {
            this.A04 = str2;
        }
        if ((i & 4) != 0) {
            this.A01 = cartLineImage;
        }
        this.A00 = i2;
        this.A05 = str3;
        this.A02 = money;
        if ((i & 64) != 0) {
            this.A06 = list;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CartLine)) {
                return false;
            }
            CartLine cartLine = (CartLine) obj;
            if (!11T.A0O(this.A03, cartLine.A03) || !11T.A0O(this.A04, cartLine.A04) || !11T.A0O(this.A01, cartLine.A01) || this.A00 != cartLine.A00 || !11T.A0O(this.A05, cartLine.A05) || !11T.A0O(this.A02, cartLine.A02) || !11T.A0O(this.A06, cartLine.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A02, AnonymousClass002.A07(this.A05, ((((((1BL.A05(this.A03) * 31) + 1BL.A05(this.A04)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + this.A00) * 31)) + 4YU.A03(this.A06);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CartLine(merchandiseId=");
        A0k.append(this.A03);
        A0k.append(", productId=");
        A0k.append(this.A04);
        A0k.append(", image=");
        A0k.append(this.A01);
        A0k.append(", quantity=");
        A0k.append(this.A00);
        A0k.append(", title=");
        A0k.append(this.A05);
        A0k.append(", price=");
        A0k.append(this.A02);
        A0k.append(", discounts=");
        return AnonymousClass002.A0K(this.A06, A0k);
    }
}
