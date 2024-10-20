package com.facebook.common.networkmonitor;

import X.0S2;
import X.1BQ;
import X.C00i;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: NetworkConnectionMonitor.class */
public final class NetworkConnectionMonitor {
    public ConnectivityManager.NetworkCallback A00;
    public volatile NetworkCapabilities A03 = null;
    public final C00i A02 = new 1BQ(16687);
    public final C00i A01 = new 1BQ(16385);
    public volatile Integer A04 = 0S2.A00;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r0.hasCapability(16) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A01
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1BK.A0N(r0)
            r303 = r0
            r0 = 36310340716134581(0x810010000f00b5, double:3.026143906665386E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L4d
            r0 = r301
            android.net.NetworkCapabilities r0 = r0.A03
            r303 = r0
            r0 = r301
            java.lang.Integer r0 = r0.A04
            r307 = r0
            java.lang.Integer r0 = X.0S2.A0C
            r302 = r0
            r0 = r307
            r1 = r302
            if (r0 != r1) goto L45
            r0 = r303
            if (r0 == 0) goto L45
            r0 = r303
            r1 = 16
            boolean r0 = r0.hasCapability(r1)
            r308 = r0
            r0 = 1
            r306 = r0
            r0 = r308
            if (r0 != 0) goto L4a
        L45:
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
        L4a:
            r0 = r306
            return r0
        L4d:
            r0 = r301
            X.00i r0 = r0.A02
            java.lang.Object r0 = r0.get()
            com.facebook.common.network.FbNetworkManager r0 = (com.facebook.common.network.FbNetworkManager) r0
            boolean r0 = r0.A0M()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.networkmonitor.NetworkConnectionMonitor.A00():boolean");
    }
}
