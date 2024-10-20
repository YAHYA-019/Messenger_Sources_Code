package com.facebook.common.dextricks;

import X.04A;
import X.0Pz;
import X.AnonymousClass001;
import X.C0sF;
import android.os.Process;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.util.HashMap;
import java.util.Random;

/* loaded from: DexTricksErrorReporter.class */
public class DexTricksErrorReporter {
    public static final int ALWAYS_REPORT = 1;
    public static final int DEFAULT_SOFT_ERROR_REPORTING_FREQUENCY = 1000;
    public static final int I_WANT_MORE_SOFT_ERRORS_FREQUENCY = 100;
    public static final Random RANDOM = new Random();

    public static String formatCategorySampling(String str, int i) {
        if (i != 1) {
            StringBuilder A0n = AnonymousClass001.A0n(str);
            A0n.append(" [freq=");
            A0n.append(i);
            str = AnonymousClass001.A0d("]", A0n);
        }
        return str;
    }

    public static boolean randomSamplingCoinflip(int i) {
        boolean z = true;
        if (i != 1 && RANDOM.nextInt(i) != 0) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0sF, java.lang.Exception] */
    public static void reportSampledSoftError(final String str, final String str2, final int i, Throwable th) {
        Mlog.e(th, "SOFT ERROR %s: %s", str, str2);
        if (randomSamplingCoinflip(i)) {
            final ?? exc = new Exception(0Pz.A0j(str, " | ", str2), th);
            new Thread(new Runnable() { // from class: com.facebook.common.dextricks.DexTricksErrorReporter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Process.setThreadPriority(10);
                        HashMap A0u = AnonymousClass001.A0u();
                        A0u.put("stack_trace", 04A.A01(C0sF.this));
                        DirectReports.A02(null, null, null, null, DexTricksErrorReporter.formatCategorySampling(str, i), str2, A0u);
                    } catch (Throwable th2) {
                        Mlog.w(th2, "Unable to report soft error", AnonymousClass001.A1Z());
                    }
                }
            }, "dexTrickError").start();
        }
    }

    public static void reportSampledSoftError(String str, String str2, Throwable th) {
        reportSampledSoftError(str, str2, 1000, th);
    }
}
