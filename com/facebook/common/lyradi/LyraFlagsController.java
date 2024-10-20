package com.facebook.common.lyradi;

import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1GD;
import X.1Nq;
import X.2yD;
import X.C00i;
import X.C0k1;
import android.content.Context;

/* loaded from: LyraFlagsController.class */
public final class LyraFlagsController implements 1Nq {
    public 1BY A00;
    public final C00i A02 = new 1BQ(16385);
    public final Context A01 = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);

    public LyraFlagsController(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static void A00(LyraFlagsController lyraFlagsController) {
        C00i c00i = lyraFlagsController.A02;
        2yD r0 = (2yD) c00i.get();
        1GD r02 = 1GD.A05;
        boolean AZr = r0.AZr(r02, 36312161781420166L);
        Context context = lyraFlagsController.A01;
        C0k1.A01(context, "android_crash_lyra_hook_cxa_throw", AZr ? 1 : 0);
        C0k1.A01(context, "android_crash_lyra_enable_backtraces", ((2yD) c00i.get()).AZr(r02, 36312161781354629L) ? 1 : 0);
    }

    public int Adi() {
        return 14606;
    }

    public void BqJ(int i) {
        A00(this);
    }
}
