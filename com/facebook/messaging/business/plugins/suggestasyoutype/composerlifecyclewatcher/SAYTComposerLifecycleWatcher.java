package com.facebook.messaging.business.plugins.suggestasyoutype.composerlifecyclewatcher;

import X.2S4;
import X.6Qf;
import X.COd;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: SAYTComposerLifecycleWatcher.class */
public final class SAYTComposerLifecycleWatcher {
    public final Context A00;
    public final FbUserSession A01;
    public final COd A02;
    public final 6Qf A03;

    public SAYTComposerLifecycleWatcher(Context context, FbUserSession fbUserSession, 2S4 r304, 6Qf r305) {
        this.A03 = r305;
        this.A02 = COd.A00(context, r304);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
