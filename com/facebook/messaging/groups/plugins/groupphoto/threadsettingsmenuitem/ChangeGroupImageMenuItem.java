package com.facebook.messaging.groups.plugins.groupphoto.threadsettingsmenuitem;

import X.1BK;
import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: ChangeGroupImageMenuItem.class */
public final class ChangeGroupImageMenuItem {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;
    public final Capabilities A03;

    public ChangeGroupImageMenuItem(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, Capabilities capabilities) {
        1BL.A11(1, context, fbUserSession, capabilities);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = capabilities;
        if (threadSummary == null) {
            throw 1BK.A0h();
        }
        this.A02 = threadSummary;
    }
}
