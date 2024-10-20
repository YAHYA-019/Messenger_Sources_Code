package com.facebook.pando.primaryexecution.adaptive;

import X.C0il;
import X.HJf;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: PandoAdaptiveService.class */
public final class PandoAdaptiveService extends PandoPrimaryExecution {
    public static final HJf Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HJf, java.lang.Object] */
    static {
        C0il.A0B("pando-client-adaptive-jni");
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);
}
