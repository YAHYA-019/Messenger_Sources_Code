package com.facebook.messaging.friending.plugins.friending.attributes;

import X.11T;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadViewFriendingQpTriggerContextAttributes.class */
public final class ThreadViewFriendingQpTriggerContextAttributes {
    public final Context A00;
    public final 1Br A01;
    public final ThreadSummary A02;

    public ThreadViewFriendingQpTriggerContextAttributes(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 2);
        this.A02 = threadSummary;
        this.A00 = context;
        this.A01 = 1Bu.A01(context, 16428);
    }
}
