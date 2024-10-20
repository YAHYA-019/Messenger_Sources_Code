package X;

import android.net.TrafficStats;
import com.facebook.device.resourcemonitor.DataUsageBytes;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* renamed from: X.4QS, reason: invalid class name */
/* loaded from: 4QS.class */
public final class C4QS extends 2Lg implements Callable {
    public static final Object A02 = ListenableFuture.class;
    public final C00i A00 = new 1BV(17105);
    public final C07974lf A01 = (C07974lf) 1Bi.A03(49228);

    public /* bridge */ /* synthetic */ Object A02() {
        return ((C2s4) this.A00.get()).A01(this);
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(final 1Qb r302, Object obj, Object obj2) {
        ListenableFuture listenableFuture = (ListenableFuture) obj;
        ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
        return (listenableFuture == null || listenableFuture2 == null) ? 1hM.A01 : 1Kd.A05(new ListenableFuture[]{listenableFuture, listenableFuture2}).A00(new C4Em(new C4El() { // from class: X.4W5
            @Override // X.C4El
            public final void AMM(Object obj3, Object obj4) {
                1Qb r0 = r302;
                DataUsageBytes dataUsageBytes = (DataUsageBytes) obj3;
                DataUsageBytes dataUsageBytes2 = (DataUsageBytes) obj4;
                long j = dataUsageBytes2.A00 - dataUsageBytes.A00;
                C3o5.A0G(r0.AxQ(), r0, "bytes_received", j).A03("bytes_transmitted", dataUsageBytes2.A01 - dataUsageBytes.A01);
            }
        }, listenableFuture, listenableFuture2), ((C2s4) this.A00.get()).A02);
    }

    public String B5Q() {
        return "data_usage";
    }

    public int B5R() {
        return 11;
    }

    public Class BBP() {
        return ListenableFuture.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        long j;
        long j2;
        try {
            j = TrafficStats.getTotalRxBytes();
        } catch (RuntimeException e) {
            C07974lf.A00(e);
            j = 0;
        }
        try {
            j2 = TrafficStats.getTotalTxBytes();
        } catch (RuntimeException e2) {
            C07974lf.A00(e2);
            j2 = 0;
        }
        return new DataUsageBytes(j, j2);
    }
}
