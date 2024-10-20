package com.facebook.messaging.business.plugins.businessinitiatedcalling.admintextfrommissedcallsdontallowcalls;

import X.11T;
import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: DontAllowCallsTextUpdateBusinessCallingPermissionHandler.class */
public final class DontAllowCallsTextUpdateBusinessCallingPermissionHandler {
    public final Context A00;
    public final FbUserSession A01;
    public final AdminMessageCta A02;
    public final ThreadKey A03;
    public final String A04;

    public DontAllowCallsTextUpdateBusinessCallingPermissionHandler(Context context, FbUserSession fbUserSession, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        1BL.A1H(context, fbUserSession, adminMessageCta);
        11T.A0F(threadKey, 5);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = adminMessageCta;
        this.A04 = str;
        this.A03 = threadKey;
    }
}
