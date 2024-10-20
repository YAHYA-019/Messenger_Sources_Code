package com.facebook.messaging.capability.thread.plugins.core.messageforward;

import X.1BL;
import X.C1v9;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MessageForwardCapabilityComputation.class */
public final class MessageForwardCapabilityComputation {
    public final ThreadSummary A00;
    public final C1v9 A01;

    public MessageForwardCapabilityComputation(ThreadSummary threadSummary, C1v9 c1v9) {
        1BL.A1F(c1v9, threadSummary);
        this.A01 = c1v9;
        this.A00 = threadSummary;
    }
}
