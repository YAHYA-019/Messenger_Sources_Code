package com.facebook.pando.primaryexecution.cancelledcallbacks;

import X.C0il;
import X.HJk;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: PandoCancelledCallbacksService.class */
public final class PandoCancelledCallbacksService extends PandoPrimaryExecution {
    public static final HJk Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HJk] */
    static {
        C0il.A0B("pando-client-cancelledcallbacks-jni");
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);
}
