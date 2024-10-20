package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.JQz;
import X.Lw9;

/* loaded from: InitPayload.class */
public final class InitPayload {
    public static final Companion Companion = new Object();
    public final String A00;

    /* loaded from: InitPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lw9.A00;
        }
    }

    public /* synthetic */ InitPayload(String str, int i) {
        if (1 != (i & 1)) {
            7mU.A00(Lw9.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InitPayload) && 11T.A0O(this.A00, ((InitPayload) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return JQz.A0q("InitPayload(paymentUrl=", this.A00);
    }
}
