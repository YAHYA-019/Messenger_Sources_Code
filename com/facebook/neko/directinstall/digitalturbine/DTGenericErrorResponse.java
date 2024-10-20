package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.Lvh;

/* loaded from: DTGenericErrorResponse.class */
public final class DTGenericErrorResponse extends C04v {
    public static final Companion Companion = new Object();
    public final DTGenericError A00;

    /* loaded from: DTGenericErrorResponse$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvh.A00;
        }
    }

    public /* synthetic */ DTGenericErrorResponse(DTGenericError dTGenericError, int i) {
        if (1 != (i & 1)) {
            7mU.A00(Lvh.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = dTGenericError;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DTGenericErrorResponse) && 11T.A0O(this.A00, ((DTGenericErrorResponse) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DTGenericErrorResponse(data=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
