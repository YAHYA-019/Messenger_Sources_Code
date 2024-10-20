package com.facebook.messaging.business.plugins.automations.mesettings;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BusinessAutomationSettings.class */
public final class BusinessAutomationSettings {
    public final Context A00;
    public final FbUserSession A01;

    public BusinessAutomationSettings(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
