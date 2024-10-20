package com.facebook.messaging.communitymessaging.plugins.adminonboarding.finishsetupcta;

import X.06Z;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bu;
import X.4YU;
import X.4YV;
import X.63D;
import X.7zO;
import X.7zR;
import X.C9hg;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AdminOnboardingFinishSetupCtaHandler.class */
public final class AdminOnboardingFinishSetupCtaHandler {
    public final Context A00;
    public final 63D A01;

    public AdminOnboardingFinishSetupCtaHandler(Context context, 63D r303) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = r303;
    }

    public final void A00(ThreadSummary threadSummary) {
        Fragment AnK;
        06Z childFragmentManager;
        if (threadSummary != null) {
            Context context = this.A00;
            C9hg c9hg = (C9hg) 1Bu.A06(context, 67982);
            FbUserSession A0F = 4YV.A0F(context);
            ThreadKey threadKey = threadSummary.A0n;
            11T.A0A(threadKey);
            ThreadKey threadKey2 = threadSummary.A0l;
            Long A0l = threadKey2 != null ? 4YU.A0l(threadKey2) : null;
            long j = threadSummary.A06;
            String valueOf = String.valueOf(j);
            63D r0 = this.A01;
            if (r0 == null || (AnK = r0.AnK()) == null || (childFragmentManager = AnK.getChildFragmentManager()) == null) {
                throw 1BK.A0h();
            }
            c9hg.A01(context, childFragmentManager, A0F, threadKey, 0S2.A0C, A0l, valueOf, null, true, true);
            c9hg.A02(A0F, null, threadKey.A04, false);
            7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, threadKey2 != null ? 1BK.A0w(threadKey2) : null, 7zO.A0q(j), 1BK.A0w(threadKey), null, null, "admin_onboarding_in_thread_banner", "finish_setup", null, null, null));
        }
    }
}
