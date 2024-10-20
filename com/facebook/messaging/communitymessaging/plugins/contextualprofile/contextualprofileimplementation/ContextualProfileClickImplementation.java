package com.facebook.messaging.communitymessaging.plugins.contextualprofile.contextualprofileimplementation;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1F9;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ContextualProfileClickImplementation.class */
public final class ContextualProfileClickImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1F9 A03;
    public final ThreadSummary A04;
    public final User A05;

    public ContextualProfileClickImplementation(Context context, 06Z r303, 1F9 r304, ThreadSummary threadSummary, User user) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A05 = user;
        this.A03 = r304;
        this.A01 = r303;
        this.A04 = threadSummary;
        this.A02 = 1Bu.A00(83119);
    }
}
