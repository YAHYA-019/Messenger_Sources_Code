package com.facebook.common.perfcounter;

import X.AnonymousClass001;
import com.facebook.endtoend.EndToEnd;

/* loaded from: PerfCounter.class */
public final class PerfCounter {
    public static volatile int available = 255;
    public static int callerCount;
    public static volatile boolean libLoaded;
    public static final PerfCounter INSTANCE = new Object();
    public static final Object locK = AnonymousClass001.A0R();

    public static final void end() {
        synchronized (locK) {
            int i = callerCount;
            if (i != 0) {
                if (i == 1) {
                    nativeEnd();
                }
                callerCount--;
            }
        }
    }

    public static final boolean isEnabled() {
        boolean z = false;
        if (available == -1) {
            available = (AnonymousClass001.A1X("/proc/sys/kernel/perf_event_paranoid") && (EndToEnd.A03() || AnonymousClass001.A1X("/data/local/tmp/ctscan_perfcounter_collect"))) ? 1 : 0;
        }
        if (available == 1) {
            z = true;
        }
        return z;
    }

    public static final native boolean nativeBegin();

    public static final native void nativeEnd();

    public static final native void nativeReport(Object obj);
}
