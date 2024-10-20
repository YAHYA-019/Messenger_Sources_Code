package com.facebook.quicklog;

import X.02O;
import X.0fH;
import X.AnonymousClass001;

/* loaded from: QuickPerformanceLoggerProvider.class */
public class QuickPerformanceLoggerProvider {
    public static QuickPerformanceLogger A00;
    public static final 02O A01 = new Object();

    public static QuickPerformanceLogger getQPLInstance() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger == null) {
            0fH.A0r("QPLProvider", "QuickPerformanceLogger instance wasn't installed in provider, returning noop. Please call QuickPerformanceLoggerProvider.setQuickPerformanceLogger() before getting the instance.", AnonymousClass001.A0N("No QPL instance provided"));
            quickPerformanceLogger = null;
        }
        return quickPerformanceLogger;
    }
}
