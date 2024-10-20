package com.facebook.messaging.followup.plugins.threadlistobserver.followup;

import X.11T;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* loaded from: InboxFollowupImplementation.class */
public final class InboxFollowupImplementation {
    public ImmutableList A00;
    public final Context A01;
    public final FbUserSession A02;

    public InboxFollowupImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A01 = context;
        this.A02 = fbUserSession;
    }
}
