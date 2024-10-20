package com.facebook.mqtt.service;

/* loaded from: MqttPublishListener.class */
public interface MqttPublishListener {
    void onFailure(int i, int i2);

    void onSuccess(int i);

    void onTimeout(int i, boolean z);
}
