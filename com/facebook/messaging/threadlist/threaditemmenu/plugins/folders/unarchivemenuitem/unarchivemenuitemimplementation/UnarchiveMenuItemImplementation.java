package com.facebook.messaging.threadlist.threaditemmenu.plugins.folders.unarchivemenuitem.unarchivemenuitemimplementation;

import X.06Z;
import X.0QD;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Br;
import X.1F9;
import X.1Hv;
import X.1Lo;
import X.2SI;
import X.2hE;
import X.3M6;
import X.3M7;
import X.5dC;
import X.7zM;
import X.C06a;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.List;

/* loaded from: UnarchiveMenuItemImplementation.class */
public final class UnarchiveMenuItemImplementation {
    public static final void A00(Context context, 06Z r302, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        1BL.A1H(context, fbUserSession, r302);
        2hE r0 = (2hE) 1Lo.A04(context, fbUserSession, (1BY) null, 33228);
        C06a c06a = r302.A0T;
        List A0A = c06a.A0A();
        11T.A0A(A0A);
        3M6 r310 = null;
        if (1BK.A1Y(A0A)) {
            List A0A2 = c06a.A0A();
            11T.A0A(A0A2);
            FragmentActivity activity = ((Fragment) 0QD.A0F(A0A2)).getActivity();
            if (activity != null) {
                3M7 r02 = (3M7) 1Hv.A02(context, 82639);
                View A0F = 7zM.A0F(activity);
                11T.A0A(A0F);
                if (((5dC) 1Br.A0B(r02.A01)).A00()) {
                    r310 = new 3M6(A0F, fbUserSession, r02, threadSummary, false);
                }
            }
        }
        r0.A01(r310, threadSummary, false);
    }

    public static final boolean A01(ThreadSummary threadSummary, 2SI r302) {
        1F9 r0;
        1BK.A1M(threadSummary, r302);
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey != null && threadKey.A1E() && r302 == 2SI.A09) {
            if (1F9.A0Q.A01() != null && threadKey.A04 == r0.intValue()) {
                return false;
            }
            if (1F9.A0K.A01() != null && threadKey.A04 == r0.intValue()) {
                return false;
            }
        }
        return (!threadSummary.A2Z || threadKey.A0z()) && (r0 = threadSummary.A0g) != null && r0 == 1F9.A06;
    }
}
