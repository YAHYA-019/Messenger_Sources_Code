package com.facebook.messaging.communitymessaging.threadedreplies.plugins.creation.viewsubthreadmenuitem;

import X.11T;
import X.1BK;
import X.1Hv;
import X.5SW;
import X.6HS;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.facebook.messaging.threadview.params.ThreadAndMaybeMessage;

/* loaded from: ViewSubthreadMenuItemImplementation.class */
public final class ViewSubthreadMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final Message A02;

    public ViewSubthreadMenuItemImplementation(Context context, FbUserSession fbUserSession, Message message) {
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = message;
    }

    public static final void A00(ViewSubthreadMenuItemImplementation viewSubthreadMenuItemImplementation, ThreadKey threadKey) {
        Context context = viewSubthreadMenuItemImplementation.A00;
        11T.A0F(context, 1);
        1Hv.A02(context, 68322);
        Message message = viewSubthreadMenuItemImplementation.A02;
        ThreadKey threadKey2 = message.A0V;
        if (threadKey2 == null) {
            throw 1BK.A0h();
        }
        ((6HS) 1Hv.A02(context, 50024)).A09(threadKey, (MessageDeepLinkInfo) null, new ThreadAndMaybeMessage(threadKey2, message.A1V), 5SW.A0S, "ThreadedRepliesOpenHelper.openThreadedRepliesSubthread", false);
    }
}
