package com.facebook.backtrace;

import X.C0il;

/* loaded from: NativeBacktrace.class */
public final class NativeBacktrace {
    public static final NativeBacktrace INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.backtrace.NativeBacktrace] */
    static {
        C0il.A0B("backtrace-jni");
    }

    public static final native String getBacktraceNative(long j, int i, boolean z, boolean z2);

    public static final native boolean getElfCachingEnabled();

    public static final native void setElfCachingEnabled(boolean z);
}
