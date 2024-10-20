package com.facebook.gputimer;

import X.0fH;
import X.C0il;
import X.HHQ;
import com.facebook.jni.HybridData;

/* loaded from: GPUTimerImpl.class */
public final class GPUTimerImpl {
    public static final HHQ Companion = new Object();
    public static final Class TAG = GPUTimerImpl.class;
    public final HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HHQ, java.lang.Object] */
    static {
        try {
            0fH.A07(GPUTimerImpl.class, "gputimer-jni", "Loading library: %s");
            C0il.A0B("gputimer-jni");
            0fH.A07(GPUTimerImpl.class, "gputimer-jni", "Successfully loaded: %s");
        } catch (UnsatisfiedLinkError e) {
            0fH.A0N(GPUTimerImpl.class, "Failed to load: %s", e, new Object[]{"gputimer-jni"});
        }
    }

    public static final native HybridData initHybrid();

    public native void beginFrame();

    public native void beginMarker(int i);

    public native int createTimerHandle(String str);

    public native void endFrame();

    public native void endMarker();
}
