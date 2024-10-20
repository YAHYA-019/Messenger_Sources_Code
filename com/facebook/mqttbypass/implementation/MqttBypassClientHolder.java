package com.facebook.mqttbypass.implementation;

import X.C0il;
import X.R1d;
import com.facebook.jni.HybridData;
import com.facebook.mqttbypass.IMqttBypassClientHolder;

/* loaded from: MqttBypassClientHolder.class */
public final class MqttBypassClientHolder extends IMqttBypassClientHolder {
    public static final R1d Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.R1d, java.lang.Object] */
    static {
        C0il.A0B("mqttbypass-jni");
    }

    public static final native HybridData initHybrid(MqttBypassConfig mqttBypassConfig);

    @Override // com.facebook.mqttbypass.IMqttBypassClientHolder
    public native void blockConnectionCreationNative();

    @Override // com.facebook.mqttbypass.IMqttBypassClientHolder
    public native void permitConnectionCreationNative();
}
