package com.facebook.messaging.captiveportal;

import X.05X;
import X.05Y;
import X.0ER;
import X.11T;
import X.16J;
import X.1BP;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1GU;
import X.1HG;
import X.C00i;
import X.C10904ux;
import X.C10914uy;
import X.C10924uz;
import X.C11914xy;
import X.C2c;
import X.C45j;
import X.D5R;
import X.D7M;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.facebook.common.netchecker.NetChecker;
import com.facebook.inject.FbInjector;

/* loaded from: CaptivePortalNotificationManager.class */
public final class CaptivePortalNotificationManager {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1BP A07 = FbInjector.A00;
    public final C10904ux A08;

    public CaptivePortalNotificationManager() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A03 = 1HG.A00(A00, 65728);
        this.A04 = 1Bq.A00(32903);
        this.A01 = 1Bq.A00(84021);
        this.A06 = 1Bu.A00(49385);
        this.A00 = 1Bq.A00(16458);
        this.A02 = 1Bq.A00(16511);
        this.A08 = (C10904ux) 1Bn.A0A(49358);
        this.A05 = 1Bq.A00(66289);
    }

    public static final void A00(CaptivePortalNotificationManager captivePortalNotificationManager) {
        1GU r313;
        D7M d5r;
        if (((NetChecker) captivePortalNotificationManager.A04.A00.get()).A0B == C45j.CAPTIVE_PORTAL) {
            05X r0 = new 05X();
            ((05Y) r0).A0A = "android.intent.action.VIEW";
            ((05Y) r0).A06 = ((C2c) 1Br.A0B(captivePortalNotificationManager.A01)).A00();
            16J r02 = new 16J();
            r02.A05(new String[]{"http"});
            r02.A02(new String[]{"portal.fb.com"});
            r02.A04(new String[]{"/mobile/redirect/"});
            0ER A00 = r02.A00();
            ((05Y) r0).A01 = ((05Y) r0).A01 | 1 | 4;
            r0.A07(A00);
            ((05Y) r0).A0E.add("android.intent.category.BROWSABLE");
            Context context = FbInjector.A03;
            11T.A0A(context);
            PendingIntent A01 = r0.A01(context, 0, 134217728);
            C10904ux c10904ux = captivePortalNotificationManager.A08;
            Context context2 = FbInjector.A03;
            11T.A0A(context2);
            C10914uy A002 = c10904ux.A00(context2, null, null, 10011);
            1Br.A0C(captivePortalNotificationManager.A05);
            A002.A0B(2132347032);
            ((C10924uz) A002).A03 = 0;
            A002.A0D(A01);
            A002.A0C(0L);
            Context context3 = FbInjector.A03;
            11T.A0A(context3);
            A002.A0L(context3.getString(2131954806));
            Context context4 = FbInjector.A03;
            11T.A0A(context4);
            A002.A0K(context4.getString(2131954804));
            Notification A07 = A002.A07();
            11T.A0A(A07);
            C00i c00i = captivePortalNotificationManager.A06.A00;
            try {
                ((C11914xy) c00i.get()).A02.cancel(10011);
                C11914xy c11914xy = (C11914xy) c00i.get();
                if (c11914xy.A03.BUX()) {
                    try {
                        c11914xy.A02.notify(10011, A07);
                        return;
                    } catch (NullPointerException unused) {
                        return;
                    }
                }
                return;
            } catch (NullPointerException | SecurityException unused2) {
                r313 = (1GU) 1Br.A0B(captivePortalNotificationManager.A00);
                d5r = new D7M(A07, captivePortalNotificationManager);
            }
        } else {
            try {
                ((C11914xy) captivePortalNotificationManager.A06.A00.get()).A02.cancel(10011);
                return;
            } catch (NullPointerException | SecurityException unused3) {
                r313 = (1GU) 1Br.A0B(captivePortalNotificationManager.A00);
                d5r = new D5R(captivePortalNotificationManager);
            }
        }
        r313.CY4(d5r, 3000L);
    }
}
