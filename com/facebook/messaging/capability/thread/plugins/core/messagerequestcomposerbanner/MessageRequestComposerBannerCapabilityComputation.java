package com.facebook.messaging.capability.thread.plugins.core.messagerequestcomposerbanner;

import X.1BL;
import X.C1v9;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: MessageRequestComposerBannerCapabilityComputation.class */
public final class MessageRequestComposerBannerCapabilityComputation {
    public final ThreadSummary A00;
    public final User A01;
    public final C1v9 A02;

    public MessageRequestComposerBannerCapabilityComputation(ThreadSummary threadSummary, User user, C1v9 c1v9) {
        1BL.A1F(threadSummary, c1v9);
        this.A00 = threadSummary;
        this.A02 = c1v9;
        this.A01 = user;
    }
}
