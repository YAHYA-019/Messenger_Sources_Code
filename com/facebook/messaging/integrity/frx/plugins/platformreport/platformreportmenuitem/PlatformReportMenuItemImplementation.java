package com.facebook.messaging.integrity.frx.plugins.platformreport.platformreportmenuitem;

import X.06Z;
import X.0S2;
import X.11T;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Lo;
import X.4YV;
import X.6Im;
import X.6In;
import X.AnonymousClass545;
import X.C1uz;
import X.C5yl;
import X.C5ym;
import X.C5yo;
import X.C5yq;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: PlatformReportMenuItemImplementation.class */
public final class PlatformReportMenuItemImplementation {
    public static void A00(Context context, 06Z r302, ThreadSummary threadSummary, User user) {
        C5ym c5ym = (C5ym) 1Bn.A0E(context, (1BY) null, 68427);
        6Im r0 = (6In) 1Bn.A0E(context, (1BY) null, 68120);
        C5yq A00 = c5ym.A00(4YV.A0D(context), threadSummary, 0S2.A0N);
        if (A00 == C5yq.A04 || A00 == C5yq.A0L) {
            r0.Czt(r302, A00, threadSummary, C5yl.A0Q);
        } else {
            if (user == null || !user.A0E()) {
                return;
            }
            C5yq c5yq = C5yq.A0u;
            11T.A0F(r302, 0);
            r0.Czt(r302, c5yq, threadSummary, C5yl.A0L);
        }
    }

    public static boolean A01(Context context, ThreadSummary threadSummary) {
        User A02;
        C1uz c1uz = (C1uz) 1Bi.A03(66227);
        AnonymousClass545 anonymousClass545 = (AnonymousClass545) 1Lo.A04(context, 4YV.A0D(context), (1BY) null, 49481);
        C5yo c5yo = (C5yo) 1Bn.A0A(68197);
        ThreadKey threadKey = threadSummary.A0n;
        if (ThreadKey.A0l(threadKey) || ThreadKey.A0o(threadKey) || ThreadKey.A0q(threadKey) || !threadSummary.A2i) {
            return false;
        }
        boolean z = false;
        if (c1uz.A02(54) && !threadKey.A1R() && (((A02 = anonymousClass545.A02(threadKey)) != null && A02.A0E()) || ((threadKey.A1K() || (threadKey.A1F() && threadSummary.A0r == null)) && 1Br.A07(c5yo.A01).AZk(36312239091028130L)))) {
            z = true;
        }
        return z;
    }
}
