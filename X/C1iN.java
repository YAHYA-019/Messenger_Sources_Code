package X;

import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1iN, reason: invalid class name */
/* loaded from: 1iN.class */
public final class C1iN implements Runnable {
    public static final String __redex_internal_original_name = "BaseBooster$NotifyRunnable";
    public 1fB A00;
    public AtomicBoolean A01 = new AtomicBoolean(false);
    public boolean A02;
    public boolean A03;
    public boolean A04;

    @Override // java.lang.Runnable
    public void run() {
        1iK[] r0;
        int length;
        1iK r307;
        long j;
        1fB r02 = this.A00;
        synchronized (r02.A08) {
            r0 = r02.A04;
        }
        if (r0 != null && (length = r0.length) > 0) {
            int i = 0;
            do {
                1iK r03 = r0[i];
                if (this.A01.get()) {
                    return;
                }
                boolean z = this.A04;
                boolean z2 = this.A03;
                if (z) {
                    if (!z2) {
                        r307 = r03;
                        if (this.A02) {
                            j = SystemClock.uptimeMillis();
                            r307.A00 = j;
                        }
                    }
                    i++;
                } else {
                    boolean z3 = this.A02;
                    if (!z2) {
                        r307 = r03;
                        if (z3) {
                            r307.A02++;
                        }
                        r307.A01++;
                        long j2 = r307.A00;
                        j = -1;
                        if (j2 > j) {
                            r307.A03 += SystemClock.uptimeMillis() - j2;
                            r307.A00 = j;
                        }
                    }
                    i++;
                }
            } while (i < length);
        }
        Queue queue = 1fB.A0A;
        synchronized (queue) {
            queue.offer(this);
        }
    }
}
