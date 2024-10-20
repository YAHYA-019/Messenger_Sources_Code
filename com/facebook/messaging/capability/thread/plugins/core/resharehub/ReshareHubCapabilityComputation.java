package com.facebook.messaging.capability.thread.plugins.core.resharehub;

import X.11T;
import X.1F9;
import X.C1v9;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ReshareHubCapabilityComputation.class */
public final class ReshareHubCapabilityComputation {
    public static final void A00(ThreadSummary threadSummary, C1v9 c1v9) {
        1F9 r0;
        11T.A0H(threadSummary, c1v9);
        ThreadKey threadKey = threadSummary.A0n;
        if (ThreadKey.A0j(threadKey) || ThreadKey.A0h(threadKey) || !(!ThreadKey.A0f(threadKey) || (r0 = threadSummary.A0g) == null || r0 == 1F9.A0B)) {
            c1v9.A00(ActionId.MESSENGER_DELTA_REQUEST);
        }
    }
}
