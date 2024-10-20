package com.facebook.messaging.capability.thread.plugins.core.block;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.BTR;
import X.C1v9;
import X.C94;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: BlockCapabilityComputation.class */
public final class BlockCapabilityComputation {
    public final 1Br A00;
    public final ThreadSummary A01;
    public final User A02;
    public final C1v9 A03;

    public BlockCapabilityComputation(Context context, ThreadSummary threadSummary, User user, C1v9 c1v9) {
        1BL.A11(1, context, threadSummary, c1v9);
        this.A02 = user;
        this.A01 = threadSummary;
        this.A03 = c1v9;
        this.A00 = 1Bu.A01(context, 82624);
    }

    public final void A00() {
        ThreadSummary threadSummary = this.A01;
        if (!threadSummary.A0n.A1H()) {
            User user = this.A02;
            if (user == null || !((C94) 1Br.A0B(this.A00)).A02(user)) {
                return;
            }
        } else if (BTR.A00(threadSummary)) {
            return;
        }
        this.A03.A00(10);
    }
}
