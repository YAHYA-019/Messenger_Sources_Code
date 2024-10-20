package com.facebook.messaging.capability.thread.plugins.core.payments;

import X.11T;
import X.1Lm;
import X.4YV;
import X.6gJ;
import X.7Yu;
import X.7zT;
import X.C1v9;
import X.C5ws;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: PaymentCapabilityComputation.class */
public final class PaymentCapabilityComputation {
    public static final void A00(Context context, 7Yu r302, ThreadSummary threadSummary, User user, C1v9 c1v9) {
        11T.A0F(context, 0);
        7zT.A1T(threadSummary, c1v9, r302);
        if (!((6gJ) 1Lm.A05(context, 4YV.A0E(context), 82505)).A01(threadSummary.A0n, threadSummary, user) || user == null || r302.A01(threadSummary, user) || user.A05 || C5ws.A00.A01(threadSummary, user)) {
            return;
        }
        c1v9.A00(0);
    }
}
