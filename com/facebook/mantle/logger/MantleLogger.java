package com.facebook.mantle.logger;

import X.11T;
import X.C0il;
import X.HB3;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: MantleLogger.class */
public final class MantleLogger {
    public static final MantleLogger INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.mantle.logger.MantleLogger, java.lang.Object] */
    static {
        C0il.A0B("mantle-logger");
    }

    public static final void log(HB3 hb3, String str) {
        11T.A0H(hb3, str);
        nativeLog(hb3.value, str);
    }

    public static final native void nativeLog(int i, String str);

    public static final native void nativeSetLogger(XAnalyticsHolder xAnalyticsHolder);

    public static final void setLogger(XAnalyticsHolder xAnalyticsHolder) {
        11T.A0F(xAnalyticsHolder, 0);
        nativeSetLogger(xAnalyticsHolder);
    }
}
