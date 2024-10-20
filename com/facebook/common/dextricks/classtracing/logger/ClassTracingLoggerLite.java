package com.facebook.common.dextricks.classtracing.logger;

import X.0Xt;
import X.0YE;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite;
import com.facebook.systrace.Systrace;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: ClassTracingLoggerLite.class */
public class ClassTracingLoggerLite {
    public static final ConcurrentLinkedQueue A00 = new ConcurrentLinkedQueue();
    public static volatile boolean A01;
    public static volatile boolean A02;

    static {
        0Xt r0 = new 0Xt() { // from class: X.0sO
            public void CRH() {
                if (Systrace.A0E(34359738368L)) {
                    Systrace.A03(34359738368L, "CLASS_LOAD_TRACE", 0);
                    ClassTracingLoggerLite.A02 = true;
                    ClassTracingLoggerLite.A01 = AnonymousClass001.A1N(ClassTracingLoggerLite.A02 ? 1 : 0);
                }
            }

            public void CRI() {
                if (Systrace.A0E(34359738368L)) {
                    ClassTracingLoggerLite.A02 = false;
                    ClassTracingLoggerLite.A01 = AnonymousClass001.A1N(ClassTracingLoggerLite.A02 ? 1 : 0);
                    Systrace.A05(34359738368L, "CLASS_LOAD_TRACE", 0);
                }
            }
        };
        String[][] strArr = Systrace.A03;
        0YE.A01(r0);
    }

    public static void beginClassLoad(String str) {
        if (A01) {
            boolean z = ClassId.sInitialized;
        }
    }

    public static void classLoaded(Class cls) {
        if (A01 && ClassId.sInitialized) {
            A00.add(Long.valueOf(ClassId.getClassId(cls)));
        }
    }

    public static void classNotFound() {
        if (A01 && ClassId.sInitialized) {
            A00.add(Long.valueOf(-1));
        }
    }
}
