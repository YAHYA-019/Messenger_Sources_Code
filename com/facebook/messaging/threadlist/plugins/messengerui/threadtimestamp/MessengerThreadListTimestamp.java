package com.facebook.messaging.threadlist.plugins.messengerui.threadtimestamp;

import X.11T;
import X.1Br;
import X.1HG;
import X.2oN;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MessengerThreadListTimestamp.class */
public final class MessengerThreadListTimestamp {
    public final Context A00;

    public MessengerThreadListTimestamp(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public final String A00(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        1Br A00 = 1HG.A00(this.A00, 33246);
        long j = threadSummary.A0N;
        if (j > 0) {
            return ((2oN) A00.A00.get()).A03(j);
        }
        return null;
    }
}
