package com.facebook.messaging.publicchats.plugins.polls.composerentrypoint;

import X.11T;
import X.6Qf;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: CreatePollComposerEntryPointImplementation.class */
public final class CreatePollComposerEntryPointImplementation {
    public final Context A00;
    public final 6Qf A01;
    public final ThreadKey A02;
    public final ThreadSummary A03;
    public final Capabilities A04;

    public CreatePollComposerEntryPointImplementation(Context context, 6Qf r303, ThreadKey threadKey, ThreadSummary threadSummary, Capabilities capabilities) {
        11T.A0F(context, 1);
        11T.A0F(capabilities, 3);
        11T.A0F(threadKey, 4);
        11T.A0F(r303, 5);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A04 = capabilities;
        this.A02 = threadKey;
        this.A01 = r303;
    }
}
