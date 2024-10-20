package com.facebook.messaging.contacts.ranking.featurewallet.plugins.featurewallet.inboxloadhandler;

import X.1BL;
import X.1BY;
import X.1Bn;
import X.Hst;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InboxLoadHandlerImplementation.class */
public final class InboxLoadHandlerImplementation {
    public final FbUserSession A00;
    public final Hst A01;
    public final Context A02;

    public InboxLoadHandlerImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A02 = context;
        this.A00 = fbUserSession;
        this.A01 = (Hst) 1Bn.A0E(context, (1BY) null, 115430);
    }
}
