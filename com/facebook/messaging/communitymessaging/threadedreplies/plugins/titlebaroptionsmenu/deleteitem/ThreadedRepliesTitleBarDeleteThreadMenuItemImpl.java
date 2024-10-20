package com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.deleteitem;

import X.06Z;
import X.11T;
import X.64W;
import X.7zT;
import X.C5xv;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadedRepliesTitleBarDeleteThreadMenuItemImpl.class */
public final class ThreadedRepliesTitleBarDeleteThreadMenuItemImpl {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final ThreadSummary A03;
    public final 64W A04;
    public final C5xv A05;

    public ThreadedRepliesTitleBarDeleteThreadMenuItemImpl(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, 64W r306, C5xv c5xv) {
        11T.A0F(context, 1);
        7zT.A11(3, r303, r306, c5xv, fbUserSession);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A01 = r303;
        this.A04 = r306;
        this.A05 = c5xv;
        this.A02 = fbUserSession;
    }
}
