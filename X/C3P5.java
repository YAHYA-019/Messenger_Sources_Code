package X;

import android.os.SystemClock;

/* renamed from: X.3P5, reason: invalid class name */
/* loaded from: 3P5.class */
public abstract class C3P5 {
    public static void A00(2vI r301) {
        Object obj = r301.A03;
        synchronized (obj) {
            while (!r301.A02) {
                obj.wait();
            }
        }
    }

    public static void A01(2vI r301, long j) {
        Object obj = r301.A03;
        synchronized (obj) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = 0;
            while (true) {
                long j3 = j2;
                if (r301.A02 || j3 < 0 || j3 >= j) {
                    break;
                }
                obj.wait(j - j3);
                j2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            }
        }
    }
}
