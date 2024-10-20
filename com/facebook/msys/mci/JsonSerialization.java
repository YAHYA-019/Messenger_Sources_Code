package com.facebook.msys.mci;

import X.1Ne;
import X.1SL;

/* loaded from: JsonSerialization.class */
public class JsonSerialization {
    public static boolean sInitialized;

    static {
        1SL.A00();
    }

    public static boolean isMCPEnabledForJsonSerialization() {
        return 1Ne.A00(12);
    }

    public static native void nativeInitialize();
}
