package com.facebook.messaging.communitymessaging.plugins.pausechat.pausechatthreadmenuitem;

import X.06Z;
import X.7zT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: PauseChatThreadMenuItemImplementation.class */
public final class PauseChatThreadMenuItemImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final ThreadSummary A03;

    public PauseChatThreadMenuItemImplementation(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        7zT.A1T(context, r303, fbUserSession);
        this.A00 = context;
        this.A01 = r303;
        this.A03 = threadSummary;
        this.A02 = fbUserSession;
    }
}
