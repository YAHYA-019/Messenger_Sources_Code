package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.4QR, reason: invalid class name */
/* loaded from: 4QR.class */
public final class C4QR extends 2Lg {
    public /* bridge */ /* synthetic */ Object A02() {
        int[] A0n;
        45R A00 = 45R.A00();
        synchronized (A00) {
            A0n = 0QD.A0n(A00.A01);
        }
        return A0n;
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            r302.AxQ().A06("active_ttrc_markers_at_start", obj);
            r302.AxQ().A06("active_ttrc_markers_at_stop", obj2);
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "active_ttrc_markers";
    }

    public int B5R() {
        return 30;
    }

    public Class BBP() {
        return int[].class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }
}
