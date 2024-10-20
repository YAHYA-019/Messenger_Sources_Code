package com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markreadmenuitem;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1F9;
import X.1Lo;
import X.1MV;
import X.2Gt;
import X.2Ov;
import X.2gF;
import X.2oI;
import X.4YU;
import X.5I5;
import X.5dC;
import X.7U7;
import X.AbF;
import X.DIG;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: MarkReadMenuItemImplementation.class */
public final class MarkReadMenuItemImplementation {
    public static final void A00(Context context, 06Z r302, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        11T.A0F(context, 0);
        1BL.A1H(fbUserSession, threadSummary, r302);
        2gF r0 = (2gF) 1Bn.A0A(66396);
        1BV A00 = 1BV.A00(84999);
        5I5 r02 = (5I5) 1Lo.A04(context, fbUserSession, (1BY) null, 49665);
        if (1Br.A07(r0.A00).AZk(2342158564023084170L)) {
            ((DIG) A00.get()).BcT(AbF.A0f(threadSummary));
        }
        ThreadKey threadKey = threadSummary.A0n;
        if ((!threadKey.A1K() || !threadSummary.A2f) && (!ThreadKey.A0d(threadKey) || !2Gt.A0F(threadSummary))) {
            r02.A03.get();
            5I5.A03(threadSummary, r02, true, true);
            return;
        }
        2Ov r03 = new 2Ov();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("thread_summary", threadSummary);
        r03.setArguments(A05);
        r03.A0m(r302, (String) null);
    }

    public static final boolean A01(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        Capabilities capabilities;
        11T.A0F(context, 0);
        11T.A0G(fbUserSession, 1, threadSummary);
        1MV A00 = 1Lo.A00(context, fbUserSession, 50207);
        1BV A002 = 1BV.A00(82621);
        ThreadKey A0f = AbF.A0f(threadSummary);
        1F9 r0 = threadSummary.A0g;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        if (2oI.A08(threadSummary) || A0f.A1E()) {
            return false;
        }
        if ((2oI.A06(threadSummary) && ((capabilities = threadSummary.A1C) == null || !4YU.A1Y(capabilities, 89))) || ThreadKey.A0l(A0f) || ThreadKey.A0V(A0f)) {
            return false;
        }
        if (r0 != 1F9.A06 || ((5dC) A002.get()).A00()) {
            return ((7U7) A00.get()).A00(threadSummary);
        }
        return false;
    }
}
