package com.facebook.messaging.communitymessaging.plugins.requesttojoin.requesttojoinlistitem;

import X.06Z;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.D55;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: RequestToJoinListItemImplementation.class */
public final class RequestToJoinListItemImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ThreadSummary A05;
    public final D55 A06;
    public final MigColorScheme A07;

    public RequestToJoinListItemImplementation(Context context, 06Z r303, ThreadSummary threadSummary, D55 d55, MigColorScheme migColorScheme) {
        1BL.A1F(context, migColorScheme);
        this.A00 = context;
        this.A07 = migColorScheme;
        this.A01 = r303;
        this.A06 = d55;
        this.A05 = threadSummary;
        this.A02 = 1Bu.A01(context, 82784);
        this.A03 = 1Bu.A01(context, 67784);
        this.A04 = 1Bq.A00(82448);
    }
}
