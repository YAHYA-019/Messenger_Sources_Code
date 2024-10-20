package com.facebook.advancedcryptotransport;

import X.C1z8;

/* loaded from: AppInstallContext.class */
public class AppInstallContext {
    public static volatile boolean mIsApplicationFirstRunOnUpgrade;
    public static volatile boolean mShouldSimulateFutureVersion;

    static {
        C1z8.A00();
    }

    public static boolean isApplicationFirstRunOnUpgrade() {
        return mIsApplicationFirstRunOnUpgrade;
    }

    public static boolean shouldFailNextSendWithEmptyDeviceListEncryptionError() {
        return false;
    }

    public static boolean shouldSimulateFutureVersion() {
        return mShouldSimulateFutureVersion;
    }
}
