package com.facebook.pando.primaryexecution.runtimedefaults;

import X.C0il;
import X.HJn;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: PandoRuntimeDefaultsService.class */
public final class PandoRuntimeDefaultsService extends PandoPrimaryExecution {
    public static final HJn Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HJn, java.lang.Object] */
    static {
        C0il.A0B("pando-client-runtimedefaults-jni");
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);
}
