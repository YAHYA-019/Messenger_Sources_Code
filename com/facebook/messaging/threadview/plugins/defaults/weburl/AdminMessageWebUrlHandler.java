package com.facebook.messaging.threadview.plugins.defaults.weburl;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;

/* loaded from: AdminMessageWebUrlHandler.class */
public final class AdminMessageWebUrlHandler {
    public final Context A00;
    public final FbUserSession A01;
    public final AdminMessageCta A02;
    public final String A03;

    public AdminMessageWebUrlHandler(Context context, FbUserSession fbUserSession, AdminMessageCta adminMessageCta, String str) {
        1BL.A1H(context, fbUserSession, adminMessageCta);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = adminMessageCta;
        this.A03 = str;
    }
}
