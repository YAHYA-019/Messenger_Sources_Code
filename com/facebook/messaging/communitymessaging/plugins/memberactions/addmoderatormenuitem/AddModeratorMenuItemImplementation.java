package com.facebook.messaging.communitymessaging.plugins.memberactions.addmoderatormenuitem;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Iw;
import X.7zT;
import X.AbG;
import X.Bs5;
import X.DJY;
import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: AddModeratorMenuItemImplementation.class */
public final class AddModeratorMenuItemImplementation {
    public long A00;
    public long A01;
    public Long A02;
    public final Context A03;
    public final 06Z A04;
    public final 1Br A05;
    public final 1Iw A06;
    public final Bs5 A07;
    public final DJY A08;
    public final MigColorScheme A09;
    public final User A0A;

    public AddModeratorMenuItemImplementation(Context context, 06Z r303, 1Iw r304, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        7zT.A1U(r304, migColorScheme, djy);
        11T.A0F(r303, 7);
        this.A03 = context;
        this.A06 = r304;
        this.A09 = migColorScheme;
        this.A08 = djy;
        this.A0A = user;
        this.A07 = bs5;
        this.A04 = r303;
        this.A05 = AbG.A0c();
    }
}
