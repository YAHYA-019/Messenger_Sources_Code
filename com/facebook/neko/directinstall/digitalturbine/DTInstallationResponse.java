package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.1BK;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.Lvk;

/* loaded from: DTInstallationResponse.class */
public final class DTInstallationResponse extends C04v {
    public static final Companion Companion = new Object();
    public final DTApplication A00;
    public final String A01;

    /* loaded from: DTInstallationResponse$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvk.A00;
        }
    }

    public /* synthetic */ DTInstallationResponse(DTApplication dTApplication, String str, int i) {
        if (3 != (i & 3)) {
            7mU.A00(Lvk.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A01 = str;
        this.A00 = dTApplication;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DTInstallationResponse)) {
                return false;
            }
            DTInstallationResponse dTInstallationResponse = (DTInstallationResponse) obj;
            if (!11T.A0O(this.A01, dTInstallationResponse.A01) || !11T.A0O(this.A00, dTInstallationResponse.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 4YV.A02(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DTInstallationResponse(taskId=");
        A0k.append(this.A01);
        A0k.append(", data=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
