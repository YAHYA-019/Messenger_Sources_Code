package com.facebook.cameracore.ardelivery.xplat.assetmanager;

import X.11T;
import X.1BL;
import X.JHj;
import X.SAK;
import X.SAL;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: XplatAssetManagerCompletionCallback.class */
public final class XplatAssetManagerCompletionCallback {
    public final Executor backgroundExecutor;
    public final JHj stateListener;

    public XplatAssetManagerCompletionCallback(JHj jHj, Executor executor) {
        1BL.A1F(jHj, executor);
        this.stateListener = jHj;
        this.backgroundExecutor = executor;
    }

    public final void onFail(String str) {
        11T.A0F(str, 0);
        this.backgroundExecutor.execute(new SAK(this, str));
    }

    public final void onSuccess(List list) {
        11T.A0F(list, 0);
        this.backgroundExecutor.execute(new SAL(this, list));
    }
}
