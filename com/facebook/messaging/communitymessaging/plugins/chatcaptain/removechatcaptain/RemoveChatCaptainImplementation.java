package com.facebook.messaging.communitymessaging.plugins.chatcaptain.removechatcaptain;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.7zR;
import X.Bs5;
import X.DJY;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: RemoveChatCaptainImplementation.class */
public final class RemoveChatCaptainImplementation {
    public final Context A00;
    public final 06Z A01;
    public final LifecycleOwner A02;
    public final 1Br A03;
    public final 1Iw A04;
    public final Bs5 A05;
    public final DJY A06;
    public final MigColorScheme A07;
    public final User A08;

    public RemoveChatCaptainImplementation(Context context, 06Z r303, LifecycleOwner lifecycleOwner, 1Iw r305, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        7zR.A1O(r305, migColorScheme);
        1BL.A1G(lifecycleOwner, djy);
        11T.A0F(r303, 8);
        this.A00 = context;
        this.A04 = r305;
        this.A07 = migColorScheme;
        this.A08 = user;
        this.A02 = lifecycleOwner;
        this.A06 = djy;
        this.A05 = bs5;
        this.A01 = r303;
        this.A03 = 1Bu.A00(83118);
    }
}
