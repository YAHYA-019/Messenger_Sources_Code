package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Kyv.class */
public abstract class Kyv {
    public static final Runnable A00;
    public static final Runnable A01;
    public static final C01i A06;
    public static final AtomicInteger A05 = GOn.A1K(0);
    public static final AtomicInteger A04 = GOn.A1K(0);
    public static final AtomicInteger A03 = GOn.A1K(0);
    public static final ConcurrentHashMap A02 = JQx.A13();

    static {
        C01h A012 = C01g.A01(M2U.A00);
        A06 = A012;
        Runnable runnable = LrL.A00;
        A00 = runnable;
        Runnable runnable2 = LrM.A00;
        A01 = runnable2;
        ((Handler) A012.getValue()).post(runnable);
        ((Handler) A06.getValue()).post(runnable2);
    }

    public static final void A00(KhI khI, int i) {
        int i2 = khI.A00;
        float f = i2 * 0.5f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        LW0 lw0 = khI.A01;
        int i3 = lw0.A00;
        int A022 = 07C.A02(i3 + i, (int) f, i2);
        if (A022 == i3 || A022 == lw0.A00) {
            return;
        }
        lw0.A00 = 07C.A02(A022, 1, lw0.A04);
        LW0.A00(lw0).A02(lw0.A00);
    }
}
