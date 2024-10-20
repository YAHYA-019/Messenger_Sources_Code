package com.facebook.messaging.communitymessaging.plugins.communityinfo.communityinvitelinkrow;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: CommunityInviteLinkRowImplementation.class */
public final class CommunityInviteLinkRowImplementation {
    public final Context A00;
    public final ThreadSummary A01;
    public final FbUserSession A02;

    public CommunityInviteLinkRowImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        this.A01 = threadSummary;
        this.A02 = fbUserSession;
        this.A00 = context;
    }
}
