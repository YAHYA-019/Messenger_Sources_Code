package com.facebook.messaging.publicchats.plugins.threaddetails.attributionsubheading;

import X.11T;
import X.1BK;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: PublicChatsAttributionSubheadingImplementation.class */
public final class PublicChatsAttributionSubheadingImplementation {
    public final Context A00;
    public final ThreadSummary A01;

    public PublicChatsAttributionSubheadingImplementation(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 1);
        this.A00 = context;
        if (threadSummary == null) {
            throw 1BK.A0h();
        }
        this.A01 = threadSummary;
    }
}
