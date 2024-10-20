package com.facebook.messaging.communitymessaging.plugins.adminonboarding.notnowcta;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.4YU;
import X.4YV;
import X.7zR;
import X.AQt;
import X.C1296Ad8;
import X.C9hg;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AdminOnboardingNotNowCtaHandler.class */
public final class AdminOnboardingNotNowCtaHandler {
    public final Context A00;

    public AdminOnboardingNotNowCtaHandler(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public final void A00(ThreadSummary threadSummary) {
        if (threadSummary != null) {
            Context context = this.A00;
            FbUserSession A0F = 4YV.A0F(context);
            1Br A00 = 1Lm.A00(context, A0F, 68149);
            C9hg c9hg = (C9hg) 1Bu.A06(context, 67982);
            ThreadKey threadKey = threadSummary.A0n;
            c9hg.A02(A0F, AQt.A01(A00, threadSummary, 15), threadKey.A04, false);
            C1296Ad8 A0W = 7zR.A0W();
            ThreadKey threadKey2 = threadSummary.A0l;
            A0W.A04(new CommunityMessagingLoggerModel(null, null, threadKey2 != null ? 4YU.A0l(threadKey2).toString() : null, String.valueOf(threadSummary.A06), 1BK.A0w(threadKey), null, null, "admin_onboarding_in_thread_banner", "dismiss", null, null, null));
        }
    }
}
