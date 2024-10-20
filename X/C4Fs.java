package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: X.4Fs, reason: invalid class name */
/* loaded from: 4Fs.class */
public final class C4Fs extends 2Lg implements Callable {
    public static boolean A01 = true;
    public static final String[] A02 = {"Rss:", "Pss:", "Shared_Clean:", "Shared_Dirty:", "Private_Clean:", "Private_Dirty:", "Anonymous:", "Swap:", "SwapPss:"};
    public static final String[] A03 = {"VmRSS:", "RssAnon:", "VmSwap:"};
    public static final Object A04 = Future.class;
    public final C00i A00 = new 1BV(17105);

    public /* bridge */ /* synthetic */ Object A02() {
        return ((C2s4) this.A00.get()).A01(this);
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(final 1Qb r302, Object obj, Object obj2) {
        return r302.A0D != null ? 1hM.A01 : ((C2s4) this.A00.get()).A00(new 5rG() { // from class: X.4W6
            public final void AMM(Object obj3, Object obj4) {
                1Qb r0 = r302;
                C4Ft c4Ft = (C4Ft) obj3;
                C4Ft c4Ft2 = (C4Ft) obj4;
                if (c4Ft != null) {
                    C3o5.A0G(C3o5.A0G(C3o5.A0G(C3o5.A0G(r0.AxQ(), r0, "pss_at_start", c4Ft.A03), r0, "rss_at_start", c4Ft.A04), r0, "anonymous_rss_at_start", c4Ft.A00), r0, "dirty_pss_at_start", c4Ft.A01).A03("private_dirty_at_start", c4Ft.A02);
                }
                if (c4Ft2 != null) {
                    C3o5.A0G(C3o5.A0G(C3o5.A0G(C3o5.A0G(r0.AxQ(), r0, "pss_used", c4Ft2.A03), r0, "rss_used", c4Ft2.A04), r0, "anonymous_rss_used", c4Ft2.A00), r0, "dirty_pss_used", c4Ft2.A01).A03("private_dirty_used", c4Ft2.A02);
                }
            }
        }, (ListenableFuture) obj, (ListenableFuture) obj2);
    }

    public String B5Q() {
        return "detailed_memory_stats";
    }

    public int B5R() {
        return 14;
    }

    public Class BBP() {
        return Future.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        C4Ft c4Ft = new C4Ft();
        if (A01) {
            long[] jArr = new long[9];
            if (C0dl.A02("/proc/self/smaps_rollup", jArr, A02)) {
                long j = jArr[5];
                if (j != 0 || jArr[0] != 0) {
                    long j2 = jArr[0];
                    long j3 = jArr[7];
                    c4Ft.A04 = j2 + j3;
                    c4Ft.A03 = jArr[1] + jArr[8];
                    c4Ft.A00 = jArr[6] + j3;
                    long j4 = jArr[2];
                    c4Ft.A01 = (long) (j + (jArr[3] * ((r0 - (jArr[4] + j)) / (j4 + r0))));
                    c4Ft.A02 = j;
                    return c4Ft;
                }
            }
        }
        A01 = false;
        long[] jArr2 = new long[3];
        if (C0dl.A02("/proc/self/status", jArr2, A03)) {
            long j5 = jArr2[0];
            long j6 = jArr2[2];
            c4Ft.A04 = j5 + j6;
            long j7 = jArr2[1];
            if (j7 != 0) {
                c4Ft.A00 = j7 + j6;
            }
        }
        return c4Ft;
    }
}
