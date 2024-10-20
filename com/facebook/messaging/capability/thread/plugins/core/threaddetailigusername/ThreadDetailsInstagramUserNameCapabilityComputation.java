package com.facebook.messaging.capability.thread.plugins.core.threaddetailigusername;

import X.11T;
import X.1Du;
import X.4YU;
import X.AbF;
import X.C1v9;
import X.C28p;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadDetailsInstagramUserNameCapabilityComputation.class */
public final class ThreadDetailsInstagramUserNameCapabilityComputation {
    public static final void A00(ThreadSummary threadSummary, C1v9 c1v9) {
        11T.A0H(threadSummary, c1v9);
        if (threadSummary.A0n.A1K()) {
            1Du A12 = AbF.A12(threadSummary);
            while (A12.hasNext()) {
                ThreadParticipant A0W = 4YU.A0W(A12);
                11T.A0D(A0W);
                if (C28p.A04(A0W)) {
                    c1v9.A00(50);
                    return;
                }
            }
        }
    }
}
