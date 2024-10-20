package com.facebook.common.errorreporting.memory.heapsanitizer;

/* loaded from: HeapSanitizer.class */
public class HeapSanitizer {
    public static volatile boolean sInit;

    public static native String nativeSanitizeHprof(String str);
}
