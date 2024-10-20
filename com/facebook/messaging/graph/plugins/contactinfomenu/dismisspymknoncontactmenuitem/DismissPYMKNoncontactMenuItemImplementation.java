package com.facebook.messaging.graph.plugins.contactinfomenu.dismisspymknoncontactmenuitem;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;

/* loaded from: DismissPYMKNoncontactMenuItemImplementation.class */
public final class DismissPYMKNoncontactMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final User A02;

    public DismissPYMKNoncontactMenuItemImplementation(Context context, FbUserSession fbUserSession, User user) {
        1BL.A1H(context, user, fbUserSession);
        this.A00 = context;
        this.A02 = user;
        this.A01 = fbUserSession;
    }
}
