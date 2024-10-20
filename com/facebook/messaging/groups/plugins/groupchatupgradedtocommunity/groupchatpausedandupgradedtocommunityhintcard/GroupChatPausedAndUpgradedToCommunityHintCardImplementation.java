package com.facebook.messaging.groups.plugins.groupchatupgradedtocommunity.groupchatpausedandupgradedtocommunityhintcard;

import X.1BL;
import X.6IV;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: GroupChatPausedAndUpgradedToCommunityHintCardImplementation.class */
public final class GroupChatPausedAndUpgradedToCommunityHintCardImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;
    public final 6IV A03;
    public final MigColorScheme A04;

    public GroupChatPausedAndUpgradedToCommunityHintCardImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, 6IV r305, MigColorScheme migColorScheme) {
        1BL.A11(1, context, migColorScheme, fbUserSession);
        this.A00 = context;
        this.A02 = threadSummary;
        this.A04 = migColorScheme;
        this.A01 = fbUserSession;
        this.A03 = r305;
    }
}
