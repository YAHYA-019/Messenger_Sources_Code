package com.facebook.mobileconfig.init;

import X.0S2;
import X.1BQ;
import X.1H2;
import X.1RX;
import X.1Rf;
import X.C00i;
import X.C2fa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: MobileConfigApi2LoggerImpl.class */
public final class MobileConfigApi2LoggerImpl {
    public final C00i A05 = new 1BQ(67199);
    public final C00i A06 = new 1BQ(66147);
    public final C00i A00 = new 1BQ(33053);
    public final C2fa A04 = new C2fa(0S2.A00, null, "mobile_config_api2_consistency", false);
    public final Object A01 = new Object();
    public final List A02 = new ArrayList();
    public final AtomicBoolean A03 = new AtomicBoolean();

    public static void A00(MobileConfigApi2LoggerImpl mobileConfigApi2LoggerImpl, String str, String str2) {
        1Rf A05 = ((1RX) mobileConfigApi2LoggerImpl.A05.get()).A05(mobileConfigApi2LoggerImpl.A04);
        if (A05.A0D()) {
            A05.A08("data", str);
            A05.A08("flags", str2);
            A05.A08("device_id", ((1H2) mobileConfigApi2LoggerImpl.A06.get()).A02());
            A05.A0B();
        }
    }
}
