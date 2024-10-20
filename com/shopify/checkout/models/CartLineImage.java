package com.shopify.checkout.models;

import X.0Pz;
import X.0Q8;
import X.11T;
import X.1BL;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass002;
import X.Lw1;

/* loaded from: CartLineImage.class */
public final class CartLineImage {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* loaded from: CartLineImage$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw1.A00;
        }
    }

    public /* synthetic */ CartLineImage(String str, String str2, String str3, String str4, int i) {
        if (7 != (i & 7)) {
            7mU.A00(Lw1.A01, i, 7);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        if ((i & 8) != 0) {
            this.A00 = str4;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CartLineImage)) {
                return false;
            }
            CartLineImage cartLineImage = (CartLineImage) obj;
            if (!11T.A0O(this.A03, cartLineImage.A03) || !11T.A0O(this.A02, cartLineImage.A02) || !11T.A0O(this.A01, cartLineImage.A01) || !11T.A0O(this.A00, cartLineImage.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A02, 4YV.A02(this.A03))) + 1BL.A05(this.A00);
    }

    public String toString() {
        return 0Pz.A14("CartLineImage(sm=", this.A03, ", md=", this.A02, ", lg=", this.A01, ", altText=", this.A00, ')');
    }
}
