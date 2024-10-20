package com.facebook.mqttbypass;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: IMqttBypassClientHolder.class */
public abstract class IMqttBypassClientHolder {
    public final HybridData mHybridData;

    static {
        C0il.A0B("mqttbypass-interface-jni");
    }

    public IMqttBypassClientHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public abstract void blockConnectionCreationNative();

    public abstract void permitConnectionCreationNative();
}
