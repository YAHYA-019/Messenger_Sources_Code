package com.facebook.rtc.plugins.calllifecycle.ondatamessage;

import X.1BL;
import X.1Br;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: OnDataMessageCallLifecycle.class */
public final class OnDataMessageCallLifecycle {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;

    public OnDataMessageCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = 1Lm.A00(context, fbUserSession, 114987);
        this.A02 = 1Lm.A00(context, fbUserSession, 99985);
        this.A01 = 1Lm.A00(context, fbUserSession, 114906);
    }
}
