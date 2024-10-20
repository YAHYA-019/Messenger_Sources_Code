package com.facebook.messaging.bugreporter.plugins.inbox.lifecycle;

import X.11T;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InboxLifecycleImplementation.class */
public final class InboxLifecycleImplementation {
    public final Context A00;
    public final FbUserSession A01;

    public InboxLifecycleImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
