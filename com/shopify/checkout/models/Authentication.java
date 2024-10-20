package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BL;
import X.5Yu;
import X.7mU;
import X.7zM;
import X.AnonymousClass001;
import X.DKH;
import X.Lvx;

/* loaded from: Authentication.class */
public final class Authentication {
    public static final Companion Companion = new Object();
    public final AuthenticationVersion A00;
    public final String A01;

    /* loaded from: Authentication$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvx.A00;
        }
    }

    public /* synthetic */ Authentication(AuthenticationVersion authenticationVersion, String str, int i) {
        if (3 != (i & 3)) {
            7mU.A00(Lvx.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A00 = authenticationVersion;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Authentication)) {
                return false;
            }
            Authentication authentication = (Authentication) obj;
            if (this.A00 != authentication.A00 || !11T.A0O(this.A01, authentication.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 1BL.A03(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Authentication(version=");
        A0k.append(this.A00);
        A0k.append(", payload=");
        return DKH.A0o(this.A01, A0k);
    }
}
