package X;

import android.os.Process;
import android.os.SystemClock;
import com.facebook.common.dextricks.stats.ClassLoadingStats;

/* renamed from: X.4Um, reason: invalid class name */
/* loaded from: 4Um.class */
public final class C4Um {
    public C7f4 A00;
    public final 1Br A01 = 1Bq.A00(16520);

    /* JADX WARN: Type inference failed for: r0v12, types: [X.7f4] */
    public static final C7f4 A00() {
        Runtime runtime = Runtime.getRuntime();
        final int i = ClassLoadingStats.A00().A01().A00;
        final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        final long freeMemory = runtime.totalMemory() - runtime.freeMemory();
        final long elapsedCpuTime = Process.getElapsedCpuTime();
        return new C04v(i, currentThreadTimeMillis, freeMemory, elapsedCpuTime) { // from class: X.7f4
            public final int A00;
            public final long A01;
            public final long A02;
            public final long A03;

            {
                this.A00 = i;
                this.A03 = currentThreadTimeMillis;
                this.A01 = freeMemory;
                this.A02 = elapsedCpuTime;
            }
        };
    }
}
