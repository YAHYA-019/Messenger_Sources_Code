package com.facebook.messaging.threaddelete.plugins.threadsettingsrow.deleteconversation;

import X.1BK;
import X.2oI;
import X.4YU;
import X.7zR;
import X.AbJ;
import X.BOn;
import X.CQo;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsDeleteConversationRow.class */
public final class ThreadSettingsDeleteConversationRow {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d8, code lost:
    
        if (((X.1Wi) X.1Br.A0B(r0)).A01() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00db, code lost:
    
        r314 = 2131966930;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ee, code lost:
    
        if (X.2oI.A07(r304) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.Cug A00(android.content.Context r301, X.06Z r302, com.facebook.auth.usersession.FbUserSession r303, com.facebook.messaging.model.threads.ThreadSummary r304, X.DHc r305) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threaddelete.plugins.threadsettingsrow.deleteconversation.ThreadSettingsDeleteConversationRow.A00(android.content.Context, X.06Z, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threads.ThreadSummary, X.DHc):X.Cug");
    }

    public static final void A01(ThreadSummary threadSummary, boolean z) {
        if (2oI.A07(threadSummary)) {
            AbJ.A0W().A0L(4YU.A0l(threadSummary.A0n), z);
        } else if (2oI.A06(threadSummary)) {
            CQo.A0H(BOn.A0N, 7zR.A0a(), Long.valueOf(threadSummary.A0n.A0r()), 1BK.A1D("is_success", z ? "Y" : "N"), 41, 27, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r301.A08(r302) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(X.C60b r301, com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r303
            X.11T.A0F(r0, r1)
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r302
            boolean r0 = X.AbL.A1L(r0)     // Catch: java.lang.Throwable -> L17
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L24
            goto L18
        L17:
            throw r0
        L18:
            r0 = r301
            r1 = r302
            boolean r0 = r0.A08(r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L26
        L24:
            r0 = 0
            r303 = r0
        L26:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threaddelete.plugins.threadsettingsrow.deleteconversation.ThreadSettingsDeleteConversationRow.A02(X.60b, com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }
}
