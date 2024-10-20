package com.facebook.messaging.cutover.plugins.threadsettings.masterbuild.cutovertool;

import X.7zR;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadLevelCutoverToolRow.class */
public final class ThreadLevelCutoverToolRow {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadKey A02;

    public ThreadLevelCutoverToolRow(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        7zR.A1N(context, fbUserSession);
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = fbUserSession;
    }
}
