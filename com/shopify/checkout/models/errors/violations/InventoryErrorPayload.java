package com.shopify.checkout.models.errors.violations;

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
import X.LwO;
import com.shopify.checkout.models.errors.ErrorGroup;

/* loaded from: InventoryErrorPayload.class */
public final class InventoryErrorPayload {
    public static final Companion Companion = new Object();
    public final ErrorGroup A00;
    public final InventoryErrorCode A01;
    public final ViolationErrorType A02;
    public final String A03;
    public final String A04;

    /* loaded from: InventoryErrorPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwO.A00;
        }
    }

    public /* synthetic */ InventoryErrorPayload(ErrorGroup errorGroup, InventoryErrorCode inventoryErrorCode, ViolationErrorType violationErrorType, String str, String str2, int i) {
        if (27 != (i & 27)) {
            7mU.A00(LwO.A01, i, 27);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A01 = inventoryErrorCode;
        if ((i & 4) != 0) {
            this.A04 = str2;
        }
        this.A00 = errorGroup;
        this.A02 = violationErrorType;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InventoryErrorPayload)) {
                return false;
            }
            InventoryErrorPayload inventoryErrorPayload = (InventoryErrorPayload) obj;
            if (!11T.A0O(this.A03, inventoryErrorPayload.A03) || this.A01 != inventoryErrorPayload.A01 || !11T.A0O(this.A04, inventoryErrorPayload.A04) || this.A00 != inventoryErrorPayload.A00 || this.A02 != inventoryErrorPayload.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A05(this.A00, (AnonymousClass002.A05(this.A01, 4YV.A02(this.A03)) + 1BL.A05(this.A04)) * 31));
    }

    public String toString() {
        StringBuilder A0s = JR0.A0s();
        JR0.A1H(A0s, this.A00);
        A0s.append(this.A04);
        A0s.append("\n            Code: ");
        A0s.append(this.A01);
        return AnonymousClass001.A0d("\n        ", A0s);
    }
}
