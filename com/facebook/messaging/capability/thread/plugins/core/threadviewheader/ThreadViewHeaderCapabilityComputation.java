package com.facebook.messaging.capability.thread.plugins.core.threadviewheader;

import X.11T;
import X.BSS;
import X.C1v9;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: ThreadViewHeaderCapabilityComputation.class */
public final class ThreadViewHeaderCapabilityComputation {
    public static final void A00(ThreadSummary threadSummary, C1v9 c1v9) {
        ImmutableList immutableList;
        11T.A0H(c1v9, threadSummary);
        if (ThreadKey.A0j(threadSummary.A0n) && (immutableList = threadSummary.A1L) != null && BSS.A00(immutableList)) {
            c1v9.A00(37);
        }
    }
}
