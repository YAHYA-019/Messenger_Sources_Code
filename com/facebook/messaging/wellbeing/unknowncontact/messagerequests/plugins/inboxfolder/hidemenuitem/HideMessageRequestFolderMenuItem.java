package com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.inboxfolder.hidemenuitem;

import X.11T;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.4YU;
import X.4YV;
import X.5oM;
import X.7EM;
import X.7zR;
import X.AbG;
import X.AcA;
import X.BYJ;
import X.C1266Ac8;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TransportAgnosticLogging;

/* loaded from: HideMessageRequestFolderMenuItem.class */
public final class HideMessageRequestFolderMenuItem {
    public static final void A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        boolean A1X = 1BL.A1X(context, threadSummary);
        11T.A0F(fbUserSession, 3);
        7EM r0 = (7EM) 1Bn.A0E(context, (1BY) null, 83021);
        C1266Ac8 c1266Ac8 = (C1266Ac8) 1Bn.A0A(83025);
        long A00 = AcA.A00(threadSummary.A2A);
        String A0s = 7zR.A0s();
        PrivacyContext privacyContext = c1266Ac8.A01;
        Long A0i = 4YV.A0i();
        Long valueOf = Long.valueOf(A00);
        Long A0j = 4YV.A0j();
        Integer A12 = AbG.A12();
        TransportAgnosticLogging.logTalEventToPipe(privacyContext, 0, false, 6, new Object[]{3, A0j, (byte) 0, A0s, 9, A0j, (byte) 0, null, A12, A0j, (byte) 0, A0i, 3, A0j, (byte) 0, null, A12, A0j, (byte) 0, null, A12, A0j, (byte) 0, valueOf}, BYJ.A00);
        ((5oM) 4YU.A0o(fbUserSession, r0.A02, 67345)).A00(A1X ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r0.A04 != r0.intValue()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.messaging.model.threads.ThreadSummary r301, X.2SI r302) {
        /*
            r0 = r301
            r1 = r302
            X.11T.A0H(r0, r1)
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r303 = r0
            r0 = r303
            boolean r0 = r0.A1E()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L3e
            X.1F9 r0 = X.1F9.A0Q
            java.lang.Integer r0 = r0.A01()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3e
            r0 = r303
            long r0 = r0.A04
            r307 = r0
            r0 = r306
            int r0 = r0.intValue()
            long r0 = (long) r0
            r309 = r0
            r0 = r307
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = 1
            r311 = r0
            r0 = r304
            if (r0 == 0) goto L43
        L3e:
            r0 = 0
            r311 = r0
            r0 = 0
            r303 = r0
        L43:
            X.2SI r0 = X.2SI.A09
            r306 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L56
            r0 = r311
            if (r0 == 0) goto L56
            r0 = r305
            return r0
        L56:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.inboxfolder.hidemenuitem.HideMessageRequestFolderMenuItem.A01(com.facebook.messaging.model.threads.ThreadSummary, X.2SI):boolean");
    }
}
