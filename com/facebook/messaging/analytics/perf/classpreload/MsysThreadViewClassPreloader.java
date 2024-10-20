package com.facebook.messaging.analytics.perf.classpreload;

import X.1Bn;
import X.1Bq;
import X.1Br;
import X.2jC;
import X.AbstractC02553vh;
import X.C02583vk;
import java.util.concurrent.ExecutorService;

/* loaded from: MsysThreadViewClassPreloader.class */
public final class MsysThreadViewClassPreloader extends AbstractC02553vh {
    public final C02583vk A00;
    public final 1Br A01;
    public final ExecutorService A02;

    public MsysThreadViewClassPreloader() {
        1Br A00 = 1Bq.A00(66102);
        this.A01 = A00;
        ExecutorService executorService = (ExecutorService) 1Bn.A0A(16455);
        this.A02 = executorService;
        this.A00 = new C02583vk(executorService, ((2jC) A00.get()).A00());
    }

    public final void A00() {
        this.A00.A01(this);
    }

    @Override // X.InterfaceC02573vj
    public void preloadClasses() {
    }
}
