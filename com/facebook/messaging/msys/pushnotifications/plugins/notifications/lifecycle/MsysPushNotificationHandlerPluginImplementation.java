package com.facebook.messaging.msys.pushnotifications.plugins.notifications.lifecycle;

import X.11T;
import X.1Br;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MsysPushNotificationHandlerPluginImplementation.class */
public final class MsysPushNotificationHandlerPluginImplementation {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    public MsysPushNotificationHandlerPluginImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A02 = context;
        this.A00 = 1Lm.A00(context, fbUserSession, 33124);
        this.A01 = 1Lm.A00(context, fbUserSession, 16898);
    }
}
