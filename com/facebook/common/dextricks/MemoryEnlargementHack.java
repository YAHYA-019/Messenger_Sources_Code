package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.content.Context;
import android.util.Log;

/* loaded from: MemoryEnlargementHack.class */
public final class MemoryEnlargementHack {
    public static final String TAG = "MemoryEnlargementHack";

    public static void growMyHeap(Context context) {
        String str;
        if ((context.getApplicationInfo().flags & 1048576) == 0) {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            cls.getMethod("clearGrowthLimit", new Class[0]).invoke(AnonymousClass001.A0S(null, cls.getMethod("getRuntime", new Class[0])), new Object[0]);
            str = "largeHeap enabled manually; was not set in manifest";
        } else {
            str = "largeHeap already enabled in manifest";
        }
        Log.v(TAG, str);
    }
}
