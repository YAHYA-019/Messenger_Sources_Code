package com.facebook.rtc.plugins.calllifecycle.avatar;

import X.1BL;
import X.1Br;
import X.GOn;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AvatarCallLifecycle.class */
public final class AvatarCallLifecycle {
    public final 1Br A00;
    public final Context A01;
    public final FbUserSession A02;

    public AvatarCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A00 = GOn.A0c(context, fbUserSession);
    }
}
