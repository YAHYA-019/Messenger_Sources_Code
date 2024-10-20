package com.facebook.messaging.inbox.fragment.plugins.core.markfolderseen;

import X.11T;
import X.1Br;
import X.1F9;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InboxMarkFolderSeenImplementation.class */
public final class InboxMarkFolderSeenImplementation {
    public 1F9 A00;
    public final 1Br A01;
    public final Context A02;

    public InboxMarkFolderSeenImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A02 = context;
        this.A01 = 1Lm.A00(context, fbUserSession, 68486);
    }
}
