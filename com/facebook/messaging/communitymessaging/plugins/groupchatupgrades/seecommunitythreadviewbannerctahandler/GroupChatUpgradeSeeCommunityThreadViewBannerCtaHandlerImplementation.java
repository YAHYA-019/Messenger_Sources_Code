package com.facebook.messaging.communitymessaging.plugins.groupchatupgrades.seecommunitythreadviewbannerctahandler;

import X.1BL;
import X.1Bu;
import X.22I;
import X.AbF;
import X.Czj;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: GroupChatUpgradeSeeCommunityThreadViewBannerCtaHandlerImplementation.class */
public final class GroupChatUpgradeSeeCommunityThreadViewBannerCtaHandlerImplementation {
    public final Context A00;
    public final FbUserSession A01;

    public GroupChatUpgradeSeeCommunityThreadViewBannerCtaHandlerImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public final void A00(ThreadSummary threadSummary) {
        if (threadSummary != null) {
            FbUserSession fbUserSession = this.A01;
            Context context = this.A00;
            22I A0E = AbF.A0E(context, fbUserSession);
            Czj.A02(A0E.A01((MailboxCallback) null, threadSummary.A0n.A04), 1Bu.A01(context, 82282), this, 37);
        }
    }
}
