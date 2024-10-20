package com.facebook.aborthooks;

import X.C0il;

/* loaded from: AbortHooks.class */
public final class AbortHooks {
    public static final AbortHooks INSTANCE = new Object();
    public static volatile boolean sInstalled;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.aborthooks.AbortHooks] */
    static {
        C0il.A0B("aborthooks");
    }

    public static final native void hookAbort();

    public static final native void hookAndroidLogAssert();

    public static final native void hookAndroidSetAbortMessage();

    public static final native void install();

    public static final native void installAll(long j);

    public static final native void setGlogFatalHandler();
}
