package com.facebook.messaging.capability.thread.plugins.core.novi;

import X.11T;
import X.1BL;
import X.AbF;
import X.C1v9;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: CalibraCapabilityComputation.class */
public final class CalibraCapabilityComputation {
    public static final void A00(ThreadSummary threadSummary, C1v9 c1v9) {
        11T.A0H(c1v9, threadSummary);
        if (1BL.A0Q().AZk(36314743056703638L)) {
            ThreadKey A0f = AbF.A0f(threadSummary);
            if (ThreadKey.A0f(A0f) || ThreadKey.A0h(A0f) || A0f.A1R()) {
                return;
            }
            c1v9.A00(12);
        }
    }
}
