package com.facebook.msys.mci;

import X.0fH;
import X.1XV;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;

/* loaded from: Log.class */
public class Log {
    public static boolean sRegistered;

    static {
        1XV.A00();
    }

    public static void log(int i, String str) {
        0fH.A01(i, DGWRegionHintManager.SERVICE_KEY_MSYS, str);
    }

    public static native void registerLoggerNative(long j, int i, boolean z, int i2);

    public static native void setLogLevel(int i);
}
