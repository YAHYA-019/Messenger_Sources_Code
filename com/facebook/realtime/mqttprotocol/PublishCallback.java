package com.facebook.realtime.mqttprotocol;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: PublishCallback.class */
public class PublishCallback {
    public final HybridData mHybridData;

    static {
        C0il.A0B("mqttprotocol-jni");
    }

    public PublishCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onFailure();

    public native void onSuccess(double d);
}
