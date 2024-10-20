package com.shopify.checkout.models;

import X.0Q8;
import X.1BK;
import X.1BL;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LwH;

/* loaded from: ProgressButton.class */
public final class ProgressButton {
    public static final Companion Companion = new Object();
    public final ProgressButtonStage A00;
    public final ProgressButtonState A01;

    /* loaded from: ProgressButton$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwH.A00;
        }
    }

    public /* synthetic */ ProgressButton(ProgressButtonStage progressButtonStage, ProgressButtonState progressButtonState, int i) {
        if (3 != (i & 3)) {
            7mU.A00(LwH.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A01 = progressButtonState;
        this.A00 = progressButtonStage;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProgressButton)) {
                return false;
            }
            ProgressButton progressButton = (ProgressButton) obj;
            if (this.A01 != progressButton.A01 || this.A00 != progressButton.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ProgressButton(state=");
        A0k.append(this.A01);
        A0k.append(", stage=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
