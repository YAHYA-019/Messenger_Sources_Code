package com.facebook.messaging.business.plugins.leadoutcomes.leadformsettings;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: LeadFormSettings.class */
public final class LeadFormSettings {
    public final Context A00;
    public final FbUserSession A01;

    public LeadFormSettings(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
