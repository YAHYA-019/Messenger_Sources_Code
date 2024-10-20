package com.facebook.tigon.analyticslog;

import X.0S2;
import X.1BQ;
import X.1RX;
import X.1Rf;
import X.2Cj;
import X.C00i;

/* loaded from: AppNetSessionIdLogger.class */
public final class AppNetSessionIdLogger {
    public String A00;
    public final C00i A02 = new 1BQ(67199);
    public final C00i A01 = new 1BQ(66767);

    public void A00(2Cj r302) {
        String str = r302.A00;
        if (str.equals(this.A00)) {
            return;
        }
        this.A00 = str;
        1Rf A01 = 1RX.A01((1RX) this.A02.get(), 0S2.A00, "AppNetSessionId", "app_net_session_network_id_changed", false);
        if (A01.A0D()) {
            A01.A08("app_net_session_network_id", this.A00);
            A01.A0B();
        }
    }
}
