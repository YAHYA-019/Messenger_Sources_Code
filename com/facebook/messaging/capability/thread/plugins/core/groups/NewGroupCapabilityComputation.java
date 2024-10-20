package com.facebook.messaging.capability.thread.plugins.core.groups;

import X.1BL;
import X.C1v9;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: NewGroupCapabilityComputation.class */
public final class NewGroupCapabilityComputation {
    public final ThreadSummary A00;
    public final User A01;
    public final C1v9 A02;
    public final Context A03;

    public NewGroupCapabilityComputation(Context context, ThreadSummary threadSummary, User user, C1v9 c1v9) {
        1BL.A1H(context, threadSummary, c1v9);
        this.A03 = context;
        this.A00 = threadSummary;
        this.A02 = c1v9;
        this.A01 = user;
    }
}
