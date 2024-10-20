package com.facebook.omnistore;

/* loaded from: OmnistoreCustomLogger.class */
public interface OmnistoreCustomLogger {
    int getAnalyticsEventBuilderId(String str, String str2);

    void logAnalyticsEvent(int i, String str, String str2, String str3);

    void logCounter(String str, int i);

    void logDebug(String str, String str2);

    void logError(String str, String str2);

    void logInfo(String str, String str2);

    void logWarning(String str, String str2);
}
