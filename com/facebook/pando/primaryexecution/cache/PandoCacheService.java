package com.facebook.pando.primaryexecution.cache;

import X.C0il;
import X.HJh;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: PandoCacheService.class */
public final class PandoCacheService extends PandoPrimaryExecution {
    public static final HJh Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HJh] */
    static {
        C0il.A0B("pando-client-cache-jni");
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, boolean z, boolean z2);
}
