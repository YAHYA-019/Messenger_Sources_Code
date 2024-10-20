package com.facebook.http.debug;

import X.1Bi;
import X.7zR;
import X.AnonymousClass001;
import X.C0dp;
import X.C0dr;
import java.util.Map;

/* loaded from: NetworkStats.class */
public final class NetworkStats {
    public long A00;
    public final C0dp A01;
    public final Map A02 = AnonymousClass001.A0u();
    public final C0dr A03;

    public NetworkStats() {
        C0dr c0dr = (C0dr) 1Bi.A03(84488);
        C0dp A0G = 7zR.A0G();
        this.A03 = c0dr;
        this.A01 = A0G;
        c0dr.now();
        this.A00 = A0G.now();
    }
}
