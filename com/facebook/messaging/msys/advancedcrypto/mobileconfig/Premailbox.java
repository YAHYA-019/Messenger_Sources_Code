package com.facebook.messaging.msys.advancedcrypto.mobileconfig;

import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;

/* loaded from: Premailbox.class */
public abstract class Premailbox {
    public MessengerSessionedMCPContext mAppContext;

    public Premailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mAppContext = messengerSessionedMCPContext;
    }

    private String MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformCopyStringJNI(int i, String str, boolean z) {
        if (str == null) {
            str = null;
        }
        String MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformCopyString = MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformCopyString(i, str, z);
        if (MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformCopyString != null) {
            return MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformCopyString;
        }
        return null;
    }

    private boolean MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetBooleanJNI(int i, boolean z, boolean z2) {
        return MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetBoolean(i, z, z2);
    }

    private double MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetDoubleJNI(int i, double d, boolean z) {
        return MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetDouble(i, d, z);
    }

    private int MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetInt32JNI(int i, int i2, boolean z) {
        return MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetInt32(i, i2, z);
    }

    private long MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetInt64JNI(int i, long j, boolean z) {
        return MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetInt64(i, j, z);
    }

    public abstract String MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformCopyString(int i, String str, boolean z);

    public abstract boolean MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetBoolean(int i, boolean z, boolean z2);

    public abstract double MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetDouble(int i, double d, boolean z);

    public abstract int MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetInt32(int i, int i2, boolean z);

    public abstract long MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetInt64(int i, long j, boolean z);

    public abstract void MEMMobileConfigPlatformMessengerAndroidPluginPremailboxExtensionsDestroy();
}
