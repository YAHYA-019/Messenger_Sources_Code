package com.facebook.profilo.core;

/* loaded from: TraceEvents.class */
public final class TraceEvents {
    public static int sLastNameRefreshProvidersState;
    public static volatile int sProviders;

    public static boolean isEnabled(int i) {
        boolean z = false;
        if ((i & sProviders) != 0) {
            z = true;
        }
        return z;
    }

    public static native void nativeClearAllProviders();

    public static native int nativeDisableProviders(int i);

    public static native int nativeEnableProviders(int i);

    public static native void nativeRefreshProviderNames(int[] iArr, String[] strArr);
}
