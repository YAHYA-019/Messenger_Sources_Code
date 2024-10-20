package com.facebook.messaging.communitymessaging.plugins.channellist.clickhandler.unjoined;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1pI;
import X.2YQ;
import X.C2gi;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: UnjoinedChannelClickImplementation.class */
public final class UnjoinedChannelClickImplementation {
    public final Context A00;
    public final 06Z A01;
    public final LifecycleOwner A02;
    public final FbUserSession A03;
    public final 1pI A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 2YQ A08;
    public final C2gi A09;

    public UnjoinedChannelClickImplementation(Context context, 06Z r303, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 1pI r306, 2YQ r307, C2gi c2gi) {
        1BL.A1H(context, fbUserSession, r307);
        11T.A0F(r306, 4);
        11T.A0F(r303, 6);
        11T.A0F(lifecycleOwner, 7);
        this.A00 = context;
        this.A03 = fbUserSession;
        this.A08 = r307;
        this.A04 = r306;
        this.A09 = c2gi;
        this.A01 = r303;
        this.A02 = lifecycleOwner;
        this.A06 = 1Bu.A00(68762);
        this.A05 = 1Bu.A01(context, 83114);
        this.A07 = 1Bq.A00(66481);
    }
}
