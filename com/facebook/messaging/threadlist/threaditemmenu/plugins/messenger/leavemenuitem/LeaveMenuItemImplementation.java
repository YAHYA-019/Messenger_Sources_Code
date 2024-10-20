package com.facebook.messaging.threadlist.threaditemmenu.plugins.messenger.leavemenuitem;

import X.06Z;
import X.11T;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1F9;
import X.1G1;
import X.2Ph;
import X.2oI;
import X.4YU;
import X.5OA;
import X.6HY;
import X.7zT;
import X.AbF;
import X.C1u3;
import X.C2fb;
import X.C9T;
import X.CPZ;
import X.CQE;
import X.CbX;
import X.ClF;
import X.DEq;
import X.DGg;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: LeaveMenuItemImplementation.class */
public final class LeaveMenuItemImplementation {
    public static final C9T A00(Context context, ThreadSummary threadSummary) {
        int i;
        11T.A0H(context, threadSummary);
        1Bi.A03(66554);
        if (C2fb.A00(threadSummary)) {
            i = 2131958585;
        } else {
            i = 2131958603;
            if (2oI.A03(threadSummary)) {
                i = 2131958584;
            }
        }
        CQE cqe = new CQE();
        cqe.A00 = 4;
        cqe.A06(C1u3.A3z);
        CQE.A02(context, cqe, i);
        return CQE.A01(cqe, "leave conversation");
    }

    public static final void A01(Context context, 06Z r302, FbUserSession fbUserSession, CbX cbX, ThreadSummary threadSummary) {
        11T.A0F(context, 0);
        7zT.A1W(threadSummary, r302, fbUserSession, cbX);
        if (((2Ph) 1Bn.A0E(context, (1BY) null, 17010)).A0E(threadSummary) || !(AbF.A1X(threadSummary) || 2oI.A06(threadSummary))) {
            cbX.A01(r302, new ClF(threadSummary, 5), threadSummary, (6HY) null);
        } else {
            ((CPZ) 1Bn.A0E(context, (1BY) null, 82542)).A04(context, r302, fbUserSession, (DGg) null, (DEq) null, threadSummary, "channel_list", "leave_chat_button");
        }
    }

    public static final boolean A02(FbUserSession fbUserSession, ThreadSummary threadSummary, Capabilities capabilities) {
        1F9 r0;
        1BL.A1H(capabilities, threadSummary, fbUserSession);
        boolean A05 = 5OA.A05(threadSummary, ((1G1) fbUserSession).A02);
        if (!(threadSummary.A0n.A0w() && (r0 = threadSummary.A0g) != null && r0.A02()) && A05) {
            return 4YU.A1Y(capabilities, 28);
        }
        return false;
    }
}
