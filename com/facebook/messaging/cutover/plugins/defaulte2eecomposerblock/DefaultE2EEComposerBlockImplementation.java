package com.facebook.messaging.cutover.plugins.defaulte2eecomposerblock;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: DefaultE2EEComposerBlockImplementation.class */
public final class DefaultE2EEComposerBlockImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;
    public final User A03;

    public DefaultE2EEComposerBlockImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, User user) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = user;
        this.A02 = threadSummary;
    }
}
