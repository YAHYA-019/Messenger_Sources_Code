package com.facebook.messaging.communitymessaging.plugins.chatcaptain.invitechatcaptain;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Iw;
import X.7zR;
import X.AbG;
import X.Bs5;
import X.DJY;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: InviteChatCaptainImplementation.class */
public final class InviteChatCaptainImplementation {
    public final Context A00;
    public final 06Z A01;
    public final LifecycleOwner A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Iw A05;
    public final Bs5 A06;
    public final DJY A07;
    public final MigColorScheme A08;
    public final User A09;

    public InviteChatCaptainImplementation(Context context, 06Z r303, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 1Iw r306, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        7zR.A1O(r306, migColorScheme);
        1BL.A1G(lifecycleOwner, djy);
        11T.A0F(r303, 8);
        this.A00 = context;
        this.A05 = r306;
        this.A08 = migColorScheme;
        this.A09 = user;
        this.A02 = lifecycleOwner;
        this.A07 = djy;
        this.A06 = bs5;
        this.A01 = r303;
        this.A03 = fbUserSession;
        this.A04 = AbG.A0c();
    }
}
