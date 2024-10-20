package com.facebook.msys.mci;

import X.0Pz;
import X.0T9;
import X.1Ne;
import X.1XV;
import X.1Y7;
import X.1gB;
import X.2yQ;
import X.AnonymousClass001;
import X.C0jy;
import X.C1iw;
import android.os.Process;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Execution.class */
public class Execution {
    public static volatile boolean sInitialized;
    public static final Map sThreadIds;
    public static final ThreadLocal sThreadLocalExecutionContext;
    public static final AtomicInteger sThreadPriority;
    public static final ConcurrentHashMap sThreadPriorityMap;

    static {
        1XV.A00();
        sThreadPriority = new AtomicInteger((-1) << (-1));
        sThreadIds = new 2yQ(0);
        sThreadPriorityMap = new ConcurrentHashMap();
        sThreadLocalExecutionContext = new 1Y7();
    }

    public static void assertInitialized(String str) {
        if (!sInitialized) {
            throw AnonymousClass001.A0T(0Pz.A0j("Execution was called by ", str, " but was not initialized before being used"));
        }
    }

    public static native void endFlowTracking(int i, int i2);

    public static void executeAfterWithPriority(C1iw c1iw, AccountSession accountSession, int i, int i2, long j) {
        assertInitialized(c1iw.toString());
        if (!nativeScheduleTask(c1iw, accountSession, i, i2, j / 1000.0d, c1iw.toString())) {
            throw AnonymousClass001.A0T(0Pz.A0T("UNKNOWN execution context ", i));
        }
    }

    public static void executeAsync(C1iw c1iw, AccountSession accountSession, int i) {
        assertInitialized(c1iw.toString());
        executeAfterWithPriority(c1iw, accountSession, i, 0, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r302.getSessionedExecutionKey() == r0.longValue()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executePossiblySync(X.C1iw r301, com.facebook.msys.mci.AccountSession r302, int r303) {
        /*
            r0 = r301
            java.lang.String r0 = r0.toString()
            r304 = r0
            r0 = r304
            assertInitialized(r0)
            int r0 = getExecutionContext()
            r305 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L4a
            java.lang.Long r0 = getSessionedExecutionKey()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3e
            java.lang.String r0 = "Account Session must be non-null for sessioned execution contexts"
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L45
            r0 = r302
            long r0 = r0.getSessionedExecutionKey()
            r307 = r0
            r0 = r306
            long r0 = r0.longValue()
            r309 = r0
            r0 = r307
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4a
        L3e:
            r0 = r301
            r0.run()
            return
        L45:
            r0 = r304
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0Q(r0)
            throw r0
        L4a:
            r0 = r301
            r1 = r302
            r2 = r303
            executeAsync(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.Execution.executePossiblySync(X.1iw, com.facebook.msys.mci.AccountSession, int):void");
    }

    public static int getExecutionContext() {
        Pair pair = (Pair) sThreadLocalExecutionContext.get();
        if (!sInitialized || pair == null) {
            return 0;
        }
        return ((Number) pair.first).intValue();
    }

    public static Long getSessionedExecutionKey() {
        Pair pair = (Pair) sThreadLocalExecutionContext.get();
        if (!sInitialized || pair == null) {
            return null;
        }
        return (Long) pair.second;
    }

    public static boolean initialize() {
        boolean initialize;
        synchronized (Execution.class) {
            initialize = initialize(null, null);
        }
        return initialize;
    }

    public static boolean initialize(Integer num, Executor executor) {
        boolean z;
        int i;
        synchronized (Execution.class) {
            0T9.A02("Execution.initialize", 1713876903);
            try {
                if (sInitialized) {
                    z = false;
                    i = -675244263;
                } else {
                    if (num != null) {
                        sThreadPriority.set(num.intValue());
                    }
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                    i = 554534967;
                }
                0T9.A00(i);
            } catch (Throwable th) {
                0T9.A00(-119872008);
                throw th;
            }
        }
        return z;
    }

    public static boolean isMCPEnabledForExecution() {
        return 1Ne.A00(14);
    }

    public static native int nativeGetExecutionContext();

    public static native Long nativeGetSessionedExecutionKey();

    public static native void nativeInitialize();

    public static native void nativeResetExecutorsTestingOnly();

    public static native boolean nativeScheduleTask(Runnable runnable, AccountSession accountSession, int i, int i2, double d, String str);

    public static native void nativeStartExecutor(long j);

    public static native void resetFlowTrackingInCurrentThread();

    public static native void setLoggingThresholds(double d, double d2);

    public static void setThreadPriorities(Integer num) {
        AtomicInteger atomicInteger = sThreadPriority;
        int intValue = num.intValue();
        atomicInteger.set(intValue);
        for (List list : sThreadIds.values()) {
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Process.setThreadPriority(((Integer) it.next()).intValue(), intValue);
                }
            }
        }
    }

    public static void startExecutorThread(long j, int i, String str) {
        new Thread(C0jy.A02(new 1gB(i, j), "MCIExecution", 0), 0Pz.A0W(str, "Context")).start();
    }

    public static native void startFlowTracking(int i, int i2, String str);
}
