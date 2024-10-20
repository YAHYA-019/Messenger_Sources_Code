package com.facebook.messaging.publicchats.plugins.threadview.directinvitecontextbanneraccessory;

import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: DirectInviteContextBannerAccessoryImplementation.class */
public final class DirectInviteContextBannerAccessoryImplementation {
    public final Context A00;
    public final ThreadKey A01;
    public final ThreadSummary A02;

    public DirectInviteContextBannerAccessoryImplementation(Context context, ThreadKey threadKey, ThreadSummary threadSummary) {
        7zR.A1N(context, threadKey);
        this.A00 = context;
        this.A02 = threadSummary;
        this.A01 = threadKey;
    }
}
