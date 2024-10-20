package com.facebook.profilo.provider.stacktrace;

import X.C0il;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: CPUProfiler.class */
public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    static {
        C0il.A0B("profilo_stacktrace");
    }

    public static native boolean nativeInitialize(MultiBufferLogger multiBufferLogger, int i, boolean z, boolean z2, int i2, int i3, boolean z3);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i, int i2, int i3, boolean z, boolean z2);

    public static native void nativeStopProfiling();
}
