package com.facebook.quicklog.dataproviders;

import X.0Pz;
import X.0Xk;
import X.1BQ;
import X.1BV;
import X.1Kd;
import X.1Qb;
import X.1hM;
import X.2Lc;
import X.2Lg;
import X.C00i;
import X.C03563ye;
import X.C0k4;
import X.C2s4;
import X.C4El;
import X.C4Em;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.quicklog.dataproviders.IoStatsProvider;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: IoStatsProvider.class */
public final class IoStatsProvider extends 2Lg {
    public final C00i A00 = new 1BQ(16616);
    public final C00i A01 = new 1BV(17105);
    public final AtomicLong A02;
    public final AtomicLong A03;
    public final AtomicLong A04;

    public IoStatsProvider() {
        long j = -1;
        this.A02 = new AtomicLong(j);
        this.A04 = new AtomicLong(j);
        this.A03 = new AtomicLong(j);
    }

    public static ListenableFuture A00(final IoStatsProvider ioStatsProvider) {
        boolean z;
        ListenableFuture listenableFuture;
        C00i c00i = ioStatsProvider.A01;
        C2s4 c2s4 = (C2s4) c00i.get();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c2s4) {
            z = elapsedRealtime - c2s4.A00 < 0;
        }
        if (!z) {
            final C03563ye c03563ye = new C03563ye();
            c03563ye.A00 = Process.myTid();
            c03563ye.A07 = 0Xk.A01(0Pz.A0d("/proc/self/task/", "/stat", Process.myTid()))[2];
            return ((C2s4) c00i.get()).A01(new Callable() { // from class: X.4O9
                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ Object call() {
                    IoStatsProvider ioStatsProvider2 = ioStatsProvider;
                    C03563ye c03563ye2 = c03563ye;
                    long[] A01 = 0Xk.A01("/proc/self/stat");
                    c03563ye2.A06 = A01[0];
                    c03563ye2.A05 = A01[2];
                    0Xl A00 = 0Xm.A00();
                    c03563ye2.A01 = A00.A00;
                    c03563ye2.A03 = A00.A02;
                    c03563ye2.A04 = A00.A04;
                    long j = A00.A01;
                    c03563ye2.A02 = j;
                    ioStatsProvider2.A02.compareAndSet(-1, j);
                    long j2 = ((1Od) ioStatsProvider2.A00.get()).A0f;
                    AtomicLong atomicLong = ioStatsProvider2.A04;
                    if (atomicLong.get() != j2) {
                        atomicLong.set(j2);
                        ioStatsProvider2.A03.set(c03563ye2.A02);
                    }
                    c03563ye2.A0A = ClassLoadingStats.A00().A01();
                    c03563ye2.A09 = new 0ET();
                    c03563ye2.A08 = 0Xi.A00();
                    c03563ye2.A0B = new C0bq(C0il.A06.size());
                    return c03563ye2;
                }
            });
        }
        C2s4 c2s42 = (C2s4) c00i.get();
        synchronized (c2s42) {
            listenableFuture = c2s42.A01;
            C0k4.A00(listenableFuture);
        }
        return listenableFuture;
    }

    public /* bridge */ /* synthetic */ Object A02() {
        return A00(this);
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(final 1Qb r302, Object obj, Object obj2) {
        ListenableFuture listenableFuture = (ListenableFuture) obj;
        ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
        if (listenableFuture == null || listenableFuture2 == null || r302.A0D != null) {
            return 1hM.A01;
        }
        return 1Kd.A05(new ListenableFuture[]{listenableFuture, listenableFuture2}).A00(new C4Em(new C4El() { // from class: X.4Ek
            @Override // X.C4El
            public final void AMM(Object obj3, Object obj4) {
                0Xi A00;
                IoStatsProvider ioStatsProvider = this;
                1Qb r0 = r302;
                C03563ye c03563ye = (C03563ye) obj3;
                C03563ye c03563ye2 = (C03563ye) obj4;
                r0.AxQ().A03("ps_flt", c03563ye2.A05 - c03563ye.A05);
                if (c03563ye.A00 == c03563ye2.A00) {
                    r0.AxQ().A03("th_flt", c03563ye2.A07 - c03563ye.A07);
                }
                ClassLoadingStats.SnapshotStats snapshotStats = c03563ye.A0A;
                ClassLoadingStats.SnapshotStats snapshotStats2 = c03563ye2.A0A;
                r0.AxQ().A02("class_load_attempts", snapshotStats2.A00 - snapshotStats.A00);
                r0.AxQ().A02("dex_queries", snapshotStats2.A02 - snapshotStats.A02);
                r0.AxQ().A02("class_loads_failed", snapshotStats2.A01 - snapshotStats.A01);
                r0.AxQ().A02("locator_assists", snapshotStats2.A04 - snapshotStats.A04);
                r0.AxQ().A02("wrong_dfa_guesses", snapshotStats2.A03 - snapshotStats.A03);
                0Xi r02 = c03563ye.A08;
                if (r02 != null && (A00 = 0Xi.A00()) != null) {
                    0Xi A01 = A00.A01(r02);
                    C3o5.A0G(C3o5.A0G(C3o5.A0G(C3o5.A0G(C3o5.A0G(C3o5.A0G(r0.AxQ(), r0, "io_cancelledwb", A01.A00), r0, "io_readbytes", A01.A01), r0, "io_readchars", A01.A02), r0, "io_readsyscalls", A01.A03), r0, "io_writebytes", A01.A04), r0, "io_writechars", A01.A05).A03("io_writesyscalls", A01.A06);
                }
                C0bq c0bq = c03563ye.A0B;
                C0bq c0bq2 = c03563ye2.A0B;
                if (c0bq != null && c0bq2 != null) {
                    r0.AxQ().A02("loaded_libs", c0bq2.A00 - c0bq.A00);
                }
                long j = c03563ye.A01;
                long j2 = -1;
                if (j != j2) {
                    long j3 = c03563ye2.A01;
                    if (j3 != j2) {
                        r0.AxQ().A03("allocstall", j3 - j);
                    }
                }
                long j4 = c03563ye.A03;
                if (j4 != j2) {
                    long j5 = c03563ye2.A03;
                    if (j5 != j2) {
                        r0.AxQ().A03("pages_in", j5 - j4);
                    }
                }
                long j6 = c03563ye.A04;
                if (j6 != j2) {
                    long j7 = c03563ye2.A04;
                    if (j7 != j2) {
                        r0.AxQ().A03("pages_out", j7 - j6);
                    }
                }
                long j8 = c03563ye.A02;
                if (j8 != j2) {
                    long j9 = c03563ye2.A02;
                    if (j9 != j2) {
                        C3o5.A0G(C3o5.A0G(r0.AxQ(), r0, "pages_steals", j9 - j8), r0, "page_steals_since_cold_start", j9 - ioStatsProvider.A02.get()).A03("page_steals_since_foreground", c03563ye2.A02 - ioStatsProvider.A03.get());
                    }
                }
                r0.AxQ().A03("ps_min_flt", c03563ye2.A06 - c03563ye.A06);
                0Gn AxQ = r0.AxQ();
                if (c03563ye2.A09 != null) {
                    0HD r03 = 0HC.A00;
                    r03.A00.block();
                    j2 = r03.A03.get();
                }
                AxQ.A03("avail_disk_spc_kb", j2);
            }
        }, listenableFuture, listenableFuture2), ((C2s4) this.A01.get()).A02);
    }

    public String B5Q() {
        return "io_stats";
    }

    public int B5R() {
        return 10;
    }

    public Class BBP() {
        return Future.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }
}
