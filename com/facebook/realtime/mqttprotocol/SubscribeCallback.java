package com.facebook.realtime.mqttprotocol;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: SubscribeCallback.class */
public class SubscribeCallback {
    public final HybridData mHybridData;

    static {
        C0il.A0B("mqttprotocol-jni");
    }

    public SubscribeCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onConnected();

    public native void onConnecting();

    public native void onDisconnected();

    public native void onResponse(byte[] bArr);
}
