package com.facebook.rtc.plugins.calllifecycle.logging;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.GOn;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: LoggingCallLifecycle.class */
public final class LoggingCallLifecycle {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;

    public LoggingCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = GOn.A0U(context, fbUserSession);
        this.A03 = 1Bq.A00(115690);
    }
}
