package com.facebook.messaging.highlightstab.logging;

import X.0fH;
import X.1Bq;
import X.1Br;
import X.2Qz;
import X.2R0;
import X.C3lu;
import android.content.Context;

/* loaded from: HTSessionManager.class */
public final class HTSessionManager {
    public final 1Br A00 = 1Bq.A00(68110);

    public final void A00(Context context) {
        0fH.A0j("HTSessionManager", "Highlights tab is destroyed. Try ending session");
        ((2Qz) this.A00.A00.get()).A00(context).A0J(0L);
    }

    public final void A01(Context context, C3lu c3lu) {
        boolean z;
        0fH.A0j("HTSessionManager", "Highlights tab is visible. Try starting session");
        2R0 A00 = ((2Qz) this.A00.A00.get()).A00(context);
        synchronized (A00) {
            z = false;
            if (A00.A00 == null) {
                z = true;
            }
        }
        if (z) {
            A00.A0O(c3lu);
        }
        A00.A0I();
    }
}
