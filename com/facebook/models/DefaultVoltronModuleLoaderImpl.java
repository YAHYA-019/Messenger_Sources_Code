package com.facebook.models;

import X.1BQ;
import X.1BV;
import X.1FV;
import X.2vC;
import X.4YU;
import X.4YV;
import X.5Jw;
import X.85K;
import X.AnonymousClass001;
import X.C00i;
import X.KpG;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: DefaultVoltronModuleLoaderImpl.class */
public class DefaultVoltronModuleLoaderImpl implements 5Jw {
    public final C00i mFbAppType = new 1BQ(83603);
    public final C00i mPytorchVoltronModuleLoader = new 1BV(99735);
    public final C00i mBackgroundExecutor = new 1BQ(16477);

    public ListenableFuture loadModule() {
        SettableFuture A0j = 4YU.A0j();
        1FV A00 = ((KpG) this.mPytorchVoltronModuleLoader.get()).A00(2vC.A01, AnonymousClass001.A0s());
        return 4YV.A0b(this.mBackgroundExecutor, new 85K(this, A0j, 2), A00);
    }

    public boolean requireLoad() {
        this.mFbAppType.get();
        return true;
    }
}
