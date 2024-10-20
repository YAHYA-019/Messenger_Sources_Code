package com.facebook.mqtt.service;

/* loaded from: MqttSubscribeListener.class */
public interface MqttSubscribeListener {
    void onData(String str, byte[] bArr, long j);

    void onSubscriptionResponse(String str, boolean z, int i);
}
