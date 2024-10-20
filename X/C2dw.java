package X;

import android.content.Context;

/* renamed from: X.2dw, reason: invalid class name */
/* loaded from: 2dw.class */
public final class C2dw {
    public 1PA A00;
    public final 1Br A01;
    public final Context A02;
    public final 1De A03;

    public C2dw(1De r302) {
        this.A03 = r302;
        Context context = (Context) 1Bn.A0E((Context) null, r302.A00, 83719);
        this.A02 = context;
        this.A01 = 1HG.A00(context, 65728);
    }

    public final void A00() {
        0fH.A0j("ActiveNowUserControlBroadcastReceiverManager", "unregister");
        1PA r0 = this.A00;
        if (r0 != null && r0.A03()) {
            r0.A01();
        }
        this.A00 = null;
    }

    public final void A01(2TW r302) {
        11T.A0F(r302, 0);
        0fH.A0j("ActiveNowUserControlBroadcastReceiverManager", "register");
        if (this.A00 != null) {
            A00();
        }
        3cG r0 = new 3cG(r302, 17);
        1P9 r02 = new 1P9((1I7) this.A01.A00.get());
        r02.A05(r0, "com.facebook.orca.ACTION_USER_CONTROLS_HIDE_CONTACT_SUCCEEDED");
        1PA A02 = r02.A02();
        this.A00 = A02;
        A02.A00();
    }
}
