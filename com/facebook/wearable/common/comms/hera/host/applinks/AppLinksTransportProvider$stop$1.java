package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Pz;
import X.0fH;
import X.2aI;
import X.AnonymousClass001;
import X.C44k;
import X.GOp;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: AppLinksTransportProvider$stop$1.class */
public final class AppLinksTransportProvider$stop$1 extends 0DO implements Function2 {
    public int label;
    public final /* synthetic */ AppLinksTransportProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksTransportProvider$stop$1(AppLinksTransportProvider appLinksTransportProvider, 0DR r303) {
        super(2, r303);
        this.this$0 = appLinksTransportProvider;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AppLinksTransportProvider$stop$1(this.this$0, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(2aI r302, 0DR r303) {
        return new AppLinksTransportProvider$stop$1(this.this$0, r303).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            this.this$0.initStats = "Pending stop";
            0fH.A0j(AppLinksTransportProviderKt.TAG, 0Pz.A0h("Stopping after ", " ms if no additional start request.", this.this$0.stopDelayMs));
            long j = this.this$0.stopDelayMs;
            this.label = 1;
            if (C44k.A01(this, j) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        0fH.A0j(AppLinksTransportProviderKt.TAG, "Stopping...");
        AppLinksTransportProvider appLinksTransportProvider = this.this$0;
        appLinksTransportProvider.linkedDeviceManager.removeOnDeviceDiscoveredListener(appLinksTransportProvider.onDeviceDiscoveredListener);
        AppLinksTransportProvider appLinksTransportProvider2 = this.this$0;
        appLinksTransportProvider2.linkedDeviceManager.removeOnDeviceGoneListener(appLinksTransportProvider2.onDeviceGoneListener);
        Iterator A0y = AnonymousClass001.A0y(this.this$0.linkedDevices);
        while (A0y.hasNext()) {
            ((AppLinksDevice) GOp.A15(A0y)).stop();
        }
        this.this$0.linkedDevices.clear();
        this.this$0.deviceDebugStats.clear();
        this.this$0.initStats = "Link Closed";
        this.this$0.pendingStopJob = null;
        0fH.A0j(AppLinksTransportProviderKt.TAG, "Stopped...");
        return 04S.A00;
    }
}
