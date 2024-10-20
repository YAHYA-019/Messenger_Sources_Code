package com.facebook.messaging.communitymessaging.threadedreplies.plugins.threadsettings.threadsettingsrow;

import X.7zT;
import X.DHd;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: CommunityViewChatThreadedRepliesDetailsSettingsRowImpl.class */
public final class CommunityViewChatThreadedRepliesDetailsSettingsRowImpl {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;
    public final DHd A03;

    public CommunityViewChatThreadedRepliesDetailsSettingsRowImpl(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, DHd dHd) {
        7zT.A1T(context, fbUserSession, dHd);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = threadSummary;
        this.A03 = dHd;
    }
}
