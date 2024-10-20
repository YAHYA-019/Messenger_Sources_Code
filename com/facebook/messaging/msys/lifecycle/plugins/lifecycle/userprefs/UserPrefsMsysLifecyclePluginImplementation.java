package com.facebook.messaging.msys.lifecycle.plugins.lifecycle.userprefs;

import X.11T;
import X.1BY;
import X.1Lo;
import X.C1zc;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: UserPrefsMsysLifecyclePluginImplementation.class */
public final class UserPrefsMsysLifecyclePluginImplementation {
    public final C1zc A00;
    public final Context A01;
    public final FbUserSession A02;

    public UserPrefsMsysLifecyclePluginImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A00 = (C1zc) 1Lo.A04(context, fbUserSession, (1BY) null, 33168);
    }
}
