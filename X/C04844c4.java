package X;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4c4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4c4.class */
public final class C04844c4 {
    public final InterfaceC04834c3 A05;
    public final Executor A07;
    public final int A08;
    public final Runnable A06 = new Runnable() { // from class: X.4c6
        public static final String __redex_internal_original_name = "JobScheduler$1";

        /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        
            if (r0.A09() == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        
            r0.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
        
            if (r0 != null) goto L32;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r301 = this;
                r0 = r301
                X.4c4 r0 = X.C04844c4.this
                r302 = r0
                long r0 = android.os.SystemClock.uptimeMillis()
                r303 = r0
                r0 = r302
                monitor-enter(r0)
                r0 = r302
                X.2Ds r0 = r0.A03     // Catch: java.lang.Throwable -> La6
                r305 = r0
                r0 = r302
                int r0 = r0.A00     // Catch: java.lang.Throwable -> La6
                r306 = r0
                r0 = 0
                r307 = r0
                r0 = 0
                r308 = r0
                r0 = r302
                r1 = 0
                r0.A03 = r1     // Catch: java.lang.Throwable -> La6
                r0 = 0
                r307 = r0
                r0 = 0
                r308 = r0
                r0 = r302
                r1 = 0
                r0.A00 = r1     // Catch: java.lang.Throwable -> La6
                java.lang.Integer r0 = X.0S2.A0C     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
                r308 = r0
                r0 = r302
                r1 = r308
                r0.A04 = r1     // Catch: java.lang.Throwable -> La6
                r0 = r302
                r1 = r303
                r0.A01 = r1     // Catch: java.lang.Throwable -> La6
                r0 = r302
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
                r0 = 1
                r309 = r0
                r0 = r306
                r1 = 1
                r0 = r0 & r1
                r307 = r0
                r0 = r307
                r1 = r309
                if (r0 == r1) goto L73
                r0 = 4
                r309 = r0
                r0 = r306
                r1 = 4
                r0 = r0 & r1
                r307 = r0
                r0 = r307
                r1 = r309
                if (r0 == r1) goto L73
                r0 = r305
                if (r0 == 0) goto L8e
                r0 = r305
                boolean r0 = r0.A09()     // Catch: java.lang.Throwable -> L93
                r307 = r0
                r0 = r307
                if (r0 != 0) goto L73
                goto L89
            L73:
                r0 = r302
                X.4c3 r0 = r0.A05     // Catch: java.lang.Throwable -> L93
                r308 = r0
                r0 = r308
                r1 = r305
                r2 = r306
                r0.Cip(r1, r2)     // Catch: java.lang.Throwable -> L93
                r0 = r305
                if (r0 == 0) goto L8e
            L89:
                r0 = r305
                r0.close()
            L8e:
                r0 = r302
                X.C04844c4.A01(r0)
                return
            L93:
                r308 = move-exception
                r0 = r305
                if (r0 == 0) goto L9f
                r0 = r305
                r0.close()
            L9f:
                r0 = r302
                X.C04844c4.A01(r0)
                r0 = r308
                throw r0
            La6:
                r308 = move-exception
                r0 = r302
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
                r0 = r308
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC04864c6.run():void");
        }
    };
    public final Runnable A09 = new Runnable() { // from class: X.4c7
        public static final String __redex_internal_original_name = "JobScheduler$2";

        @Override // java.lang.Runnable
        public void run() {
            C04844c4 c04844c4 = C04844c4.this;
            c04844c4.A07.execute(1OS.A02(c04844c4.A06, "JobScheduler_submitJob"));
        }
    };
    public 2Ds A03 = null;
    public int A00 = 0;
    public Integer A04 = 0S2.A00;
    public long A02 = 0;
    public long A01 = 0;

    public C04844c4(InterfaceC04834c3 interfaceC04834c3, Executor executor, int i) {
        this.A07 = executor;
        this.A05 = interfaceC04834c3;
        this.A08 = i;
    }

    private void A00(long j) {
        Runnable A02 = 1OS.A02(this.A09, "JobScheduler_enqueueJob");
        if (j <= 0) {
            A02.run();
            return;
        }
        ScheduledExecutorService scheduledExecutorService = C7hz.A00;
        if (scheduledExecutorService == null) {
            scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            C7hz.A00 = scheduledExecutorService;
        }
        scheduledExecutorService.schedule(A02, j, TimeUnit.MILLISECONDS);
    }

    public static void A01(C04844c4 c04844c4) {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (c04844c4) {
            if (c04844c4.A04 == 0S2.A0N) {
                j = Math.max(c04844c4.A01 + c04844c4.A08, uptimeMillis);
                z = true;
                c04844c4.A02 = uptimeMillis;
                c04844c4.A04 = 0S2.A01;
            } else {
                c04844c4.A04 = 0S2.A00;
                j = 0;
                z = false;
            }
        }
        if (z) {
            c04844c4.A00(j - uptimeMillis);
        }
    }

    public void A02() {
        2Ds r0;
        synchronized (this) {
            r0 = this.A03;
            this.A03 = null;
            this.A00 = 0;
        }
        if (r0 != null) {
            r0.close();
        }
    }

    public void A03() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            2Ds r0 = this.A03;
            int i = this.A00;
            if ((i & 1) == 1 || (i & 4) == 4 || (r0 != null && r0.A09())) {
                boolean z = false;
                int intValue = this.A04.intValue();
                if (intValue != 0) {
                    if (intValue == 2) {
                        this.A04 = 0S2.A0N;
                    }
                    max = 0;
                } else {
                    max = Math.max(this.A01 + this.A08, uptimeMillis);
                    this.A02 = uptimeMillis;
                    this.A04 = 0S2.A01;
                    z = true;
                }
                if (z) {
                    A00(max - uptimeMillis);
                }
            }
        }
    }

    public boolean A04(2Ds r302, int i) {
        2Ds r0;
        if ((i & 1) != 1 && (i & 4) != 4 && (r302 == null || !r302.A09())) {
            return false;
        }
        synchronized (this) {
            r0 = this.A03;
            this.A03 = r302 != null ? 2Ds.A01(r302) : null;
            this.A00 = i;
        }
        if (r0 == null) {
            return true;
        }
        r0.close();
        return true;
    }
}
