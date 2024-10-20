package com.facebook.redex.dynamicanalysis;

import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: DynamicAnalysisTraceManager.class */
public final class DynamicAnalysisTraceManager {
    public static final Semaphore A01 = new Semaphore(0);
    public static final AtomicBoolean A02 = new AtomicBoolean(false);
    public static final HashMap A00 = new HashMap();
}
