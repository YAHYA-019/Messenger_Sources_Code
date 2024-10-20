package com.facebook.analytics.util;

import X.C0il;

/* loaded from: AnalyticsMemoryUtil.class */
public final class AnalyticsMemoryUtil {
    static {
        C0il.A0B("analyticsutil-jni");
    }

    public static native String[] getLoadedLibraries();

    public static native long getPeakRss();
}
