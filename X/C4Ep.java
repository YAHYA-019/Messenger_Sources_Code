package X;

import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;

/* renamed from: X.4Ep, reason: invalid class name */
/* loaded from: 4Ep.class */
public final class C4Ep {
    public final FbNetworkManager A00;
    public final 1I7 A01;

    public C4Ep() {
        1I7 r0 = (1I7) 1Hv.A02(FbInjector.A00(), 65728);
        FbNetworkManager fbNetworkManager = (FbNetworkManager) 1Bi.A03(16687);
        this.A01 = r0;
        this.A00 = fbNetworkManager;
    }

    public 1PA A00(Runnable runnable) {
        1P9 r0 = new 1P9(this.A01);
        r0.A05(new C4Om(this, runnable, 0), "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
        1PA A02 = r0.A02();
        A02.A00();
        return A02;
    }
}
