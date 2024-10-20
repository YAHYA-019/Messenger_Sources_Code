package com.facebook.jni;

import X.C0gh;

/* loaded from: ThreadScopeSupport.class */
public class ThreadScopeSupport {
    static {
        C0gh.A03("fbjni");
    }

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    public static native void runStdFunctionImpl(long j);
}
