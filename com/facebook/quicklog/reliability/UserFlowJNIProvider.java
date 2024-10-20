package com.facebook.quicklog.reliability;

/* loaded from: UserFlowJNIProvider.class */
public class UserFlowJNIProvider {
    public static UserFlowLogger mUserFlowLogger;

    public static UserFlowLogger getUserFlowInstance() {
        return mUserFlowLogger;
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (UserFlowJNIProvider.class) {
            z = false;
            if (mUserFlowLogger != null) {
                z = true;
            }
        }
        return z;
    }

    public static void setUserFlowLogger(UserFlowLogger userFlowLogger) {
        synchronized (UserFlowJNIProvider.class) {
            mUserFlowLogger = userFlowLogger;
        }
    }
}
