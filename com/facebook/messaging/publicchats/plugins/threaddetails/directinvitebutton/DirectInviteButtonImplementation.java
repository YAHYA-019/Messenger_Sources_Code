package com.facebook.messaging.publicchats.plugins.threaddetails.directinvitebutton;

import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: DirectInviteButtonImplementation.class */
public final class DirectInviteButtonImplementation {
    public final Context A00;
    public final ThreadKey A01;
    public final ThreadSummary A02;

    public DirectInviteButtonImplementation(Context context, ThreadKey threadKey, ThreadSummary threadSummary) {
        7zR.A1N(context, threadKey);
        this.A00 = context;
        this.A01 = threadKey;
        this.A02 = threadSummary;
    }
}
