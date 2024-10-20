package com.facebook.rtc.plugins.calllifecycle.multicall;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MultiCallCallLifecycle.class */
public final class MultiCallCallLifecycle {
    public final Context A00;
    public final FbUserSession A01;

    public MultiCallCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
