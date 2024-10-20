package com.facebook.messaging.threadsettings.plugins.threadviewentrypoint.implementation;

import X.1BQ;
import X.5Sh;
import X.64W;
import X.6FI;
import X.C00i;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsButtonImplementation.class */
public final class ThreadSettingsButtonImplementation {
    public final Context A00;
    public final C00i A01 = new 1BQ(17012);
    public final ThreadKey A02;
    public final 5Sh A03;
    public final 64W A04;
    public final 6FI A05;
    public final FbUserSession A06;

    public ThreadSettingsButtonImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 5Sh r305, 64W r306, 6FI r307) {
        this.A00 = context;
        this.A06 = fbUserSession;
        this.A05 = r307;
        this.A04 = r306;
        this.A02 = threadKey;
        this.A03 = r305;
    }
}
