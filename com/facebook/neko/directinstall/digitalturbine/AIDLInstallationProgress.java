package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.1BL;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.C04v;
import X.DKH;
import X.Lvc;

/* loaded from: AIDLInstallationProgress.class */
public final class AIDLInstallationProgress extends C04v {
    public static final Companion Companion = new Object();
    public final double A00;
    public final int A01;
    public final int A02;

    /* loaded from: AIDLInstallationProgress$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvc.A00;
        }
    }

    public /* synthetic */ AIDLInstallationProgress(double d, int i, int i2, int i3) {
        if (3 != (i & 3)) {
            7mU.A00(Lvc.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A00 = d;
        this.A01 = i2;
        if ((i & 4) != 0) {
            this.A02 = i3;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AIDLInstallationProgress)) {
                return false;
            }
            AIDLInstallationProgress aIDLInstallationProgress = (AIDLInstallationProgress) obj;
            if (Double.compare(this.A00, aIDLInstallationProgress.A00) != 0 || this.A01 != aIDLInstallationProgress.A01 || this.A02 != aIDLInstallationProgress.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((1BL.A01(Double.doubleToLongBits(this.A00)) * 31) + this.A01) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AIDLInstallationProgress(value=");
        A0k.append(this.A00);
        A0k.append(", action=");
        A0k.append(this.A01);
        A0k.append(", status=");
        return DKH.A0p(A0k, this.A02);
    }
}
