package com.facebook.messaging.friending.plugins.smallgroupfriending.attributes;

import X.11T;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadViewSmallGroupFriendingQpTriggerContextAttributes.class */
public final class ThreadViewSmallGroupFriendingQpTriggerContextAttributes {
    public final Context A00;
    public final ThreadSummary A01;

    public ThreadViewSmallGroupFriendingQpTriggerContextAttributes(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 2);
        this.A01 = threadSummary;
        this.A00 = context;
    }
}
