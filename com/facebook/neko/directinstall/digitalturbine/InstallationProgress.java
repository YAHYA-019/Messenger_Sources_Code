package com.facebook.neko.directinstall.digitalturbine;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.Lvn;

/* loaded from: InstallationProgress.class */
public final class InstallationProgress extends C04v {
    public static final Companion Companion = new Object();
    public final AIDLInstallationProgress A00;
    public final DTApplication A01;

    /* loaded from: InstallationProgress$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvn.A00;
        }
    }

    public /* synthetic */ InstallationProgress(AIDLInstallationProgress aIDLInstallationProgress, DTApplication dTApplication, int i) {
        if (3 != (i & 3)) {
            7mU.A00(Lvn.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A00 = aIDLInstallationProgress;
        this.A01 = dTApplication;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InstallationProgress)) {
                return false;
            }
            InstallationProgress installationProgress = (InstallationProgress) obj;
            if (!11T.A0O(this.A00, installationProgress.A00) || !11T.A0O(this.A01, installationProgress.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InstallationProgress(progress=");
        A0k.append(this.A00);
        A0k.append(", application=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
