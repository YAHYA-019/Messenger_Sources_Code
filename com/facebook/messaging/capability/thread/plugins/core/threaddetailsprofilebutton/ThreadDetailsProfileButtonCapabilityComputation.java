package com.facebook.messaging.capability.thread.plugins.core.threaddetailsprofilebutton;

import X.11T;
import X.1Bn;
import X.1Kq;
import X.4YV;
import X.5PC;
import X.67G;
import X.7zT;
import X.AbJ;
import X.C1v9;
import X.C1z1;
import X.C7Ps;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMessageThreadCannotReplyReason;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ThreadDetailsProfileButtonCapabilityComputation.class */
public final class ThreadDetailsProfileButtonCapabilityComputation {
    public static final void A00(Context context, ThreadSummary threadSummary, 67G r303, User user, C1v9 c1v9) {
        11T.A0F(context, 0);
        7zT.A1U(c1v9, threadSummary, r303);
        if (!AbJ.A0N().A02(48) || user == null || user.A0U == 1Kq.A04) {
            return;
        }
        FbUserSession A0E = 4YV.A0E(context);
        if (!user.A0E()) {
            if (user.A02() == C1z1.FULLY_BLOCKED || r303.A01(A0E, user.A0k) || user.A05) {
                return;
            }
            if (((5PC) 1Bn.A0A(82526)).A02() || threadSummary.A0n.A0x()) {
                if (C7Ps.A02(user)) {
                    return;
                }
            } else if (threadSummary.AbY() == GraphQLMessageThreadCannotReplyReason.A01) {
                return;
            }
        }
        c1v9.A00(8);
    }
}
