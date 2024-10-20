package com.facebook.wearable.common.comms.hera.shared.p000native.rsys;

import X.11T;
import com.facebook.jni.HybridData;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;

/* loaded from: LegacyWebrtcVideoRenderer.class */
public final class LegacyWebrtcVideoRenderer implements AutoCloseable {
    public final HybridData mHybridData;
    public final Object renderTarget;

    public LegacyWebrtcVideoRenderer(Object obj) {
        11T.A0F(obj, 1);
        this.renderTarget = obj;
        HeraNativeLoader.load();
        this.mHybridData = initHybrid(obj);
    }

    private final native void disposeNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(Object obj);

    private final native void renderFrameNative(Object obj);

    @Override // java.lang.AutoCloseable
    public void close() {
        disposeNative();
    }

    public final void renderFrame(RSVideoFrame rSVideoFrame) {
        11T.A0F(rSVideoFrame, 0);
        renderFrameNative(rSVideoFrame);
    }
}
