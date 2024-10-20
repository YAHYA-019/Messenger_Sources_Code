package com.facebook.messaging.montage.gating;

import X.1Bi;
import X.2Kj;
import X.C00i;
import X.C1Y6;
import com.facebook.inject.FbInjector;

/* loaded from: MontageTabGatingUtil.class */
public final class MontageTabGatingUtil {
    public final C00i A02 = 1Bi.A02(2Kj.class, (Class) null);
    public Boolean A01 = null;
    public Boolean A00 = null;

    public MontageTabGatingUtil() {
        FbInjector.A00();
    }

    public static void A00(MontageTabGatingUtil montageTabGatingUtil) {
        synchronized (montageTabGatingUtil) {
            C1Y6.A00++;
            montageTabGatingUtil.A01 = null;
            montageTabGatingUtil.A00 = null;
        }
    }

    public boolean A01() {
        boolean booleanValue;
        synchronized (this) {
            Boolean bool = this.A00;
            if (bool == null) {
                bool = Boolean.valueOf(((2Kj) this.A02.get()).A00());
                this.A00 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    public boolean A02() {
        boolean booleanValue;
        synchronized (this) {
            Boolean bool = this.A01;
            if (bool == null) {
                bool = Boolean.valueOf(((2Kj) this.A02.get()).A00());
                this.A01 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }
}
