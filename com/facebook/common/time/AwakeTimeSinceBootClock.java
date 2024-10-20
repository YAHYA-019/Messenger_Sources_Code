package com.facebook.common.time;

import X.C0dr;
import java.util.concurrent.TimeUnit;

/* loaded from: AwakeTimeSinceBootClock.class */
public class AwakeTimeSinceBootClock implements C0dr {
    public static final AwakeTimeSinceBootClock INSTANCE = new Object();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // X.C0dr
    public /* synthetic */ long now() {
        long millis;
        millis = TimeUnit.NANOSECONDS.toMillis(nowNanos());
        return millis;
    }

    @Override // X.C0dr
    public long nowNanos() {
        return System.nanoTime();
    }
}
