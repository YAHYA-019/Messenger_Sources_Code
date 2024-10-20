package com.facebook.messaging.communitymessaging.plugins.channelorganization.itemviewbinder.managechannelviewbinder;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Iw;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: ManageChannelItemViewBinderImplementation.class */
public final class ManageChannelItemViewBinderImplementation {
    public final 06Z A00;
    public final CallerContext A01;
    public final 1Br A02;
    public final 1Iw A03;

    public ManageChannelItemViewBinderImplementation(06Z r302, CallerContext callerContext, 1Iw r304) {
        1BL.A1H(r304, callerContext, r302);
        this.A03 = r304;
        this.A01 = callerContext;
        this.A00 = r302;
        Context context = r304.A0D;
        11T.A0A(context);
        this.A02 = 1Bu.A01(context, 16428);
    }
}
