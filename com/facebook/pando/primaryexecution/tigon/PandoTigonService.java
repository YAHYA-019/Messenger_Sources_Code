package com.facebook.pando.primaryexecution.tigon;

import X.C0il;
import X.HJo;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.concurrent.Executor;

/* loaded from: PandoTigonService.class */
public final class PandoTigonService extends PandoPrimaryExecution {
    public static final HJo Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HJo, java.lang.Object] */
    static {
        C0il.A0B("pando-client-tigon-jni");
    }

    public static final native HybridData initHybridData(String str, TigonServiceHolder tigonServiceHolder, Executor executor, PandoTigonConfig pandoTigonConfig);
}
