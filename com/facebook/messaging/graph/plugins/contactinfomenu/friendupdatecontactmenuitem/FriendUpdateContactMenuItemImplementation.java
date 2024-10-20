package com.facebook.messaging.graph.plugins.contactinfomenu.friendupdatecontactmenuitem;

import X.1BL;
import X.1Bu;
import X.1Lm;
import X.AcP;
import X.BOZ;
import X.C7F;
import X.CQb;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: FriendUpdateContactMenuItemImplementation.class */
public final class FriendUpdateContactMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final User A02;

    public FriendUpdateContactMenuItemImplementation(Context context, FbUserSession fbUserSession, User user) {
        1BL.A1H(context, user, fbUserSession);
        this.A00 = context;
        this.A02 = user;
        this.A01 = fbUserSession;
    }

    public final void A00() {
        Context context = this.A00;
        1Bu.A06(context, 83520);
        1Bu.A06(context, 83521);
        C7F c7f = (C7F) 1Bu.A06(context, 83093);
        User user = this.A02;
        String str = user.A1E;
        String str2 = user.A1F;
        AcP acP = (AcP) 1Lm.A05(context, this.A01, 84248);
        if (acP.A0K && acP.A0I() && acP.A0J) {
            CQb A02 = AcP.A02(acP);
            CQb.A06(BOZ.A0K, A02, A02.A07, (ImmutableList) null);
        }
        c7f.A01(context, str2, str, (String) null);
    }
}
