package com.facebook.messaging.communitymessaging.plugins.badges.threadviewcongratulation;

import X.1BL;
import X.1Br;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ThreadViewCongratulationImplementation.class */
public final class ThreadViewCongratulationImplementation {
    public boolean A00;
    public final 1Br A01;
    public final Context A02;
    public final FbUserSession A03;

    public ThreadViewCongratulationImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A01 = 1Lm.A00(context, fbUserSession, 67605);
    }
}
