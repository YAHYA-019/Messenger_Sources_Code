package com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.communityinviteaccessorycomponent;

import X.7zT;
import X.C4NG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CommunityInviteAccessoryComponentImplementation.class */
public final class CommunityInviteAccessoryComponentImplementation {
    public final FbUserSession A00;
    public final C4NG A01;
    public final MigColorScheme A02;
    public final Context A03;

    public CommunityInviteAccessoryComponentImplementation(Context context, FbUserSession fbUserSession, C4NG c4ng, MigColorScheme migColorScheme) {
        7zT.A1W(context, migColorScheme, c4ng, fbUserSession);
        this.A03 = context;
        this.A02 = migColorScheme;
        this.A01 = c4ng;
        this.A00 = fbUserSession;
    }
}
