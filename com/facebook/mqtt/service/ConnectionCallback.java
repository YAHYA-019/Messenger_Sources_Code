package com.facebook.mqtt.service;

/* loaded from: ConnectionCallback.class */
public interface ConnectionCallback {
    void onConnectionChanged(int i, String str);

    void onConnectionError(int i);

    void onMessageDropped(String str, byte[] bArr, long j);
}
