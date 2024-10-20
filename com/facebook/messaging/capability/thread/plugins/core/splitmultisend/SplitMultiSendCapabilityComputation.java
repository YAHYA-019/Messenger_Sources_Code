package com.facebook.messaging.capability.thread.plugins.core.splitmultisend;

import X.11T;
import X.1BL;
import X.1Kq;
import X.BSS;
import X.C1v9;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: SplitMultiSendCapabilityComputation.class */
public final class SplitMultiSendCapabilityComputation {
    public static final void A00(ThreadSummary threadSummary, User user, C1v9 c1v9) {
        1BL.A1F(threadSummary, c1v9);
        if (user == null) {
            ImmutableList immutableList = threadSummary.A1L;
            11T.A0A(immutableList);
            if (!BSS.A00(immutableList)) {
                return;
            }
        } else if (user.A0U != 1Kq.A04) {
            return;
        }
        c1v9.A00(40);
    }
}
