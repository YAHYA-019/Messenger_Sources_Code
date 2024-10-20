package com.facebook.messaging.capability.thread.plugins.core.threaddetailsinstagramprofilebutton;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YU;
import X.AbF;
import X.C1v9;
import X.C28p;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadDetailsInstagramProfileButtonCapabilityComputation.class */
public final class ThreadDetailsInstagramProfileButtonCapabilityComputation {
    public static final void A00(ThreadSummary threadSummary, C1v9 c1v9) {
        if (AbF.A0f(threadSummary).A1K() == 1BL.A1W(threadSummary, c1v9)) {
            1Du A12 = AbF.A12(threadSummary);
            while (A12.hasNext()) {
                ThreadParticipant A0W = 4YU.A0W(A12);
                11T.A0D(A0W);
                if (C28p.A04(A0W)) {
                    c1v9.A00(41);
                    return;
                }
            }
        }
    }
}
