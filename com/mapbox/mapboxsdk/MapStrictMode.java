package com.mapbox.mapboxsdk;

/* loaded from: MapStrictMode.class */
public class MapStrictMode {
    public static volatile boolean strictModeEnabled;

    public static void setStrictModeEnabled(boolean z) {
        synchronized (MapStrictMode.class) {
            strictModeEnabled = z;
        }
    }

    public static void strictModeViolation(String str) {
        if (strictModeEnabled) {
            throw new MapStrictModeException(str);
        }
    }

    public static void strictModeViolation(String str, Throwable th) {
        if (strictModeEnabled) {
            throw new MapStrictModeException(String.format("%s - %s", str, th));
        }
    }

    public static void strictModeViolation(Throwable th) {
        if (strictModeEnabled) {
            throw new MapStrictModeException(String.format("%s", th));
        }
    }
}
