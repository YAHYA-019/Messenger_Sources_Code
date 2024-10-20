package com.facebook.messaging.games.plugins.composerentrypoint.discoverycomposerentrypoint;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.6Qf;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: GamesDiscoveryComposerEntryPointImplementation.class */
public final class GamesDiscoveryComposerEntryPointImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 6Qf A03;
    public final ThreadSummary A04;
    public final MigColorScheme A05;
    public final Capabilities A06;

    public GamesDiscoveryComposerEntryPointImplementation(Context context, 6Qf r303, ThreadSummary threadSummary, MigColorScheme migColorScheme, Capabilities capabilities) {
        11T.A0F(context, 1);
        11T.A0F(r303, 3);
        11T.A0F(migColorScheme, 4);
        11T.A0F(capabilities, 5);
        this.A00 = context;
        this.A04 = threadSummary;
        this.A03 = r303;
        this.A05 = migColorScheme;
        this.A06 = capabilities;
        this.A01 = 1Bq.A00(16385);
        this.A02 = 1Bu.A00(85204);
    }
}
