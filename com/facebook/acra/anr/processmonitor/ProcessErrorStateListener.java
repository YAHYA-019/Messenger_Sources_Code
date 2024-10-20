package com.facebook.acra.anr.processmonitor;

/* loaded from: ProcessErrorStateListener.class */
public interface ProcessErrorStateListener {
    void onCheckFailed();

    void onCheckPerformed();

    void onErrorCleared();

    boolean onErrorDetectOnOtherProcess(String str, String str2, String str3);

    void onErrorDetected(String str, String str2);

    void onMaxChecksReachedAfterError();

    void onMaxChecksReachedBeforeError();

    void onStart();
}
