package com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.menuitem;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1F9;
import X.1Lo;
import X.7zM;
import X.7zR;
import X.Bza;
import X.C06a;
import X.C1u3;
import X.C9T;
import X.CQE;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: SpamMoveThreadMenuItem.class */
public final class SpamMoveThreadMenuItem {
    public static final C9T A00(Context context) {
        11T.A0F(context, 0);
        String A0u = 1BK.A0u(context, 2131960484);
        CQE cqe = new CQE();
        cqe.A00 = 75;
        cqe.A06(C1u3.A60);
        cqe.A07(A0u);
        cqe.A08(A0u);
        return CQE.A01(cqe, "spam_move_thread");
    }

    public static final void A01(Context context, 06Z r302, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        FragmentActivity activity;
        11T.A0F(context, 0);
        1BL.A1H(fbUserSession, r302, threadSummary);
        MigColorScheme A0c = 7zR.A0c(context);
        View view = null;
        Bza bza = (Bza) 1Lo.A04(context, fbUserSession, (1BY) null, 67681);
        C06a c06a = r302.A0T;
        if (c06a.A0A().size() > 0 && (activity = ((Fragment) c06a.A0A().get(c06a.A0A().size() - 1)).getActivity()) != null) {
            view = 7zM.A0F(activity);
        }
        bza.A00(context, view, fbUserSession, 1F9.A0I, A0c, threadSummary.A0n.A02);
    }
}
