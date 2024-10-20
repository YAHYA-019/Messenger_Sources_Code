package com.facebook.reliability.fssync;

import X.0fH;
import android.os.Build;

/* loaded from: NoSync.class */
public final class NoSync {
    public static final NoSync INSTANCE = new Object();
    public static final String TAG = "NoSync";
    public static boolean syncDisabled;

    public static final void disableFSSync(boolean z) {
        if (syncDisabled) {
            return;
        }
        boolean disableFSSync = disableFSSync(Build.VERSION.SDK_INT, z);
        syncDisabled = disableFSSync;
        0fH.A0g(Boolean.valueOf(disableFSSync), TAG, "No FSSync: %b");
    }

    public static final native boolean disableFSSync(int i, boolean z);
}
