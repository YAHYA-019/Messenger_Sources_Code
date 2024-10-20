package com.facebook.messaging.communitymessaging.plugins.memberactions.banmemberfromchat;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Iw;
import X.Bs5;
import X.DJY;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: BanMemberFromChatImplementation.class */
public final class BanMemberFromChatImplementation {
    public final 06Z A00;
    public final 1Iw A01;
    public final Bs5 A02;
    public final DJY A03;
    public final MigColorScheme A04;
    public final User A05;

    public BanMemberFromChatImplementation(06Z r302, 1Iw r303, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        1BL.A1H(r303, migColorScheme, r302);
        11T.A0F(djy, 6);
        this.A01 = r303;
        this.A04 = migColorScheme;
        this.A00 = r302;
        this.A05 = user;
        this.A02 = bs5;
        this.A03 = djy;
    }
}
