package com.facebook.pando.primaryexecution.tigongraphstore;

import X.C0il;
import X.HJp;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.pando.primaryexecution.tigon.PandoTigonConfig;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.concurrent.Executor;

/* loaded from: PandoTigonGraphStoreService.class */
public final class PandoTigonGraphStoreService extends PandoPrimaryExecution {
    public static final HJp Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HJp, java.lang.Object] */
    static {
        C0il.A0B("pando-client-tigongraphstore-jni");
    }

    public static final native HybridData initHybridData(String str, TigonServiceHolder tigonServiceHolder, Executor executor, GraphServiceAsset graphServiceAsset, PandoTigonConfig pandoTigonConfig);
}
