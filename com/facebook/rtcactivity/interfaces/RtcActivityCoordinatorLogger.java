package com.facebook.rtcactivity.interfaces;

/* loaded from: RtcActivityCoordinatorLogger.class */
public interface RtcActivityCoordinatorLogger {
    void logAbortTimerFired(String str);

    void logAbortTimerStarted(String str);

    void logAbortTimerStopped(String str);

    void logAcceptStartRequest(String str);

    void logDeclineStartRequest(String str);

    void logInitiatedActivity(String str, String str2, Version version, Iterable iterable, Iterable iterable2, int i);

    void logReadyToStartActivity(String str, Iterable iterable);

    void logReceivedActivityMessage(String str);

    void logReceivedCancelStartRequestFromPeer(String str, String str2, String str3);

    void logReceivedStartRequestFromPeer(String str, String str2, String str3, Version version, Iterable iterable);

    void logRequestedCancelActivityStart(String str, String str2, String str3);

    void logSentActivityMessage(String str, String str2, boolean z);

    void logStateTransition(String str, String str2, String str3);
}
