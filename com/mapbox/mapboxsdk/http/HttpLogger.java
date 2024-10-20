package com.mapbox.mapboxsdk.http;

import com.mapbox.mapboxsdk.log.Logger;

/* loaded from: HttpLogger.class */
public class HttpLogger {
    public static final String TAG = "Mbgl-HttpRequest";
    public static boolean logEnabled = true;
    public static boolean logRequestUrl;

    public static void log(int i, String str) {
        if (logEnabled) {
            Logger.log(i, TAG, str);
        }
    }

    public static void logFailure(int i, String str, String str2) {
        int i2;
        Object obj;
        if (i == 1) {
            i2 = 3;
            obj = "temporary";
        } else {
            i2 = 5;
            if (i == 0) {
                i2 = 4;
                obj = "connection";
            } else {
                obj = "permanent";
            }
        }
        if (!logRequestUrl) {
            str2 = "";
        }
        log(i2, String.format("Request failed due to a %s error: %s %s", obj, str, str2));
    }
}
