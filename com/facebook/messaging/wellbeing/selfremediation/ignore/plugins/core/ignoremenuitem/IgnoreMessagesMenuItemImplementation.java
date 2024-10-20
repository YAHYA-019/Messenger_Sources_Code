package com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoremenuitem;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1F9;
import X.4YU;
import X.AbF;
import X.AbI;
import X.AnonymousClass001;
import X.BNT;
import X.BU2;
import X.C0D1;
import com.facebook.messaging.ignore.IgnoreMessagesDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: IgnoreMessagesMenuItemImplementation.class */
public final class IgnoreMessagesMenuItemImplementation {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r307 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C9T A00(android.content.Context r301, com.facebook.auth.usersession.FbUserSession r302, com.facebook.messaging.model.threads.ThreadSummary r303) {
        /*
            r0 = r303
            r1 = r302
            r2 = r301
            X.7zT.A1S(r0, r1, r2)
            X.2yD r0 = X.1BL.A0Q()
            r304 = r0
            r0 = 49481(0xc149, float:6.9338E-41)
            r305 = r0
            r0 = r301
            r1 = r302
            r2 = 0
            r3 = r305
            java.lang.Object r0 = X.1Lo.A04(r0, r1, r2, r3)
            X.545 r0 = (X.AnonymousClass545) r0
            r306 = r0
            r0 = r303
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L40
            r0 = r306
            r1 = r307
            com.facebook.user.model.User r0 = r0.A02(r1)
            r308 = r0
            r0 = r306
            X.28o r0 = r0.A02
            r1 = r308
            java.lang.String r0 = r0.A03(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L44
        L40:
            java.lang.String r0 = ""
            r307 = r0
        L44:
            X.CQE r0 = new X.CQE
            r309 = r0
            r0 = r309
            r0.<init>()
            r0 = r309
            r1 = 20
            r0.A00 = r1
            X.1u3 r0 = X.C1u3.A4L
            r308 = r0
            r0 = r309
            r1 = r308
            r0.A06(r1)
            r0 = r304
            boolean r0 = X.AbI.A1b(r0)
            r310 = r0
            r0 = 2131966896(0x7f133bb0, float:1.9570643E38)
            r305 = r0
            r0 = r310
            if (r0 == 0) goto L74
            r0 = 2131968164(0x7f1340a4, float:1.9573215E38)
            r305 = r0
        L74:
            r0 = r301
            r1 = r309
            r2 = r305
            X.CQE.A04(r0, r1, r2)
            r0 = r301
            r1 = r307
            r2 = 2131966908(0x7f133bbc, float:1.9570667E38)
            java.lang.String r0 = X.1BK.A0v(r0, r1, r2)
            r307 = r0
            r0 = r309
            r1 = r307
            r0.A08(r1)
            r0 = r309
            java.lang.String r1 = "ignore messages"
            X.C9T r0 = X.CQE.A01(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoremenuitem.IgnoreMessagesMenuItemImplementation.A00(android.content.Context, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threads.ThreadSummary):X.C9T");
    }

    public static final void A01(06Z r301, BU2 bu2, ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        1BL.A1F(r301, bu2);
        UserFlowLogger userFlowLogger = (UserFlowLogger) 1Bi.A03(16705);
        long generateNewFlowId = userFlowLogger.generateNewFlowId(57147395);
        AbI.A1U(userFlowLogger, "inbox_thread_actions", generateNewFlowId, false);
        BNT bnt = BNT.A0H;
        if (C0D1.A01(r301)) {
            IgnoreMessagesDialogFragment.A0C.A00(threadSummary, bnt, (MigColorScheme) null).A1C(r301, generateNewFlowId);
        }
    }

    public static final boolean A02(ThreadSummary threadSummary, Capabilities capabilities) {
        String str;
        1BK.A1M(capabilities, threadSummary);
        if (1BL.A0Q().AZk(36323337286273520L)) {
            return false;
        }
        ThreadKey A0f = AbF.A0f(threadSummary);
        1F9 r0 = threadSummary.A0g;
        boolean A1W = r0 != null ? AnonymousClass001.A1W(r0, 1F9.A06) : false;
        if (ThreadKey.A0l(A0f)) {
            return false;
        }
        return ((ThreadKey.A0d(A0f) && ((str = threadSummary.A21) == null || str.length() == 0)) || ThreadKey.A0f(A0f) || ThreadKey.A0h(A0f) || ThreadKey.A0o(A0f) || ThreadKey.A0n(A0f) || !threadSummary.A2i || !4YU.A1Y(capabilities, 32) || A1W) ? false : true;
    }
}
