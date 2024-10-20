package com.facebook.mobileboost.framework.os.jni;

import X.0fH;
import X.C0il;

/* loaded from: MobileBoostNative.class */
public class MobileBoostNative {
    public static boolean sNativeLibLoaded;

    static {
        try {
            sNativeLibLoaded = C0il.A0B("fb_mboost");
        } catch (UnsatisfiedLinkError e) {
            0fH.A0u("MobileBoostJNI", "Failed to load MobileBoostNative lib.", e);
            sNativeLibLoaded = false;
        }
    }

    public static native void disableSmartFsync();

    public static native boolean enableLicmFix(boolean z);

    public static native boolean enableSmartFsync(boolean z);
}
