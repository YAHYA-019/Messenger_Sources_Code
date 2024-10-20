package com.facebook.common.threadutils;

import X.1Em;
import X.C0il;
import X.C4S8;

/* loaded from: ThreadUtils.class */
public final class ThreadUtils {
    public static final C4S8 Companion = new Object();
    public static final ThreadUtils instance = new ThreadUtils();
    public final int maxAffinityMask = (1 << 1Em.A0P.A05()) - 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4S8] */
    static {
        C0il.A0B("threadutils-jni");
    }

    public static final native void nativeSetThreadAffinityMask(int i, int i2);
}
