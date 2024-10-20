package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.JQz;
import X.LwA;

/* loaded from: LocalePayload.class */
public final class LocalePayload {
    public static final Companion Companion = new Object();
    public final String A00;

    /* loaded from: LocalePayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwA.A00;
        }
    }

    public /* synthetic */ LocalePayload(String str, int i) {
        if (1 != (i & 1)) {
            7mU.A00(LwA.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LocalePayload) && 11T.A0O(this.A00, ((LocalePayload) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return JQz.A0q("LocalePayload(locale=", this.A00);
    }
}
