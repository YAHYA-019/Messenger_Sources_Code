package com.facebook.rtc.fbwebrtc.pytorchmodelloader;

import X.1Bq;
import X.1Br;
import X.2vC;
import X.2vD;
import X.5KA;
import X.5KB;
import X.C06w;
import X.C06z;
import X.C2v7;
import java.util.concurrent.ExecutorService;

/* loaded from: RpVoltronManager.class */
public final class RpVoltronManager {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(RpVoltronManager.class, "appModuleManager", "getAppModuleManager()Lcom/facebook/voltron/api/AppModuleManager;", 0), new C06w(RpVoltronManager.class, "executorService", "getExecutorService()Ljava/util/concurrent/ExecutorService;", 0)};
    public static final 5KA Companion = new Object();
    public static final String EXECUTORCH_LIB_NAME = "dynamic_executorch";
    public static final String RP_EXECUTORCH_MODULE_NAME = "executorch";
    public static final String TAG = "RpVoltronManager";
    public volatile boolean _isAvailable;
    public final 1Br appModuleManager$delegate = 1Bq.A00(17111);
    public final 1Br executorService$delegate = 1Bq.A00(16449);

    private final C2v7 getAppModuleManager() {
        return (C2v7) 1Br.A0B(this.appModuleManager$delegate);
    }

    private final ExecutorService getExecutorService() {
        return (ExecutorService) 1Br.A0B(this.executorService$delegate);
    }

    public final void fetchExecuTorchVoltronModule() {
        if (this._isAvailable) {
            return;
        }
        2vD A00 = getAppModuleManager().A00(2vC.A03);
        A00.A02(RP_EXECUTORCH_MODULE_NAME);
        A00.A01().A05(new 5KB(this), getExecutorService());
    }

    public final boolean get_isAvailable() {
        return this._isAvailable;
    }
}
