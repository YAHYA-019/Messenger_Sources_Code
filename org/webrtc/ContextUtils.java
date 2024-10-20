package org.webrtc;

import X.AnonymousClass001;
import android.content.Context;

/* loaded from: ContextUtils.class */
public class ContextUtils {
    public static final String TAG = "ContextUtils";
    public static Context applicationContext;

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context == null) {
            throw AnonymousClass001.A0L("Application context cannot be null for ContextUtils.initialize.");
        }
        applicationContext = context;
    }
}
