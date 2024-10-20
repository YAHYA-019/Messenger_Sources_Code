package com.facebook.messaging.capability.thread.plugins.core.sharecontact;

import X.4YU;
import X.7zR;
import X.C1v9;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ShareContactCapabilityComputation.class */
public final class ShareContactCapabilityComputation {
    public final ThreadSummary A00;
    public final User A01;
    public final C1v9 A02;

    public ShareContactCapabilityComputation(ThreadSummary threadSummary, User user, C1v9 c1v9) {
        7zR.A1N(c1v9, threadSummary);
        this.A02 = c1v9;
        this.A01 = user;
        this.A00 = threadSummary;
    }

    public final void A00() {
        User user;
        if (this.A00.A0n.A1K() && (user = this.A01) != null && 4YU.A1Y(user.A0o, 73)) {
            this.A02.A00(84);
        }
    }
}
