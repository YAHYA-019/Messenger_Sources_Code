package com.facebook.rti.common.time;

import android.os.SystemClock;

/* loaded from: RealtimeSinceBootClock.class */
public class RealtimeSinceBootClock {
    public static final RealtimeSinceBootClock INSTANCE = new Object();

    public static RealtimeSinceBootClock get() {
        return INSTANCE;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
