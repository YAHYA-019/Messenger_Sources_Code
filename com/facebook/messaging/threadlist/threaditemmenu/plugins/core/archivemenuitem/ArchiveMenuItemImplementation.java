package com.facebook.messaging.threadlist.threaditemmenu.plugins.core.archivemenuitem;

import X.06Z;
import X.1BK;
import X.1BY;
import X.1Br;
import X.1Hv;
import X.1Lo;
import X.2hE;
import X.3M6;
import X.3M7;
import X.4YV;
import X.5dC;
import X.7zM;
import X.AbI;
import X.C06a;
import X.C1u3;
import X.C9T;
import X.CQE;
import X.DKB;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ArchiveMenuItemImplementation.class */
public final class ArchiveMenuItemImplementation {
    public static C9T A00(Context context) {
        int i = 2131966899;
        if (AbI.A1b(1BK.A0K())) {
            i = 2131968162;
        }
        CQE cqe = new CQE();
        cqe.A00 = 1;
        cqe.A06(C1u3.A0y);
        CQE.A04(context, cqe, i);
        CQE.A03(context, cqe, 2131966900);
        return CQE.A01(cqe, DKB.A00(78));
    }

    public static void A01(Context context, 06Z r302, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        FragmentActivity activity;
        View A0F;
        2hE r0 = (2hE) 1Lo.A04(context, fbUserSession, (1BY) null, 33228);
        C06a c06a = r302.A0T;
        3M6 r311 = null;
        if (c06a.A0A().size() > 0 && (activity = ((Fragment) c06a.A0A().get(c06a.A0A().size() - 1)).getActivity()) != null && (A0F = 7zM.A0F(activity)) != null) {
            3M7 r02 = (3M7) 1Hv.A02(context, 82639);
            4YV.A1N(fbUserSession, threadSummary);
            if (((5dC) 1Br.A0B(r02.A01)).A00()) {
                r311 = new 3M6(A0F, fbUserSession, r02, threadSummary, true);
            }
        }
        r0.A01(r311, threadSummary, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r301.A01() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.5dC r301, com.facebook.messaging.model.threads.ThreadSummary r302, java.lang.Boolean r303) {
        /*
            r0 = r302
            boolean r0 = X.2oI.A03(r0)
            r304 = r0
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r305 = r0
            r0 = r305
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0S(r0)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L28
            r0 = r301
            boolean r0 = r0.A01()
            r306 = r0
            r0 = 1
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L2e
        L28:
            r0 = 0
            r308 = r0
            r0 = 0
            r309 = r0
        L2e:
            r0 = r303
            boolean r0 = r0.booleanValue()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L95
            r0 = r305
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0l(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L95
            r0 = r305
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0n(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L95
            r0 = r305
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0V(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L95
            r0 = r308
            if (r0 != 0) goto L95
            r0 = r304
            if (r0 != 0) goto L95
            r0 = r302
            X.1F9 r0 = r0.A0g
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L9b
            r0 = r309
            boolean r0 = r0.A02()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L95
            X.1F9 r0 = X.1F9.A06
            r310 = r0
            r0 = r309
            r1 = r310
            if (r0 == r1) goto L95
            X.1F9 r0 = X.1F9.A0B
            r310 = r0
            r0 = r309
            r1 = r310
            if (r0 != r1) goto L9b
        L95:
            r0 = 0
            r307 = r0
        L98:
            r0 = r307
            return r0
        L9b:
            r0 = r302
            java.lang.Integer r0 = r0.A1a
            r310 = r0
            r0 = r310
            if (r0 == 0) goto Lb2
            r0 = r310
            int r0 = r0.intValue()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L95
        Lb2:
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0l
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L98
            r0 = r310
            long r0 = r0.A04
            r311 = r0
            r0 = -18
            long r0 = (long) r0
            r313 = r0
            r0 = r311
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L98
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadlist.threaditemmenu.plugins.core.archivemenuitem.ArchiveMenuItemImplementation.A02(X.5dC, com.facebook.messaging.model.threads.ThreadSummary, java.lang.Boolean):boolean");
    }
}
