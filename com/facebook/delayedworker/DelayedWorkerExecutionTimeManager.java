package com.facebook.delayedworker;

import X.1BQ;
import X.1G2;
import X.1G3;
import X.C00i;

/* loaded from: DelayedWorkerExecutionTimeManager.class */
public final class DelayedWorkerExecutionTimeManager {
    public static final 1G2 A01;
    public static final 1G2 A02;
    public static final 1G2 A03;
    public final C00i A00 = new 1BQ(33013);

    static {
        1G3 r0 = new 1G3("delayed_worker/");
        A03 = r0;
        A02 = r0.A0D("exec_time/");
        A01 = r0.A0D("_didCleanUp");
    }
}
