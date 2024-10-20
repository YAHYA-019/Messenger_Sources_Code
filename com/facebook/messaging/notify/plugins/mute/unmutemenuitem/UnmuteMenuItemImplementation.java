package com.facebook.messaging.notify.plugins.mute.unmutemenuitem;

import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.2Pe;
import X.4YV;
import X.AbF;
import X.AnonymousClass001;
import X.BLc;
import X.BU3;
import X.Bst;
import X.C1u3;
import X.C9T;
import X.CQE;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.HashMap;

/* loaded from: UnmuteMenuItemImplementation.class */
public final class UnmuteMenuItemImplementation {
    public static final C9T A00(Context context) {
        11T.A0F(context, 0);
        1Bn.A0E(context, (1BY) null, 82630);
        CQE cqe = new CQE();
        cqe.A00 = 7;
        cqe.A06(C1u3.A0o);
        CQE.A02(context, cqe, 2131959556);
        return CQE.A01(cqe, "unmute");
    }

    public static final void A01(Context context, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary) {
        4YV.A1N(threadSummary, context);
        String str = null;
        Bst bst = (Bst) 1Bn.A0E(context, (1BY) null, 82630);
        if (inboxTrackableItem != null) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("at", "unmute");
            BU3.A00().A04(inboxTrackableItem, "longpressinbox:unmute", A0u);
        }
        FbUserSession A0E = 4YV.A0E(context);
        11T.A0F(A0E, 0);
        ThreadKey threadKey = threadSummary.A0l;
        String str2 = null;
        if (threadKey != null) {
            str = 1BK.A0w(threadKey);
        }
        long j = threadSummary.A06;
        if (j > 0) {
            str2 = String.valueOf(j);
        }
        ((2Pe) 1Br.A0B(bst.A01)).D5p(A0E, threadSummary.A0g, AbF.A0f(threadSummary), BLc.A08, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        if (r0.equals(com.facebook.messaging.model.threadkey.ThreadKey.A07(-14)) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(com.facebook.messaging.model.threads.ThreadSummary r301) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.notify.plugins.mute.unmutemenuitem.UnmuteMenuItemImplementation.A02(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }
}
