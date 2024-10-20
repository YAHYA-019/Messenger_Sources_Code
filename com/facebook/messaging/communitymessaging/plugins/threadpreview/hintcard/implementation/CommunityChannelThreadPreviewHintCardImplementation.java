package com.facebook.messaging.communitymessaging.plugins.threadpreview.hintcard.implementation;

import X.06Z;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.63D;
import X.6IV;
import X.AbG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* loaded from: CommunityChannelThreadPreviewHintCardImplementation.class */
public final class CommunityChannelThreadPreviewHintCardImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final ThreadSummary A08;
    public final 63D A09;
    public final ThreadViewParams A0A;
    public final 6IV A0B;

    public CommunityChannelThreadPreviewHintCardImplementation(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, 63D r306, ThreadViewParams threadViewParams, 6IV r308) {
        1BL.A11(1, context, r303, fbUserSession);
        this.A00 = context;
        this.A01 = r303;
        this.A02 = fbUserSession;
        this.A09 = r306;
        this.A0A = threadViewParams;
        this.A0B = r308;
        this.A08 = threadSummary;
        this.A04 = 1Bu.A01(context, 83112);
        this.A05 = AbG.A0c();
        this.A06 = 1Bq.A00(17047);
        this.A07 = 1Bu.A00(83108);
        this.A03 = 1Lm.A00(context, fbUserSession, 83111);
    }
}
