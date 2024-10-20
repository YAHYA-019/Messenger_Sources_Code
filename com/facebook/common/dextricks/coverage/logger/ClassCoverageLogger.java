package com.facebook.common.dextricks.coverage.logger;

import X.0WL;
import X.0fH;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: ClassCoverageLogger.class */
public class ClassCoverageLogger {
    public static volatile String A01;
    public static final Queue A00 = new ConcurrentLinkedQueue();
    public static volatile boolean A02 = "true".equals(0WL.A02("fb.enable_class_coverage"));

    static {
        if (A02) {
            0fH.A0C(ClassCoverageLogger.class, "Class coverage logger is enabled");
        }
        A01 = 0WL.A02("fb.throw_on_class_load");
        if (A01.isEmpty()) {
            return;
        }
        0fH.A08(ClassCoverageLogger.class, A01, "Load failure enabled for: %s");
    }
}
