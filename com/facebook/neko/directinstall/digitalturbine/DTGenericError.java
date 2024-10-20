package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.7zM;
import X.AnonymousClass001;
import X.C04v;
import X.DKH;
import X.Lvg;

/* loaded from: DTGenericError.class */
public final class DTGenericError extends C04v {
    public static final Companion Companion = new Object();
    public final int A00;
    public final String A01;

    /* loaded from: DTGenericError$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvg.A00;
        }
    }

    public /* synthetic */ DTGenericError(String str, int i, int i2) {
        if (3 != (i & 3)) {
            7mU.A00(Lvg.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A00 = i2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DTGenericError)) {
                return false;
            }
            DTGenericError dTGenericError = (DTGenericError) obj;
            if (this.A00 != dTGenericError.A00 || !11T.A0O(this.A01, dTGenericError.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DTGenericError(code=");
        A0k.append(this.A00);
        A0k.append(", message=");
        return DKH.A0o(this.A01, A0k);
    }
}
