package com.facebook.messaging.publicchats.plugins.contextmenu.sharemessagetostorycontextmenuitem;

import X.1BK;
import X.1Br;
import X.7zM;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ShareMessageToStoryContextMenuItemImplementation.class */
public final class ShareMessageToStoryContextMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final Message A03;
    public final ThreadSummary A04;

    public ShareMessageToStoryContextMenuItemImplementation(Context context, FbUserSession fbUserSession, Message message, ThreadSummary threadSummary) {
        1BK.A1K(context, 1, fbUserSession);
        this.A00 = context;
        this.A04 = threadSummary;
        this.A03 = message;
        this.A01 = fbUserSession;
        this.A02 = 7zM.A0U();
    }
}
