package com.facebook.messaging.communitymessaging.plugins.memberlistitem.blockedmembersrowitem;

import X.11T;
import X.1Br;
import X.1F9;
import X.AbG;
import X.D55;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: BlockedMembersRowItemImplementation.class */
public final class BlockedMembersRowItemImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1F9 A02;
    public final ThreadSummary A03;
    public final D55 A04;
    public final MigColorScheme A05;
    public final ParcelableSecondaryData A06;

    public BlockedMembersRowItemImplementation(Context context, 1F9 r303, ThreadSummary threadSummary, D55 d55, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData) {
        11T.A0F(migColorScheme, 2);
        this.A00 = context;
        this.A05 = migColorScheme;
        this.A06 = parcelableSecondaryData;
        this.A03 = threadSummary;
        this.A02 = r303;
        this.A04 = d55;
        this.A01 = AbG.A0c();
    }
}
