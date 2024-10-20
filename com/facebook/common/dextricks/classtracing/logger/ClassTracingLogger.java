package com.facebook.common.dextricks.classtracing.logger;

import X.0Xt;
import X.0YE;
import X.AnonymousClass001;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.systrace.Systrace;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: ClassTracingLogger.class */
public final class ClassTracingLogger {
    public static volatile boolean A00;
    public static volatile boolean A01;
    public static volatile boolean A02;
    public static volatile boolean A03;
    public static volatile boolean A04;

    static {
        0Xt r0 = new 0Xt() { // from class: X.0sR
            public void CRH() {
                if (Systrace.A0E(34359738368L)) {
                    Systrace.A03(34359738368L, "CLASS_LOAD_TRACE", 0);
                    ClassTracingLogger.A03 = true;
                    ClassTracingLogger.A01();
                }
            }

            public void CRI() {
                if (Systrace.A0E(34359738368L)) {
                    ClassTracingLogger.A03 = false;
                    ClassTracingLogger.A01();
                    Systrace.A05(34359738368L, "CLASS_LOAD_TRACE", 0);
                }
            }
        };
        String[][] strArr = Systrace.A03;
        0YE.A01(r0);
    }

    public static HashMap A00() {
        Thread[] threadArr = new Thread[Thread.activeCount() + 20];
        int enumerate = Thread.enumerate(threadArr);
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= enumerate) {
                return A0u;
            }
            A0u.put(Long.valueOf(threadArr[i2].getId()), threadArr[i2].getName());
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01() {
        /*
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02
            r301 = r0
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A01
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L21
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A03
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L21
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = r301
            if (r0 == 0) goto L52
        L21:
            r0 = r304
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A04 = r0
            r0 = r301
            r1 = 1
            r0 = r0 ^ r1
            r302 = r0
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A01
            r301 = r0
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A03
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L4b
            java.lang.String r0 = "classtracing"
            r305 = r0
            r0 = r305
            boolean r0 = X.C0il.A0B(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L42
            goto L4b
        L42:
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
            goto L52
        L4b:
            r0 = r301
            r1 = r304
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder.configureTracing(r0, r1)
            r0 = 1
            r302 = r0
        L52:
            r0 = r302
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02 = r0
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L68
            boolean r0 = com.facebook.common.dextricks.classid.ClassId.sInitialized
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L68
            r0 = 1
            r303 = r0
        L68:
            r0 = r303
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A00 = r0
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A00
            X.0GO.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A01():void");
    }

    public static void A02(int i) {
        if (A02) {
            A03(-1869562246, i);
        }
    }

    public static void A03(int i, int i2) {
        ClassTracingLoggerNativeHolder.classLoadStarted(null);
        ClassTracingLoggerNativeHolder.classLoaded((i2 << 32) | (i & 4294967295L));
    }

    public static long[] A04() {
        if (!A04) {
            return new long[0];
        }
        long[] loadedClassIds = ClassTracingLoggerNativeHolder.loadedClassIds();
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        boolean z = false;
        for (long j : loadedClassIds) {
            if (j != -1) {
                int i2 = (int) (j & 4294967295L);
                if (i2 != 1505373456 && i2 != 1215735889) {
                    z = true;
                } else if (!A0u.containsKey(Long.valueOf(j)) || z) {
                    z = false;
                }
                int i3 = i + 1;
                loadedClassIds[i] = j;
                if (i2 == 1505373456 || i2 == 1215735889) {
                    A0u.put(Long.valueOf(j), true);
                }
                i = i3;
            }
        }
        return Arrays.copyOf(loadedClassIds, i);
    }

    public static void beginClassLoad(String str) {
        if (A00) {
            ClassTracingLoggerNativeHolder.classLoadStarted(str);
        }
    }

    public static void classLoaded(Class cls) {
        long classId;
        if (A00) {
            if (ClassId.sInitialized) {
                classId = ClassId.getClassId(cls);
                if (((-281474976710656L) & classId) != 0) {
                    throw AnonymousClass001.A0p();
                }
                Thread currentThread = Thread.currentThread();
                if (currentThread != null) {
                    classId |= (currentThread.getId() & ((char) (-1))) << 48;
                }
            } else {
                classId = -1;
            }
            ClassTracingLoggerNativeHolder.classLoaded(classId);
        }
    }

    public static void classNotFound() {
        if (A00) {
            ClassTracingLoggerNativeHolder.classLoadCancelled();
        }
    }
}
