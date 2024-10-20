package com.facebook.messaging.communitymessaging.plugins.communityinfo.mutecommunitybutton;

import X.06Z;
import X.11T;
import X.1BL;
import X.2Sh;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MuteCommunityButtonImplementation.class */
public final class MuteCommunityButtonImplementation {
    public final 06Z A00;
    public final ThreadKey A01;
    public final 2Sh A02;
    public final Context A03;
    public final ThreadSummary A04;

    public MuteCommunityButtonImplementation(Context context, 06Z r303, ThreadKey threadKey, ThreadSummary threadSummary, 2Sh r306) {
        1BL.A1F(context, threadKey);
        11T.A0F(r303, 5);
        this.A03 = context;
        this.A01 = threadKey;
        this.A04 = threadSummary;
        this.A02 = r306;
        this.A00 = r303;
    }
}
