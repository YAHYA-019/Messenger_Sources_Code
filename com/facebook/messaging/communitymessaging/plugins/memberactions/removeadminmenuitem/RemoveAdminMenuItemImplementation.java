package com.facebook.messaging.communitymessaging.plugins.memberactions.removeadminmenuitem;

import X.06Z;
import X.0G2;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Iw;
import X.2MQ;
import X.4YV;
import X.7zO;
import X.7zT;
import X.AbG;
import X.AbO;
import X.B0x;
import X.Bs5;
import X.C06z;
import X.C1rh;
import X.C1u3;
import X.DDq;
import X.DJY;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: RemoveAdminMenuItemImplementation.class */
public final class RemoveAdminMenuItemImplementation {
    public static final /* synthetic */ C06z[] A0B = AbO.A0f(RemoveAdminMenuItemImplementation.class);
    public Long A00;
    public final Context A01;
    public final 06Z A02;
    public final 1Br A03;
    public final Bs5 A04;
    public final DJY A05;
    public final MigColorScheme A06;
    public final User A07;
    public final 0G2 A08;
    public final 0G2 A09;
    public final 1Iw A0A;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0G2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0G2, java.lang.Object] */
    public RemoveAdminMenuItemImplementation(Context context, 06Z r303, 1Iw r304, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        7zT.A1W(context, r304, migColorScheme, djy);
        1BL.A1G(user, bs5);
        11T.A0F(r303, 7);
        this.A01 = context;
        this.A0A = r304;
        this.A06 = migColorScheme;
        this.A05 = djy;
        this.A07 = user;
        this.A04 = bs5;
        this.A02 = r303;
        this.A03 = AbG.A0c();
        this.A08 = new Object();
        this.A09 = new Object();
    }

    public final C1rh A00() {
        FbUserSession A0F = 4YV.A0F(this.A01);
        1Iw r0 = this.A0A;
        String string = r0.A0D.getString(2131964290);
        C1rh A00 = B0x.A00(2MQ.A2u, C1u3.A5s, r0, 7zO.A0U(new DDq(A0F, this, 6)), this.A06, string);
        11T.A0A(A00);
        return A00;
    }
}
