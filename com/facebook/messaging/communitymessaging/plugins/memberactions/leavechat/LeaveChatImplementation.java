package com.facebook.messaging.communitymessaging.plugins.memberactions.leavechat;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.7zT;
import X.Bs5;
import X.DJY;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: LeaveChatImplementation.class */
public final class LeaveChatImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Iw A05;
    public final Bs5 A06;
    public final DJY A07;
    public final MigColorScheme A08;

    public LeaveChatImplementation(Context context, 06Z r303, FbUserSession fbUserSession, 1Iw r305, Bs5 bs5, DJY djy, MigColorScheme migColorScheme) {
        7zT.A11(2, r305, migColorScheme, r303, djy);
        11T.A0F(fbUserSession, 7);
        this.A00 = context;
        this.A05 = r305;
        this.A06 = bs5;
        this.A08 = migColorScheme;
        this.A01 = r303;
        this.A07 = djy;
        this.A02 = fbUserSession;
        this.A03 = 1Bu.A01(context, 82542);
        this.A04 = 1Bu.A01(context, 17010);
    }
}
