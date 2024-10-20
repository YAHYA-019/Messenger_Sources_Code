package X;

import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.39c, reason: invalid class name */
/* loaded from: 39c.class */
public final class C39c extends 2Lg {
    public /* bridge */ /* synthetic */ Object A02() {
        RNA rna = new RNA();
        String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
        if (runtimeStat != null) {
            rna.A01 = Integer.parseInt(runtimeStat);
        }
        if (Debug.getRuntimeStat("art.gc.gc-time") != null) {
            rna.A03 = Integer.parseInt(r0);
        }
        String runtimeStat2 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
        if (runtimeStat2 != null) {
            rna.A00 = Integer.parseInt(runtimeStat2);
        }
        if (Debug.getRuntimeStat("art.gc.blocking-gc-time") != null) {
            rna.A02 = Integer.parseInt(r0);
        }
        return rna;
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        RNA rna = (RNA) obj;
        RNA rna2 = (RNA) obj2;
        if (rna != null && rna2 != null) {
            r302.AxQ().A02("gc_count", rna2.A01 - rna.A01);
            r302.AxQ().A03("gc_time_ms", rna2.A03 - rna.A03);
            r302.AxQ().A02(AnonymousClass000.A00(96), rna2.A00 - rna.A00);
            r302.AxQ().A03("blocking_gc_time_ms", rna2.A02 - rna.A02);
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "runtime_stats";
    }

    public int B5R() {
        return 38;
    }

    public Class BBP() {
        return RNA.class;
    }

    public boolean BS6(2Lc r302) {
        return false;
    }
}
