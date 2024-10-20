package com.facebook.native_bridge;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: NativeDataPromise.class */
public class NativeDataPromise {
    public final HybridData mHybridData;

    static {
        C0il.A0B("native_bridge");
    }

    public NativeDataPromise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void setException(String str);

    public native void setValue(Object obj);
}
