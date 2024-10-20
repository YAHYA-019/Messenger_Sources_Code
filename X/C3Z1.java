package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.jsi.module.JsiHeapInfo;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.3Z1, reason: invalid class name */
/* loaded from: 3Z1.class */
public final class C3Z1 implements 0Cq {
    public final C00i A00 = 1BQ.A02(67691);
    public final boolean A01 = !((2N5) 1Bi.A03(66828)).A00.AZk(36310418027905243L);

    public /* bridge */ /* synthetic */ Collection getDataPoints() {
        ArrayList A0t = AnonymousClass001.A0t(3);
        JsiHeapInfo A00 = ((C3No) this.A00.get()).A00();
        long stat = A00.getStat("allocatedBytes", "*");
        if (stat > 0) {
            1BL.A14(0Cu.A0T, A0t, stat / 1024);
        }
        long stat2 = A00.getStat("heapSize", "*") + A00.getStat("blockBytes", "*");
        if (stat2 > 0) {
            1BL.A14(0Cu.A0U, A0t, stat2 / 1024);
        }
        long stat3 = A00.getStat("mallocSizeEstimate", "*") + A00.getStat("mallocBytes", "*");
        if (stat3 > 0) {
            1BL.A14(0Cu.A0V, A0t, stat3 / 1024);
        }
        long stat4 = A00.getStat("va", "*");
        if (stat4 > 0) {
            1BL.A14(0Cu.A0S, A0t, stat4 / 1024);
        }
        return A0t;
    }

    public /* synthetic */ java.util.Map getIndexedDataPoints() {
        return null;
    }

    public boolean shouldCollectMetrics(int i) {
        return AnonymousClass001.A1N(i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
    }

    public /* synthetic */ boolean shouldCollectMetrics(int i, 0M7 r303) {
        return 0M8.A00(r303, this, i);
    }

    public /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }
}
