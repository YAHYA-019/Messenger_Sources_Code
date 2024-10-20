package com.facebook.messaging.nativepagereply.plugins.faq.contextmenu;

import X.11T;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* loaded from: BusinessInboxFAQContextMenuItemImplementation.class */
public final class BusinessInboxFAQContextMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final Message A03;

    public BusinessInboxFAQContextMenuItemImplementation(Context context, FbUserSession fbUserSession, Message message) {
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = message;
        this.A02 = 1Bu.A01(context, 68329);
    }
}
