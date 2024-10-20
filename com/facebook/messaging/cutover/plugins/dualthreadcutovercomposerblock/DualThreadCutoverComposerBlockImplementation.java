package com.facebook.messaging.cutover.plugins.dualthreadcutovercomposerblock;

import X.06Z;
import X.7zS;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: DualThreadCutoverComposerBlockImplementation.class */
public final class DualThreadCutoverComposerBlockImplementation {
    public final Context A00;
    public final 06Z A01;
    public final ThreadSummary A02;
    public final MigColorScheme A03;
    public final User A04;

    public DualThreadCutoverComposerBlockImplementation(Context context, 06Z r303, ThreadSummary threadSummary, MigColorScheme migColorScheme, User user) {
        7zS.A17(1, context, migColorScheme, r303);
        this.A00 = context;
        this.A02 = threadSummary;
        this.A04 = user;
        this.A03 = migColorScheme;
        this.A01 = r303;
    }
}
