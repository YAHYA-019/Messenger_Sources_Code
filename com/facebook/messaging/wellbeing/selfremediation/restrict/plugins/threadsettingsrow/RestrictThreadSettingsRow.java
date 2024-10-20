package com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadsettingsrow;

import X.7zL;
import X.7zQ;
import X.BOp;
import X.C2623GjD;
import X.I9B;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: RestrictThreadSettingsRow.class */
public final class RestrictThreadSettingsRow {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0130, code lost:
    
        if (r315 == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.Cug A00(android.content.Context r301, com.facebook.auth.usersession.FbUserSession r302, com.facebook.messaging.model.threadkey.ThreadKey r303, com.facebook.messaging.model.threads.ThreadSummary r304, com.facebook.user.model.User r305, X.2Sh r306) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadsettingsrow.RestrictThreadSettingsRow.A00(android.content.Context, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.user.model.User, X.2Sh):X.Cug");
    }

    public static final void A01(ThreadKey threadKey, ThreadSummary threadSummary, I9B i9b, User user, boolean z) {
        BOp bOp = BOp.A0b;
        long A0H = 7zQ.A0H(user);
        C2623GjD c2623GjD = new C2623GjD(bOp, threadKey, threadSummary != null ? threadSummary.A1e : null, 7zL.A13(user), 48, A0H);
        if (z) {
            i9b.A03(c2623GjD);
        } else {
            i9b.A02(c2623GjD);
        }
    }
}
