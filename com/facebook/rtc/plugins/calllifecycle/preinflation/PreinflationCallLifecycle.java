package com.facebook.rtc.plugins.calllifecycle.preinflation;

import X.1BK;
import X.1BL;
import X.1Br;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: PreinflationCallLifecycle.class */
public final class PreinflationCallLifecycle {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;

    public PreinflationCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = 1BK.A0C();
    }
}
