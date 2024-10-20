package com.facebook.messaging.reactions.plugins.reactions.messagenux.dataload;

import X.11T;
import X.1BY;
import X.1Lo;
import X.6iB;
import X.6qY;
import X.7NX;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MessageNuxDataLoad.class */
public final class MessageNuxDataLoad {
    public final 7NX A00;
    public final 6qY A01;
    public final Context A02;

    public MessageNuxDataLoad(Context context, FbUserSession fbUserSession, 6iB r304) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r304, 3);
        this.A02 = context;
        this.A01 = (6qY) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67662);
        this.A00 = new 7NX(r304);
    }
}
