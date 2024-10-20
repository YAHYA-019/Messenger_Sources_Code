package com.facebook.common.startupconfig.init;

import X.0GT;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Nq;
import X.C09184pa;
import android.os.SystemClock;

/* loaded from: StartupConfigsIniter.class */
public final class StartupConfigsIniter implements 1Nq {
    public final C09184pa A00 = (C09184pa) 1Bi.A03(66851);

    public int Adi() {
        return -1;
    }

    public void BqJ(int i) {
        C09184pa c09184pa = this.A00;
        if (SystemClock.elapsedRealtime() - C09184pa.A07.get() > 10000) {
            c09184pa.A01();
        } else {
            0fH.A0j(C09184pa.A06, "Not enough time since last save to resave");
            11T.A0A(0GT.A00(c09184pa.A00));
        }
    }
}
