package com.facebook.mobileconfig;

import X.0fH;
import X.C0gh;

/* loaded from: MobileConfigNativeFileRepository.class */
public class MobileConfigNativeFileRepository {
    public static String TAG = "MobileConfigNativeFileRepository";
    public static boolean isNativeBridgeInitialized;

    static {
        C0gh.A02("mobileconfig-jni");
    }

    public static void registerFileRepository() {
        synchronized (MobileConfigNativeFileRepository.class) {
            if (isNativeBridgeInitialized) {
                0fH.A0l(TAG, "Attempting to initialize the native JNI bridge when it is already init. Skipping...");
            } else {
                0fH.A0l(TAG, "Initializing the native JNI bridge for MobileConfigFileRepository.");
                registerNativeBridge();
                isNativeBridgeInitialized = true;
            }
        }
    }

    public static native void registerNativeBridge();
}
