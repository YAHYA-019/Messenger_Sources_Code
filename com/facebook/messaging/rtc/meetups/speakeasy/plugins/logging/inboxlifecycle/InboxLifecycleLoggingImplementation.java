package com.facebook.messaging.rtc.meetups.speakeasy.plugins.logging.inboxlifecycle;

import X.11T;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InboxLifecycleLoggingImplementation.class */
public final class InboxLifecycleLoggingImplementation {
    public final Context A00;
    public final FbUserSession A01;

    public InboxLifecycleLoggingImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
