package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.39d, reason: invalid class name */
/* loaded from: 39d.class */
public final class C39d extends 2Lg {
    public /* bridge */ /* synthetic */ Object A02() {
        return new RJx();
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        RJx rJx = (RJx) obj;
        RJx rJx2 = (RJx) obj2;
        if (rJx != null && rJx2 != null) {
            r302.AxQ().A03("yoga_measure_callbacks", rJx2.A00 - rJx.A00);
            long[] jArr = rJx2.A01;
            int length = jArr.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = Long.toString(jArr[i] - rJx.A01[i]);
            }
            r302.AxQ().A06("yoga_measure_callback_reasons_count", strArr);
        }
        r302.AxQ().A02("yoga_node_count", RDW.A04);
        r302.AxQ().A02("yoga_node_count_litho", RDW.A02);
        r302.AxQ().A02("yoga_node_count_react_native_classic", RDW.A03);
        return 1hM.A01;
    }

    public String B5Q() {
        return "yoga_stats";
    }

    public int B5R() {
        return 22;
    }

    public Class BBP() {
        return RJx.class;
    }

    public boolean BS6(2Lc r302) {
        return r302.A0A;
    }
}
