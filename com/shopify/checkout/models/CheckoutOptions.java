package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BK;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LvM;
import X.Lw3;

/* loaded from: CheckoutOptions.class */
public final class CheckoutOptions {
    public final Authentication A00;
    public final Defaults A01;
    public final ThemeOptions A02;
    public final boolean A03;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A04 = {null, null, null, LvM.A00("com.shopify.checkout.models.ThemeOptions", ThemeOptions.values())};

    /* loaded from: CheckoutOptions$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw3.A00;
        }
    }

    public /* synthetic */ CheckoutOptions(Authentication authentication, Defaults defaults, ThemeOptions themeOptions, int i, boolean z) {
        if (2 != (i & 2)) {
            7mU.A00(Lw3.A01, i, 2);
            throw 0Q8.createAndThrow();
        }
        this.A01 = (i & 1) == 0 ? null : defaults;
        this.A00 = authentication;
        if ((i & 4) != 0) {
            this.A03 = z;
        }
        if ((i & 8) == 0) {
            this.A02 = ThemeOptions.A03;
        } else {
            this.A02 = themeOptions;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutOptions)) {
                return false;
            }
            CheckoutOptions checkoutOptions = (CheckoutOptions) obj;
            if (!11T.A0O(this.A01, checkoutOptions.A01) || !11T.A0O(this.A00, checkoutOptions.A00) || this.A03 != checkoutOptions.A03 || this.A02 != checkoutOptions.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, (AnonymousClass002.A05(this.A00, AnonymousClass001.A02(this.A01) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CheckoutOptions(defaults=");
        A0k.append(this.A01);
        A0k.append(", auth=");
        A0k.append(this.A00);
        A0k.append(", shouldInjectJS=");
        A0k.append(this.A03);
        A0k.append(", theme=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
