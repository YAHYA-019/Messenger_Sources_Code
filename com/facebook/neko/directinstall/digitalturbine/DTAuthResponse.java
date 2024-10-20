package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.Lvf;

/* loaded from: DTAuthResponse.class */
public final class DTAuthResponse extends C04v {
    public static final Companion Companion = new Object();
    public final DTSession A00;

    /* loaded from: DTAuthResponse$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvf.A00;
        }
    }

    public /* synthetic */ DTAuthResponse(DTSession dTSession, int i) {
        if (1 != (i & 1)) {
            7mU.A00(Lvf.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = dTSession;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DTAuthResponse) && 11T.A0O(this.A00, ((DTAuthResponse) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DTAuthResponse(data=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
