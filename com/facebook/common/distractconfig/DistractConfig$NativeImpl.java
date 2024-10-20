package com.facebook.common.distractconfig;

import X.C0il;

/* loaded from: DistractConfig$NativeImpl.class */
public final class DistractConfig$NativeImpl {
    public static final DistractConfig$NativeImpl INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.common.distractconfig.DistractConfig$NativeImpl, java.lang.Object] */
    static {
        C0il.A0B("distract-config");
    }

    public static final native void configureDistractBlockingNative(String str, String str2);
}
