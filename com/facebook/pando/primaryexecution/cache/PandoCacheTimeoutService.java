package com.facebook.pando.primaryexecution.cache;

import X.1BL;
import X.C0il;
import X.HJi;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: PandoCacheTimeoutService.class */
public final class PandoCacheTimeoutService extends PandoPrimaryExecution {
    public static final HJi Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HJi] */
    static {
        C0il.A0B("pando-client-cache-jni");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PandoCacheTimeoutService(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, ScheduledExecutorService scheduledExecutorService) {
        super(initHybridData(pandoPrimaryExecution, pandoResponseCache, scheduledExecutorService));
        1BL.A1H(pandoPrimaryExecution, pandoResponseCache, scheduledExecutorService);
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, ScheduledExecutorService scheduledExecutorService);
}
