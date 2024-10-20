package com.facebook.messaging.presence.plugins.msysreadpath.msyspresenceread;

import X.11T;
import X.1Br;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MsysPresenceReadImplementation.class */
public final class MsysPresenceReadImplementation {
    public final 1Br A00;
    public final Context A01;
    public final FbUserSession A02;

    public MsysPresenceReadImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A00 = 1Lm.A00(context, fbUserSession, 33115);
    }
}
