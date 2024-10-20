package com.facebook.messaging.threadview.plugins.quickpromotion.attributes;

import X.11T;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadViewCoreQpTriggerContextAttributes.class */
public final class ThreadViewCoreQpTriggerContextAttributes {
    public final Context A00;
    public final ThreadSummary A01;

    public ThreadViewCoreQpTriggerContextAttributes(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 2);
        this.A01 = threadSummary;
        this.A00 = context;
    }
}
