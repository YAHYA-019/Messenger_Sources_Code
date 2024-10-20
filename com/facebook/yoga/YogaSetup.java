package com.facebook.yoga;

import X.C0il;

/* loaded from: YogaSetup.class */
public class YogaSetup {
    static {
        C0il.A0B("yoga_internal");
    }

    public static long getLithoConfig() {
        return 0L;
    }

    public static long getReactNativeClassicConfig() {
        return 0L;
    }

    public static native void jni_enableFacebookInstrumentation();

    public static native void jni_resetCounters();
}
