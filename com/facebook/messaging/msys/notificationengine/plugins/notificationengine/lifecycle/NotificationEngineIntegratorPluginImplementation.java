package com.facebook.messaging.msys.notificationengine.plugins.notificationengine.lifecycle;

import X.11T;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: NotificationEngineIntegratorPluginImplementation.class */
public final class NotificationEngineIntegratorPluginImplementation {
    public final Context A00;
    public final FbUserSession A01;

    public NotificationEngineIntegratorPluginImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
