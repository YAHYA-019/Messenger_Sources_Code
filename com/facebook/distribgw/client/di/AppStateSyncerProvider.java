package com.facebook.distribgw.client.di;

import X.09X;
import X.1BQ;
import X.1Bi;
import X.1XE;
import X.2yD;
import X.3cO;
import X.C00i;
import X.C08k;
import com.facebook.inject.FbInjector;
import com.facebook.realtime.common.appstate.AppStateGetter;
import com.facebook.realtime.common.appstate.AppStateSyncer;

/* loaded from: AppStateSyncerProvider.class */
public class AppStateSyncerProvider {
    public final C00i A01;
    public final AppStateGetter A05;
    public final AppStateSyncer A06;
    public final C00i A07;
    public final C00i A08;
    public boolean A00 = false;
    public final C00i A02 = new 1BQ(66196);
    public final C00i A03 = new 1BQ(16687);
    public final C00i A04 = new 1BQ(16520);

    public AppStateSyncerProvider() {
        1BQ r0 = new 1BQ(16385);
        this.A08 = r0;
        this.A07 = FbInjector.A00;
        this.A01 = new 1BQ(16748);
        AppStateGetter appStateGetter = ((1XE) 1Bi.A03(16700)).A03;
        this.A05 = appStateGetter;
        this.A06 = new AppStateSyncer(appStateGetter);
        if (((2yD) r0.get()).AZk(36324720267251683L)) {
            C08k c08k = new C08k(new 3cO(this));
            09X.A00();
            09X.A03(FbInjector.A03, c08k);
        }
    }
}
