package com.facebook.jsi.mdcd;

import java.util.Map;

/* loaded from: HermesCodeCoverage.class */
public class HermesCodeCoverage {
    public static volatile boolean nativeLoadSuccess;

    public static native void disableNative();

    public static native void enableNative();

    public static native Map getExecutedFunctionsNative();

    public static native boolean isEnabledNative();
}
