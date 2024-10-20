package com.facebook.acra.anr;

/* loaded from: ANRDetectorListener.class */
public interface ANRDetectorListener {
    String getBlackBoxTraceId();

    String getLongStallTraceId();

    void onEndANRDataCapture();

    void onStartANRDataCapture();
}
