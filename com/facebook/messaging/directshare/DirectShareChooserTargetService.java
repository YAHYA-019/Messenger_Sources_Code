package com.facebook.messaging.directshare;

import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Lo;
import X.1fF;
import X.AnonymousClass001;
import X.C48x;
import X.CDd;
import X.CEA;
import X.D5f;
import android.content.ComponentName;
import android.content.IntentFilter;
import androidx.sharetarget.ChooserTargetServiceCompat;
import java.util.List;

/* loaded from: DirectShareChooserTargetService.class */
public class DirectShareChooserTargetService extends ChooserTargetServiceCompat {
    @Override // androidx.sharetarget.ChooserTargetServiceCompat, android.service.chooser.ChooserTargetService
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        List onGetChooserTargets;
        boolean A1P;
        C48x c48x = (C48x) 1Bn.A0A(32922);
        1fF r0 = (1fF) 1Bi.A03(66655);
        if (1BK.A0N(c48x.A00).AZk(36316469633493222L) || r0.A06()) {
            onGetChooserTargets = super.onGetChooserTargets(componentName, intentFilter);
        } else {
            CEA cea = (CEA) 1Lo.A04(this, 1BL.A0F(), (1BY) null, 82700);
            CDd cDd = cea.A02;
            synchronized (cDd) {
                onGetChooserTargets = cDd.A01;
            }
            if (onGetChooserTargets == null) {
                List A00 = CEA.A00(cea);
                synchronized (cDd) {
                    cDd.A01 = A00;
                    cDd.A00 = 1BL.A08(cDd.A02);
                }
                return A00;
            }
            synchronized (cDd) {
                A1P = AnonymousClass001.A1P(((1BL.A08(cDd.A02) - cDd.A00) > CDd.A03 ? 1 : ((1BL.A08(cDd.A02) - cDd.A00) == CDd.A03 ? 0 : -1)));
            }
            if (A1P) {
                1BK.A1E(cea.A01).execute(new D5f(cea));
                return onGetChooserTargets;
            }
        }
        return onGetChooserTargets;
    }
}
