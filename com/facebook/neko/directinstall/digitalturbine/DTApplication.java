package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.C04v;
import X.JQz;
import X.Lvd;

/* loaded from: DTApplication.class */
public final class DTApplication extends C04v {
    public static final Companion Companion = new Object();
    public final String A00;

    /* loaded from: DTApplication$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvd.A00;
        }
    }

    public /* synthetic */ DTApplication(String str, int i) {
        if (1 != (i & 1)) {
            7mU.A00(Lvd.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DTApplication) && 11T.A0O(this.A00, ((DTApplication) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return JQz.A0q("DTApplication(packageName=", this.A00);
    }
}
