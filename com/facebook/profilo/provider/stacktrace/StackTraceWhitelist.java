package com.facebook.profilo.provider.stacktrace;

import X.C0il;

/* loaded from: StackTraceWhitelist.class */
public class StackTraceWhitelist {
    static {
        C0il.A0B("profilo_stacktrace");
    }

    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);
}
