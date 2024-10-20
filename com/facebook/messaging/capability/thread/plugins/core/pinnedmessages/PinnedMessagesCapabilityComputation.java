package com.facebook.messaging.capability.thread.plugins.core.pinnedmessages;

import X.1BK;
import X.1Br;
import X.1Bu;
import X.AbG;
import X.C1v9;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: PinnedMessagesCapabilityComputation.class */
public final class PinnedMessagesCapabilityComputation {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final User A04;
    public final C1v9 A05;

    public PinnedMessagesCapabilityComputation(ThreadSummary threadSummary, User user, C1v9 c1v9) {
        1BK.A1K(c1v9, 2, threadSummary);
        this.A05 = c1v9;
        this.A04 = user;
        this.A03 = threadSummary;
        this.A00 = 1Bu.A00(50228);
        this.A01 = AbG.A0b();
        this.A02 = 1Bu.A00(16671);
    }
}
