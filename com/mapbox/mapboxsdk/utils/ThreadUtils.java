package com.mapbox.mapboxsdk.utils;

import X.AnonymousClass001;
import android.content.Context;
import android.os.Looper;

/* loaded from: ThreadUtils.class */
public class ThreadUtils {
    public static Boolean debug;

    public static void checkThread(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException(String.format("%s interactions should happen on the UI thread.", str));
        }
    }

    public static ThreadUtils init(Context context) {
        debug = Boolean.valueOf(AnonymousClass001.A1N(context.getApplicationInfo().flags & 2));
        return null;
    }
}
