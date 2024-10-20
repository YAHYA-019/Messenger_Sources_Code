package com.facebook.messaging.communitymessaging.plugins.memberlistitem.bannedmemberscountlistitem;

import X.06Z;
import X.1BL;
import X.1Br;
import X.7zM;
import X.AbG;
import X.D55;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: BannedMembersCountListItemImplementation.class */
public final class BannedMembersCountListItemImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadSummary A04;
    public final D55 A05;
    public final MigColorScheme A06;

    public BannedMembersCountListItemImplementation(Context context, 06Z r303, ThreadSummary threadSummary, D55 d55, MigColorScheme migColorScheme) {
        1BL.A1F(context, migColorScheme);
        this.A00 = context;
        this.A06 = migColorScheme;
        this.A01 = r303;
        this.A05 = d55;
        this.A04 = threadSummary;
        this.A03 = 7zM.A0e(context);
        this.A02 = AbG.A0c();
    }
}
