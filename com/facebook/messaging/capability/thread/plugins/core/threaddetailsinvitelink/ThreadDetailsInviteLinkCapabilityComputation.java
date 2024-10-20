package com.facebook.messaging.capability.thread.plugins.core.threaddetailsinvitelink;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.AbG;
import X.C1v9;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadDetailsInviteLinkCapabilityComputation.class */
public final class ThreadDetailsInviteLinkCapabilityComputation {
    public final 1Br A00;
    public final 1Br A01;
    public final ThreadSummary A02;
    public final C1v9 A03;
    public final Context A04;

    public ThreadDetailsInviteLinkCapabilityComputation(Context context, ThreadSummary threadSummary, C1v9 c1v9) {
        1BL.A1H(context, c1v9, threadSummary);
        this.A04 = context;
        this.A03 = c1v9;
        this.A02 = threadSummary;
        this.A01 = AbG.A0b();
        this.A00 = 1Bu.A01(context, 83104);
    }
}
