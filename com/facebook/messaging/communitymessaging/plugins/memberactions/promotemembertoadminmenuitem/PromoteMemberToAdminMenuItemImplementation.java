package com.facebook.messaging.communitymessaging.plugins.memberactions.promotemembertoadminmenuitem;

import X.06Z;
import X.0G2;
import X.11T;
import X.1Br;
import X.1Iw;
import X.7zT;
import X.AbG;
import X.AbO;
import X.Bs5;
import X.C06z;
import X.DJY;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: PromoteMemberToAdminMenuItemImplementation.class */
public final class PromoteMemberToAdminMenuItemImplementation {
    public static final /* synthetic */ C06z[] A0C = AbO.A0f(PromoteMemberToAdminMenuItemImplementation.class);
    public Long A00;
    public final Context A01;
    public final 06Z A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Iw A05;
    public final Bs5 A06;
    public final DJY A07;
    public final MigColorScheme A08;
    public final User A09;
    public final 0G2 A0A;
    public final 0G2 A0B;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0G2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0G2, java.lang.Object] */
    public PromoteMemberToAdminMenuItemImplementation(Context context, 06Z r303, FbUserSession fbUserSession, 1Iw r305, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        7zT.A1U(r305, migColorScheme, djy);
        11T.A0F(r303, 7);
        this.A01 = context;
        this.A05 = r305;
        this.A08 = migColorScheme;
        this.A07 = djy;
        this.A09 = user;
        this.A06 = bs5;
        this.A02 = r303;
        this.A03 = fbUserSession;
        this.A04 = AbG.A0c();
        this.A0A = new Object();
        this.A0B = new Object();
    }
}
