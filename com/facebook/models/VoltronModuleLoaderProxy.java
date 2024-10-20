package com.facebook.models;

import X.1FV;
import X.4YU;
import X.5Jw;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: VoltronModuleLoaderProxy.class */
public class VoltronModuleLoaderProxy {
    public final 5Jw mVoltronModuleLoader;

    public VoltronModuleLoaderProxy(5Jw r302) {
        this.mVoltronModuleLoader = r302;
    }

    public ListenableFuture loadModule() {
        5Jw r0 = this.mVoltronModuleLoader;
        if (r0 != null) {
            return r0.loadModule();
        }
        1FV A0j = 4YU.A0j();
        A0j.set(new VoltronLoadingResult(true, true));
        return A0j;
    }

    public boolean requireLoad() {
        5Jw r0 = this.mVoltronModuleLoader;
        if (r0 == null) {
            return false;
        }
        return r0.requireLoad();
    }
}
