package com.facebook.messaging.integrity.threadlimits.plugins.core.inboxlifecyclesuspense;

import X.11T;
import X.1Bq;
import X.1Br;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ThreadLimitsInboxLifecycleSuspenseListenerImplementation.class */
public final class ThreadLimitsInboxLifecycleSuspenseListenerImplementation {
    public final Context A00;
    public final LifecycleOwner A01;
    public final FbUserSession A02;
    public final 1Br A03;

    public ThreadLimitsInboxLifecycleSuspenseListenerImplementation(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(lifecycleOwner, 2);
        11T.A0F(fbUserSession, 3);
        this.A00 = context;
        this.A01 = lifecycleOwner;
        this.A02 = fbUserSession;
        this.A03 = 1Bq.A00(66774);
    }
}
