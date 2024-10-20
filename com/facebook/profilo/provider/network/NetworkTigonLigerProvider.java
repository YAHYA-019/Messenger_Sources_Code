package com.facebook.profilo.provider.network;

import X.0FI;
import X.AnonymousClass001;
import X.C0lu;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.tigonliger.TigonLigerService;
import java.util.concurrent.Executor;

/* loaded from: NetworkTigonLigerProvider.class */
public final class NetworkTigonLigerProvider extends C0lu {
    public NetworkTigonLigerHybrid A00;
    public Executor A01;
    public final TigonLigerService A02;

    public NetworkTigonLigerProvider(TigonXplatService tigonXplatService, Executor executor) {
        super("profilo_network");
        if (tigonXplatService == null) {
            throw AnonymousClass001.A0L("Need exactly one of TigonVideoService or TigonLigerService");
        }
        this.A02 = (TigonLigerService) tigonXplatService;
        this.A01 = executor;
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [java.lang.Object, com.facebook.profilo.provider.network.NetworkTigonLigerHybrid] */
    private NetworkTigonLigerHybrid A00() {
        NetworkTigonLigerHybrid networkTigonLigerHybrid = this.A00;
        NetworkTigonLigerHybrid networkTigonLigerHybrid2 = networkTigonLigerHybrid;
        if (networkTigonLigerHybrid == null) {
            TigonLigerService tigonLigerService = this.A02;
            if (tigonLigerService == null) {
                throw AnonymousClass001.A0N("Neither TigonVideoService nor TigonLigerService set");
            }
            Executor executor = this.A01;
            MultiBufferLogger A05 = A05();
            ?? obj = new Object();
            obj.mHybridData = NetworkTigonLigerHybrid.initHybrid(A05);
            obj.setTigonService(tigonLigerService, executor);
            this.A00 = obj;
            networkTigonLigerHybrid2 = obj;
        }
        return networkTigonLigerHybrid2;
    }

    @Override // X.C0lu
    public void disable() {
        int A03 = 0FI.A03(2125425550);
        A00().nativeDisable();
        0FI.A09(-1480913666, A03);
    }

    @Override // X.C0lu
    public void enable() {
        int A03 = 0FI.A03(-313598717);
        A00().nativeEnable(TraceEvents.isEnabled(ExternalProviders.A03.A01), TraceEvents.isEnabled(ExternalProviders.A04.A01), TraceEvents.isEnabled(ExternalProviders.A05.A01));
        0FI.A09(-1492366710, A03);
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return ExternalProviders.A04.A01 | ExternalProviders.A03.A01 | ExternalProviders.A05.A01;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        NetworkTigonLigerHybrid networkTigonLigerHybrid = this.A00;
        int i = 0;
        if (networkTigonLigerHybrid != null) {
            if (networkTigonLigerHybrid.nativeIsTigonObserverEnabled()) {
                i = 0 | ExternalProviders.A03.A01;
            }
            if (this.A00.nativeIsIngressLigerCodecLoggerEnabled()) {
                i |= ExternalProviders.A04.A01;
            }
            if (this.A00.nativeIsEgressLigerCodecLoggerEnabled()) {
                i |= ExternalProviders.A05.A01;
            }
        }
        return i;
    }
}
