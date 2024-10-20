package com.facebook.messaging.sms.broadcast;

import X.1BQ;
import X.1Bi;
import X.3jD;
import X.C00i;
import X.C15h;
import X.C1Y6;
import X.C2dc;
import X.C2de;
import X.C2df;
import X.C2dg;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: SmsTakeoverStateChecker.class */
public final class SmsTakeoverStateChecker {
    public int A00;
    public C2df A01;
    public C2de A02;
    public final C00i A03;
    public final C00i A04 = FbInjector.A00;
    public final FbSharedPreferences A05;
    public final C15h A06;

    /* JADX WARN: Type inference failed for: r0v19, types: [X.2de] */
    public SmsTakeoverStateChecker() {
        3jD r0 = new 3jD(this, 40);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1BQ r02 = new 1BQ(17049);
        this.A06 = r0;
        this.A05 = fbSharedPreferences;
        this.A03 = r02;
        final C2dc c2dc = (C2dc) C1Y6.A00(FbInjector.A03, "com_facebook_messaging_sms_plugins_interfaces_takeoverstate_SmsTakeOverStateListenerInterfaceSpec", "CarrierMessaging", new Object[0]);
        this.A02 = new Object(c2dc) { // from class: X.2de
            public final C2dc A00;

            {
                this.A00 = c2dc;
            }
        };
        this.A01 = new C2df((C2dg) C1Y6.A00(FbInjector.A03, "com_facebook_messaging_sms_plugins_interfaces_statechecker_SmsStateCheckerInterfaceSpec", "All", new Object[0]));
    }
}
