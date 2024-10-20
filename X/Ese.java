package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: Ese.class */
public final class Ese {
    public final QuickPerformanceLogger A00;

    public Ese(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public final void A00(String str, String str2, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(i);
            quickPerformanceLogger.markerAnnotate(i, "platform", "Android");
            quickPerformanceLogger.markerAnnotate(i, "app_id", 350685531728L);
            if (str == null) {
                str = "";
            }
            quickPerformanceLogger.markerAnnotate(i, "app_source", str);
            quickPerformanceLogger.markerAnnotate(i, "item_type", "ACCOUNT_ITEM");
            if (str2 == null) {
                str2 = "";
            }
            quickPerformanceLogger.markerAnnotate(i, "credential_source", str2);
            quickPerformanceLogger.markerAnnotate(i, "logging_version", "3.0");
        }
    }
}
