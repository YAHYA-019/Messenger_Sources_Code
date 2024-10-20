package com.facebook.rtcactivity.common;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: RtcActivityStartResponseCallback.class */
public class RtcActivityStartResponseCallback {
    public final HybridData mHybridData;

    static {
        C0il.A0B("rtcactivity");
    }

    public RtcActivityStartResponseCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void abort();

    public native void readyToStart();

    public native void readyToStartWithFeatures(Iterable iterable);
}
