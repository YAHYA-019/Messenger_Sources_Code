package com.facebook.messaging.msys.thread.plugins.threadsettingslifecycle.threadsession;

import X.1Br;
import X.7zR;
import X.AbG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: TamThreadSessionManager.class */
public final class TamThreadSessionManager {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final ThreadKey A03;

    public TamThreadSessionManager(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        7zR.A1N(context, fbUserSession);
        this.A00 = context;
        this.A03 = threadKey;
        this.A01 = fbUserSession;
        this.A02 = AbG.A0U();
    }
}
