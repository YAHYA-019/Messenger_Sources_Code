package com.facebook.messaging.capability.thread.plugins.core.restrict;

import X.1BL;
import X.1Bn;
import X.C00j;
import X.C1v9;
import X.C3Q;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: RestrictCapabilityComputation.class */
public final class RestrictCapabilityComputation {
    public static final void A00(ThreadSummary threadSummary, User user, C1v9 c1v9) {
        1BL.A1F(threadSummary, c1v9);
        C00j.A05("RestrictCapabilityComputation.compute", 692726118);
        try {
            if (((C3Q) 1Bn.A0A(82518)).A00(threadSummary, user)) {
                c1v9.A00(85);
            }
            C00j.A01(-867717069);
        } catch (Throwable th) {
            C00j.A01(-257708817);
            throw th;
        }
    }
}
