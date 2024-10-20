package com.facebook.zero.sdk.fb4a;

import X.11T;
import X.1BQ;
import X.1Bn;
import X.1EZ;
import X.1Fw;
import X.1Pz;
import X.1QE;
import X.1vQ;
import X.2BS;
import X.3oH;
import X.4jC;
import X.5Xz;
import X.5Y0;
import X.Bo3;
import X.C00i;
import X.C07224jB;
import X.D9c;
import X.EDs;
import X.EDz;
import X.EYD;
import X.Eqk;
import X.Fud;
import X.InterfaceC07234jG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.zero.common.ZeroToken;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: AppStateListener.class */
public final class AppStateListener implements 2BS, 1vQ {
    public final C00i A00;
    public final C00i A01 = new 1BQ(16650);
    public final C00i A02;
    public final C00i A03;

    public AppStateListener() {
        1BQ r0 = new 1BQ(98627);
        this.A03 = r0;
        1BQ r02 = new 1BQ(66820);
        this.A02 = r02;
        this.A00 = new 1BQ(16385);
        if (((1Pz) r02.get()).A02()) {
            Set set = ((Fud) r0.get()).A07;
            synchronized (set) {
                set.add(this);
            }
        }
    }

    public void ByR(1QE r302, String str, Throwable th) {
    }

    public void ByS(FbUserSession fbUserSession, ZeroToken zeroToken, 1QE r304, String str) {
        if (5Xz.A00((String) 1Bn.A0A(98484)) == r304) {
            ZeroSDKServiceProvider zeroSDKServiceProvider = (ZeroSDKServiceProvider) this.A01.get();
            ZeroSDKServiceProvider.A01(zeroSDKServiceProvider, true);
            C07224jB c07224jB = (C07224jB) zeroSDKServiceProvider.A02.get();
            if (!C07224jB.A00(c07224jB)) {
                C00i c00i = c07224jB.A00.A00;
                if (c00i.get() != null) {
                    4jC r0 = (4jC) c00i.get();
                    11T.A0D(r0);
                    if (((InterfaceC07234jG) r0.A09.get()).CxU()) {
                        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0A(16428));
                        Bo3 bo3 = (Bo3) r0.A02.get();
                        ((Executor) bo3.A01.get()).execute(new D9c(A04, r0.A0B, bo3));
                    }
                }
            }
            5Y0 r02 = (5Y0) zeroSDKServiceProvider.A04.get();
            3oH r03 = ((ZeroSDKServiceProvider) r02.A01.get()).A00;
            if (r03 == null || !((Eqk) r03.getState()).A08) {
                r02.A00.get();
            } else {
                if (zeroToken.equals(ZeroToken.A0N) || r304 != 1QE.A02) {
                    return;
                }
                r03.ANn(new EDz(EYD.A00(zeroToken.A07), zeroToken.A0C, zeroToken.A09.contains("check_status_update_content")));
            }
        }
    }

    public void onAfterDialtoneStateChanged(boolean z, Context context) {
        ZeroSDKServiceProvider zeroSDKServiceProvider = (ZeroSDKServiceProvider) this.A01.get();
        if (zeroSDKServiceProvider.A00 != null) {
            zeroSDKServiceProvider.A00.ANn(new EDs(5Xz.A00((String) 1Bn.A0A(98484)), z));
            ZeroSDKServiceProvider.A01(zeroSDKServiceProvider, false);
        }
    }

    public void onBeforeDialtoneStateChanged(boolean z) {
    }
}
