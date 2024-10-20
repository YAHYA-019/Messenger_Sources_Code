package com.facebook.messaging.publicchats.plugins.events.createeventcomposerentrypoint;

import X.11T;
import X.6Qf;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CreateEventComposerEntryPointImplementation.class */
public final class CreateEventComposerEntryPointImplementation {
    public final Context A00;
    public final 6Qf A01;
    public final ThreadSummary A02;
    public final MigColorScheme A03;

    public CreateEventComposerEntryPointImplementation(Context context, 6Qf r303, ThreadSummary threadSummary, MigColorScheme migColorScheme) {
        11T.A0F(context, 1);
        11T.A0F(r303, 3);
        11T.A0F(migColorScheme, 4);
        this.A00 = context;
        this.A02 = threadSummary;
        this.A01 = r303;
        this.A03 = migColorScheme;
    }
}
