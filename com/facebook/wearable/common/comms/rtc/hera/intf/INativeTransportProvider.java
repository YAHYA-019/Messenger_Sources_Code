package com.facebook.wearable.common.comms.rtc.hera.intf;

/* loaded from: INativeTransportProvider.class */
public interface INativeTransportProvider {
    String getIdentifier();

    boolean start();

    void stop();
}
