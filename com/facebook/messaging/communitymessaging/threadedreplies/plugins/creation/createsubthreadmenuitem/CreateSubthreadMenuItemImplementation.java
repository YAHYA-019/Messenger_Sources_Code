package com.facebook.messaging.communitymessaging.threadedreplies.plugins.creation.createsubthreadmenuitem;

import X.11T;
import X.6HM;
import X.7zR;
import X.C8S;
import X.COW;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: CreateSubthreadMenuItemImplementation.class */
public final class CreateSubthreadMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final Message A02;
    public final Capabilities A03;

    public CreateSubthreadMenuItemImplementation(Context context, FbUserSession fbUserSession, Message message, Capabilities capabilities) {
        11T.A0F(fbUserSession, 3);
        this.A00 = context;
        this.A02 = message;
        this.A01 = fbUserSession;
        this.A03 = capabilities;
    }

    public static final void A00(CreateSubthreadMenuItemImplementation createSubthreadMenuItemImplementation) {
        Context context = createSubthreadMenuItemImplementation.A00;
        6HM r0 = (6HM) 7zR.A0o(context, 50020);
        C8S A00 = COW.A00(context);
        A00.A05 = context.getString(2131957316);
        A00.A04 = context.getString(2131957310);
        r0.A01(context, new COW(A00));
    }
}
