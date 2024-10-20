package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.C04v;
import X.JQz;
import X.Lvl;

/* loaded from: DTSession.class */
public final class DTSession extends C04v {
    public static final Companion Companion = new Object();
    public final String A00;

    /* loaded from: DTSession$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvl.A00;
        }
    }

    public /* synthetic */ DTSession(String str, int i) {
        if (1 != (i & 1)) {
            7mU.A00(Lvl.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DTSession) && 11T.A0O(this.A00, ((DTSession) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return JQz.A0q("DTSession(token=", this.A00);
    }
}
