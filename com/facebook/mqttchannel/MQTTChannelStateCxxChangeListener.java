package com.facebook.mqttchannel;

/* loaded from: MQTTChannelStateCxxChangeListener.class */
public interface MQTTChannelStateCxxChangeListener {
    void onApplicationStateChanged(int i, int i2);

    void onConnectionStateChangeIgnored(int i, int i2);

    void onConnectionStateChanged(int i, int i2);

    void onNetworkStatusChanged(int i, int i2);
}
