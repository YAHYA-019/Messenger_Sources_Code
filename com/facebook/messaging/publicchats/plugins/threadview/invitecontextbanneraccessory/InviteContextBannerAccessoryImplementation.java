package com.facebook.messaging.publicchats.plugins.threadview.invitecontextbanneraccessory;

import X.11T;
import X.1BK;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: InviteContextBannerAccessoryImplementation.class */
public final class InviteContextBannerAccessoryImplementation {
    public final Context A00;
    public final ThreadSummary A01;

    public InviteContextBannerAccessoryImplementation(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 2);
        this.A00 = context;
        if (threadSummary == null) {
            throw 1BK.A0e();
        }
        this.A01 = threadSummary;
    }
}
