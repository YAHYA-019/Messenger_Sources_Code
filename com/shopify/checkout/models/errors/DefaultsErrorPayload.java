package com.shopify.checkout.models.errors;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JR0;
import X.LwJ;

/* loaded from: DefaultsErrorPayload.class */
public final class DefaultsErrorPayload {
    public static final Companion Companion = new Object();
    public final DefaultsErrorCode A00;
    public final ErrorGroup A01;
    public final String A02;
    public final String A03;

    /* loaded from: DefaultsErrorPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwJ.A00;
        }
    }

    public /* synthetic */ DefaultsErrorPayload(DefaultsErrorCode defaultsErrorCode, ErrorGroup errorGroup, String str, String str2, int i) {
        if (11 != (i & 11)) {
            7mU.A00(LwJ.A01, i, 11);
            throw 0Q8.createAndThrow();
        }
        this.A02 = str;
        this.A00 = defaultsErrorCode;
        if ((i & 4) != 0) {
            this.A03 = str2;
        }
        this.A01 = errorGroup;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DefaultsErrorPayload)) {
                return false;
            }
            DefaultsErrorPayload defaultsErrorPayload = (DefaultsErrorPayload) obj;
            if (!11T.A0O(this.A02, defaultsErrorPayload.A02) || this.A00 != defaultsErrorPayload.A00 || !11T.A0O(this.A03, defaultsErrorPayload.A03) || this.A01 != defaultsErrorPayload.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, (AnonymousClass002.A05(this.A00, 4YV.A02(this.A02)) + 1BL.A05(this.A03)) * 31);
    }

    public String toString() {
        StringBuilder A0s = JR0.A0s();
        JR0.A1H(A0s, this.A01);
        A0s.append(this.A03);
        A0s.append("\n            Code: ");
        A0s.append(this.A00);
        return AnonymousClass001.A0d("\n        ", A0s);
    }
}
