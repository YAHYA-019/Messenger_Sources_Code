package com.facebook.messaging.communitymessaging.plugins.communityinfo.unmutecommunitybutton;

import X.06Z;
import X.1BK;
import X.2Sh;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: UnmuteCommunityButtonImplementation.class */
public final class UnmuteCommunityButtonImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 2Sh A02;
    public final ThreadSummary A03;

    public UnmuteCommunityButtonImplementation(Context context, 06Z r303, ThreadSummary threadSummary, 2Sh r305) {
        1BK.A1K(context, 1, r303);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A02 = r305;
        this.A01 = r303;
    }
}
