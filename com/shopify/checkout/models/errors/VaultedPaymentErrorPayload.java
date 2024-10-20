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
import X.KNr;
import X.LwM;

/* loaded from: VaultedPaymentErrorPayload.class */
public final class VaultedPaymentErrorPayload {
    public static final Companion Companion = new Object();
    public final ErrorGroup A00;
    public final KNr A01;
    public final String A02;
    public final String A03;

    /* loaded from: VaultedPaymentErrorPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwM.A00;
        }
    }

    public /* synthetic */ VaultedPaymentErrorPayload(ErrorGroup errorGroup, KNr kNr, String str, String str2, int i) {
        if (11 != (i & 11)) {
            7mU.A00(LwM.A01, i, 11);
            throw 0Q8.createAndThrow();
        }
        this.A02 = str;
        this.A01 = kNr;
        if ((i & 4) != 0) {
            this.A03 = str2;
        }
        this.A00 = errorGroup;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VaultedPaymentErrorPayload)) {
                return false;
            }
            VaultedPaymentErrorPayload vaultedPaymentErrorPayload = (VaultedPaymentErrorPayload) obj;
            if (!11T.A0O(this.A02, vaultedPaymentErrorPayload.A02) || this.A01 != vaultedPaymentErrorPayload.A01 || !11T.A0O(this.A03, vaultedPaymentErrorPayload.A03) || this.A00 != vaultedPaymentErrorPayload.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, (AnonymousClass002.A05(this.A01, 4YV.A02(this.A02)) + 1BL.A05(this.A03)) * 31);
    }

    public String toString() {
        StringBuilder A0s = JR0.A0s();
        JR0.A1H(A0s, this.A00);
        A0s.append(this.A03);
        A0s.append("\n            Code: ");
        A0s.append(this.A01);
        return AnonymousClass001.A0d("\n        ", A0s);
    }
}
