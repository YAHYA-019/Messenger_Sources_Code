package com.facebook.messaging.polling.plugins.core.voterslistdataprovider;

import X.1Br;
import X.1Bu;
import X.7zM;
import X.7zT;
import X.C1G;
import android.content.Context;
import com.facebook.messaging.polling.datamodels.PollingPublishedOption;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: PollVotersListDataProviderImplementation.class */
public final class PollVotersListDataProviderImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final PollingPublishedOption A03;
    public final C1G A04;
    public final MigColorScheme A05;

    public PollVotersListDataProviderImplementation(Context context, PollingPublishedOption pollingPublishedOption, C1G c1g, MigColorScheme migColorScheme) {
        7zT.A1W(context, migColorScheme, pollingPublishedOption, c1g);
        this.A00 = context;
        this.A05 = migColorScheme;
        this.A03 = pollingPublishedOption;
        this.A04 = c1g;
        this.A01 = 1Bu.A01(context, 67581);
        this.A02 = 7zM.A0e(context);
    }
}
