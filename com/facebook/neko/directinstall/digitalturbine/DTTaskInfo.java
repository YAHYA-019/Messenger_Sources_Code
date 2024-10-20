package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.7zN;
import X.AnonymousClass001;
import X.C04v;
import X.DKH;
import X.Lvm;

/* loaded from: DTTaskInfo.class */
public final class DTTaskInfo extends C04v {
    public static final Companion Companion = new Object();
    public final int A00;
    public final DTApplication A01;
    public final Double A02;
    public final String A03;
    public final String A04;

    /* loaded from: DTTaskInfo$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvm.A00;
        }
    }

    public /* synthetic */ DTTaskInfo(DTApplication dTApplication, Double d, String str, String str2, int i, int i2) {
        if (3 != (i & 3)) {
            7mU.A00(Lvm.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A04 = str;
        this.A00 = i2;
        if ((i & 4) != 0) {
            this.A01 = dTApplication;
        }
        if ((i & 8) != 0) {
            this.A02 = d;
        }
        if ((i & 16) != 0) {
            this.A03 = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DTTaskInfo)) {
                return false;
            }
            DTTaskInfo dTTaskInfo = (DTTaskInfo) obj;
            if (!11T.A0O(this.A04, dTTaskInfo.A04) || this.A00 != dTTaskInfo.A00 || !11T.A0O(this.A01, dTTaskInfo.A01) || !11T.A0O(this.A02, dTTaskInfo.A02) || !11T.A0O(this.A03, dTTaskInfo.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((4YV.A02(this.A04) + this.A00) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 7zN.A05(this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DTTaskInfo(taskId=");
        A0k.append(this.A04);
        A0k.append(", status=");
        A0k.append(this.A00);
        A0k.append(", application=");
        A0k.append(this.A01);
        A0k.append(", progressValue=");
        A0k.append(this.A02);
        A0k.append(", partnerMetadata=");
        return DKH.A0o(this.A03, A0k);
    }
}
