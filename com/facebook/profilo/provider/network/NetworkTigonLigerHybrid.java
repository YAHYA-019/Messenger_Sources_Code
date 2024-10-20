package com.facebook.profilo.provider.network;

import com.facebook.jni.HybridData;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.tigon.tigonliger.TigonLigerService;
import java.util.concurrent.Executor;

/* loaded from: NetworkTigonLigerHybrid.class */
public final class NetworkTigonLigerHybrid {
    public HybridData mHybridData;

    public static native HybridData initHybrid(MultiBufferLogger multiBufferLogger);

    public native void nativeDisable();

    public native void nativeEnable(boolean z, boolean z2, boolean z3);

    public native boolean nativeIsEgressLigerCodecLoggerEnabled();

    public native boolean nativeIsIngressLigerCodecLoggerEnabled();

    public native boolean nativeIsTigonObserverEnabled();

    public native void setTigonService(TigonLigerService tigonLigerService, Executor executor);
}
