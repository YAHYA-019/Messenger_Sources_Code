package com.meta.foa.performancelogging;

/* loaded from: FOAMessagingPerformanceLogger.class */
public interface FOAMessagingPerformanceLogger {
    Integer getInstanceKey();

    Long getStartTimestamp();

    boolean isMarkerOn();

    void onAppBackgrounded(long j);

    void onAppForegrounded();

    void onEndFlowCancel(String str);

    void onEndFlowFail(String str);

    void onLogClickEnd();
}
