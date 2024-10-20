package com.facebook.dialtone;

import X.1BQ;
import X.1QE;
import X.1vL;
import X.2BQ;
import X.2BS;
import X.C00i;
import android.app.Activity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.dialtone.ZeroToggleStickyModeManager;
import com.facebook.zero.common.ZeroToken;

/* loaded from: ZeroToggleStickyModeManager.class */
public final class ZeroToggleStickyModeManager implements 2BS {
    public final C00i A00 = new 1BQ(99939);
    public final C00i A03 = new 1BQ(16922);
    public final C00i A01 = new 1BQ(16923);
    public final C00i A02 = new 1BQ(16634);

    public void ByR(1QE r302, String str, Throwable th) {
    }

    public void ByS(FbUserSession fbUserSession, ZeroToken zeroToken, 1QE r304, String str) {
        Activity A08 = ((1vL) this.A00.get()).A08();
        if (A08 == null || !((2BQ) this.A03.get()).A04("switch_to_dialtone_mode")) {
            return;
        }
        A08.runOnUiThread(new Runnable() { // from class: X.3ep
            public static final String __redex_internal_original_name = "ZeroToggleStickyModeManager$1";

            @Override // java.lang.Runnable
            public void run() {
                ZeroToggleStickyModeManager zeroToggleStickyModeManager = ZeroToggleStickyModeManager.this;
                C00i c00i = zeroToggleStickyModeManager.A00;
                ((1vL) c00i.get()).A0J("server_dialtone_sticky");
                1UG A082 = 1BK.A08(1BK.A07(zeroToggleStickyModeManager.A02), "dialtone_sticky_to_free_impression");
                if (A082.isSampled()) {
                    A082.A7R("carrier_id", ((1vL) c00i.get()).A0A());
                    A082.BZL();
                }
            }
        });
    }
}
