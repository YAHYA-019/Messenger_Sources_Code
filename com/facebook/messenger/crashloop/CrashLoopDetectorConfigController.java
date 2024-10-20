package com.facebook.messenger.crashloop;

import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Nq;
import X.2yD;
import X.C00i;
import X.C0k1;
import android.content.Context;

/* loaded from: CrashLoopDetectorConfigController.class */
public final class CrashLoopDetectorConfigController implements 1Nq {
    public 1BY A00;
    public final C00i A02 = new 1BQ(16385);
    public final Context A01 = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);

    public CrashLoopDetectorConfigController(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static void A00(CrashLoopDetectorConfigController crashLoopDetectorConfigController) {
        C00i c00i = crashLoopDetectorConfigController.A02;
        int Auy = (int) ((2yD) c00i.get()).Auy(36592137814540737L);
        Context context = crashLoopDetectorConfigController.A01;
        C0k1.A01(context, "instacrash_threshold", Auy);
        C0k1.A01(context, "instacrash_interval", (int) ((2yD) c00i.get()).Auy(36592137814606274L));
    }

    public int Adi() {
        return 1551;
    }

    public void BqJ(int i) {
        A00(this);
    }
}
