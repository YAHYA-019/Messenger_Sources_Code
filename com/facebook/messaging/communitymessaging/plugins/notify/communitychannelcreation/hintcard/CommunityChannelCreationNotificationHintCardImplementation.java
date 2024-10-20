package com.facebook.messaging.communitymessaging.plugins.notify.communitychannelcreation.hintcard;

import X.06Z;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.63D;
import X.7zR;
import X.AbG;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* loaded from: CommunityChannelCreationNotificationHintCardImplementation.class */
public final class CommunityChannelCreationNotificationHintCardImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadSummary A06;
    public final 63D A07;
    public final ThreadViewParams A08;

    public CommunityChannelCreationNotificationHintCardImplementation(Context context, 06Z r303, ThreadSummary threadSummary, 63D r305, ThreadViewParams threadViewParams) {
        7zR.A1N(context, r303);
        this.A00 = context;
        this.A01 = r303;
        this.A07 = r305;
        this.A08 = threadViewParams;
        this.A06 = threadSummary;
        this.A02 = 1Bu.A01(context, 83112);
        this.A03 = AbG.A0c();
        this.A04 = 1Bq.A00(17047);
        this.A05 = 1Bu.A00(83108);
    }
}
