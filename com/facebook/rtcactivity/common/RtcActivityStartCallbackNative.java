package com.facebook.rtcactivity.common;

import X.C0il;
import X.JDN;
import com.facebook.jni.HybridData;

/* loaded from: RtcActivityStartCallbackNative.class */
public class RtcActivityStartCallbackNative implements JDN {
    public final HybridData mHybridData;

    static {
        C0il.A0B("rtcactivity");
    }

    public RtcActivityStartCallbackNative(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onActivityFinished();

    public native void sendActivityData(byte[] bArr);

    public native void sendActivityDataTransacted(byte[] bArr);
}
