package com.facebook.messaging.graph.plugins.contactinfomenu.blockcontactmenuitem;

import X.06Z;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.7zM;
import android.content.Context;
import com.facebook.user.model.User;

/* loaded from: BlockContactMenuItemImplementation.class */
public final class BlockContactMenuItemImplementation {
    public final 06Z A00;
    public final 1Br A01;
    public final 1Br A02;
    public final User A03;
    public final Context A04;

    public BlockContactMenuItemImplementation(Context context, 06Z r303, User user) {
        1BL.A1H(context, user, r303);
        this.A04 = context;
        this.A03 = user;
        this.A00 = r303;
        this.A02 = 7zM.A0e(context);
        this.A01 = 1Bu.A01(context, 50188);
    }
}
