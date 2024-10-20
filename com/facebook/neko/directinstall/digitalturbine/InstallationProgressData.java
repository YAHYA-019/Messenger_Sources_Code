package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.1BL;
import X.5Yu;
import X.7mU;
import X.7zM;
import X.AnonymousClass001;
import X.C04v;
import X.DKH;
import X.Lvo;

/* loaded from: InstallationProgressData.class */
public final class InstallationProgressData extends C04v {
    public static final Companion Companion = new Object();
    public final double A00;
    public final int A01;
    public final InstallationProgress A02;
    public final String A03;

    /* loaded from: InstallationProgressData$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvo.A00;
        }
    }

    public /* synthetic */ InstallationProgressData(InstallationProgress installationProgress, String str, double d, int i, int i2) {
        if (3 != (i & 3)) {
            7mU.A00(Lvo.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A02 = installationProgress;
        this.A03 = str;
        if ((i & 4) == 0) {
            this.A00 = installationProgress.A00.A00;
        } else {
            this.A00 = d;
        }
        if ((i & 8) == 0) {
            this.A01 = installationProgress.A00.A01;
        } else {
            this.A01 = i2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InstallationProgressData)) {
                return false;
            }
            InstallationProgressData installationProgressData = (InstallationProgressData) obj;
            if (!11T.A0O(this.A02, installationProgressData.A02) || !11T.A0O(this.A03, installationProgressData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A03, 1BL.A03(this.A02));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InstallationProgressData(data=");
        A0k.append(this.A02);
        A0k.append(", taskId=");
        return DKH.A0o(this.A03, A0k);
    }
}
