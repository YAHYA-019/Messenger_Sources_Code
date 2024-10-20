package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.1BL;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.C04v;
import X.DKH;
import X.Lve;

/* loaded from: DTApplicationRequest.class */
public final class DTApplicationRequest extends C04v {
    public static final Companion Companion = new Object();
    public final DTApplication A00;
    public final String A01;

    /* loaded from: DTApplicationRequest$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lve.A00;
        }
    }

    public /* synthetic */ DTApplicationRequest(DTApplication dTApplication, String str, int i) {
        if (1 != (i & 1)) {
            7mU.A00(Lve.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = dTApplication;
        if ((i & 2) != 0) {
            this.A01 = str;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DTApplicationRequest)) {
                return false;
            }
            DTApplicationRequest dTApplicationRequest = (DTApplicationRequest) obj;
            if (!11T.A0O(this.A00, dTApplicationRequest.A00) || !11T.A0O(this.A01, dTApplicationRequest.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1BL.A05(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DTApplicationRequest(data=");
        A0k.append(this.A00);
        A0k.append(", taskId=");
        return DKH.A0o(this.A01, A0k);
    }
}
