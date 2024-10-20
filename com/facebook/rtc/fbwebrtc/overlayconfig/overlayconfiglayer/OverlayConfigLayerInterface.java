package com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer;

/* loaded from: OverlayConfigLayerInterface.class */
public interface OverlayConfigLayerInterface {
    int getLayerSource();

    int[] getUpdatedValues();

    int[] getValues();

    void logExposure(int i);
}
