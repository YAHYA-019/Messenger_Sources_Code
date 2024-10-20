package com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.threadviewbanner;

import X.11T;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.63D;
import X.6QI;
import X.6mL;
import X.6mO;
import X.C2j0;
import X.C7Q1;
import X.C7Q2;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.ExecutorService;

/* loaded from: ProactiveWarningThreadViewBanner.class */
public final class ProactiveWarningThreadViewBanner {
    public C7Q1 A00;
    public C7Q2 A01;
    public 6mO A02;
    public 6mL A03;
    public boolean A04;
    public boolean A05;
    public final FbUserSession A06;
    public final C2j0 A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 6QI A0F;
    public final 63D A0G;
    public final ExecutorService A0H;
    public final Context A0I;
    public volatile boolean A0J;

    public ProactiveWarningThreadViewBanner(Context context, FbUserSession fbUserSession, 63D r304) {
        11T.A0F(context, 1);
        11T.A0F(r304, 2);
        11T.A0F(fbUserSession, 3);
        this.A0I = context;
        this.A0G = r304;
        this.A06 = fbUserSession;
        this.A08 = 1Lm.A00(context, fbUserSession, 68478);
        this.A09 = 1Bu.A01(context, 67894);
        this.A0E = 1Bq.A00(66693);
        this.A0A = 1Bq.A00(66295);
        this.A0H = (ExecutorService) 1Bi.A03(16457);
        this.A07 = (C2j0) 1Bi.A03(17085);
        this.A0F = (6QI) 1Bn.A0A(85013);
        this.A0D = 1Bu.A00(68200);
        this.A0C = 1Bu.A01(context, 68419);
        this.A0B = 1Bu.A01(context, 68479);
    }

    public static final void A00(ProactiveWarningThreadViewBanner proactiveWarningThreadViewBanner) {
        synchronized (proactiveWarningThreadViewBanner) {
            C7Q2 c7q2 = proactiveWarningThreadViewBanner.A01;
            if (c7q2 != null) {
                proactiveWarningThreadViewBanner.A07.A03(c7q2);
            }
            proactiveWarningThreadViewBanner.A01 = null;
        }
    }
}
