package com.facebook.messaging.capability.thread.plugins.core.communitymessagingchannelinvite;

import X.1BL;
import X.C1v9;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: CommunityMessagingChannelInviteCapabilityComputation.class */
public final class CommunityMessagingChannelInviteCapabilityComputation {
    public final Context A00;
    public final ThreadSummary A01;
    public final C1v9 A02;

    public CommunityMessagingChannelInviteCapabilityComputation(Context context, ThreadSummary threadSummary, C1v9 c1v9) {
        1BL.A1H(context, threadSummary, c1v9);
        this.A00 = context;
        this.A01 = threadSummary;
        this.A02 = c1v9;
    }
}