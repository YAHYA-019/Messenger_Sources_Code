package com.facebook.common.dextricks;

/* loaded from: CanaryLoader.class */
public class CanaryLoader {
    public static Runnable sInstance;

    public static Runnable getInstance() {
        Runnable runnable;
        synchronized (CanaryLoader.class) {
            runnable = sInstance;
        }
        return runnable;
    }

    public static void setInstance(Runnable runnable) {
        synchronized (CanaryLoader.class) {
            sInstance = runnable;
        }
    }

    public static void verifyCanaryClasses() {
        Runnable canaryLoader = getInstance();
        if (canaryLoader != null) {
            canaryLoader.run();
        }
    }
}
