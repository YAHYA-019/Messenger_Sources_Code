package com.facebook.mobileboost.apps.extra;

import X.1BQ;
import X.5J5;
import X.5J6;
import X.C00i;
import android.os.Process;

/* loaded from: BoostAppJob.class */
public class BoostAppJob {
    public final C00i A00 = new 1BQ(66852);

    public static final BoostAppJob A00() {
        return new BoostAppJob();
    }

    public void A01() {
        5J5.A00 = true;
        5J6.A00();
        this.A00.get();
        try {
            int A00 = 5J5.A00("(FinalizerDaemon)");
            if (A00 != -1) {
                Process.getThreadPriority(A00);
            }
        } catch (Throwable unused) {
        }
    }
}
