package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.Lvi;

/* loaded from: DTInstallationError.class */
public final class DTInstallationError extends C04v {
    public static final Companion Companion = new Object();
    public final int A00;
    public final DTApplication A01;
    public final String A02;

    /* loaded from: DTInstallationError$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvi.A00;
        }
    }

    public /* synthetic */ DTInstallationError(DTApplication dTApplication, String str, int i, int i2) {
        if (3 != (i & 3)) {
            7mU.A00(Lvi.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A00 = i2;
        this.A02 = str;
        if ((i & 4) != 0) {
            this.A01 = dTApplication;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DTInstallationError)) {
                return false;
            }
            DTInstallationError dTInstallationError = (DTInstallationError) obj;
            if (this.A00 != dTInstallationError.A00 || !11T.A0O(this.A02, dTInstallationError.A02) || !11T.A0O(this.A01, dTInstallationError.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A02, this.A00 * 31) + AnonymousClass001.A02(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DTInstallationError(code=");
        A0k.append(this.A00);
        A0k.append(", message=");
        A0k.append(this.A02);
        A0k.append(", application=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
