package com.facebook.zero.zerobalance.ping;

import X.C5vo;
import X.FH2;
import com.facebook.inject.FbInjector;

/* loaded from: ZeroPaidPingManager.class */
public final class ZeroPaidPingManager {
    public FH2 A00;

    public void A00(long j) {
        synchronized (this) {
            FH2 fh2 = this.A00;
            if (fh2 != null) {
                fh2.A03();
            }
            FbInjector.A00();
            FH2 fh22 = new FH2(j);
            this.A00 = fh22;
            synchronized (fh22.A07) {
                ((C5vo) fh22.A06.get()).A01(fh22.A01, "paid_ping_run_started");
                FH2.A01(fh22);
            }
        }
    }
}
