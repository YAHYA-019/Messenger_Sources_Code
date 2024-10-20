package com.facebook.common.time;

import X.C0dr;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: RealtimeSinceBootClock.class */
public class RealtimeSinceBootClock implements C0dr {
    public static final RealtimeSinceBootClock A00 = new Object();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    @Override // X.C0dr
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // X.C0dr
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
