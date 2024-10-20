package com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markunreadmenuitem;

import X.11T;
import X.1BK;
import X.1BL;
import X.1BV;
import X.1BY;
import X.1F9;
import X.1Lo;
import X.1MV;
import X.2oI;
import X.4YU;
import X.5I5;
import X.5dC;
import X.7U7;
import X.AbF;
import X.F3F;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: MarkUnreadMenuItemImplementation.class */
public final class MarkUnreadMenuItemImplementation {
    public static final void A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, F3F f3f) {
        11T.A0F(threadSummary, 0);
        1BL.A1H(fbUserSession, f3f, context);
        5I5 r0 = (5I5) 1Lo.A04(context, fbUserSession, (1BY) null, 49665);
        ThreadKey threadKey = threadSummary.A0n;
        r0.A03.get();
        11T.A0F(threadKey, 0);
        5I5.A03(threadSummary, r0, false, true);
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
        return (r0 != 1F9.A06 || ((5dC) A002.get()).A00()) && !((7U7) A00.get()).A00(threadSummary);
    }
}
