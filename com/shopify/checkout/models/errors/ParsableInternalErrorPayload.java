package com.shopify.checkout.models.errors;

import X.0Q8;
import X.11T;
import X.1BL;
import X.5Yu;
import X.7mU;
import X.7zN;
import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import X.LwK;

/* loaded from: ParsableInternalErrorPayload.class */
public final class ParsableInternalErrorPayload {
    public final ErrorGroup A00;
    public final ParsableInternalErrorCode A01;
    public final String A02;
    public final String A03;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A04 = {JQz.A0x(ParsableInternalErrorCode.A00), null, null, null};

    /* loaded from: ParsableInternalErrorPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwK.A00;
        }
    }

    public /* synthetic */ ParsableInternalErrorPayload(ErrorGroup errorGroup, ParsableInternalErrorCode parsableInternalErrorCode, String str, String str2, int i) {
        if (1 != (i & 1)) {
            7mU.A00(LwK.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A01 = parsableInternalErrorCode;
        if ((i & 2) != 0) {
            this.A03 = str;
        }
        if ((i & 4) != 0) {
            this.A02 = str2;
        }
        if ((i & 8) == 0) {
            this.A00 = ErrorGroup.A05;
        } else {
            this.A00 = errorGroup;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ParsableInternalErrorPayload)) {
                return false;
            }
            ParsableInternalErrorPayload parsableInternalErrorPayload = (ParsableInternalErrorPayload) obj;
            if (this.A01 != parsableInternalErrorPayload.A01 || !11T.A0O(this.A03, parsableInternalErrorPayload.A03) || !11T.A0O(this.A02, parsableInternalErrorPayload.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1BL.A03(this.A01) + 1BL.A05(this.A03)) * 31) + 7zN.A05(this.A02);
    }

    public String toString() {
        StringBuilder A0s = JR0.A0s();
        JR0.A1H(A0s, this.A00);
        A0s.append(this.A02);
        A0s.append("\n            Code: ");
        A0s.append(this.A01);
        A0s.append("\n            Underlying Error: ");
        A0s.append(this.A03);
        return AnonymousClass001.A0d("\n        ", A0s);
    }
}
