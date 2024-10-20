package com.facebook.zero.zerobalance;

import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1EZ;
import X.1Fw;
import X.1G2;
import X.1Ky;
import X.1Ql;
import X.2Bs;
import X.2C1;
import X.2yD;
import X.C00i;
import X.C0dp;
import X.ExH;
import X.FuT;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: ZeroBalanceResultForPreFetchRecommendationsController.class */
public final class ZeroBalanceResultForPreFetchRecommendationsController implements 2Bs {
    public final C00i A01 = new 1BQ(16385);
    public final C00i A00 = new 1BV(68126);
    public final C00i A02 = new 1BQ(99390);
    public final C00i A03 = new 1BQ(33013);
    public final C00i A04 = new 1BV(98457);

    public static void A00(ZeroBalanceResultForPreFetchRecommendationsController zeroBalanceResultForPreFetchRecommendationsController, int i) {
        long now = ((C0dp) zeroBalanceResultForPreFetchRecommendationsController.A02.get()).now();
        1Ql edit = ((FbSharedPreferences) zeroBalanceResultForPreFetchRecommendationsController.A03.get()).edit();
        edit.CaH((1G2) ((1Ky) 1Bn.A0A(98565)).A0d.getValue(), now);
        edit.CaE((1G2) ((1Ky) 1Bn.A0A(98565)).A0c.getValue(), i);
        edit.commit();
    }

    public static void A01(ZeroBalanceResultForPreFetchRecommendationsController zeroBalanceResultForPreFetchRecommendationsController, String str) {
        ((ExH) zeroBalanceResultForPreFetchRecommendationsController.A04.get()).A01(1Fw.A04((1EZ) 1Bn.A0E(FbInjector.A00(), (1BY) null, 16428)), new FuT(zeroBalanceResultForPreFetchRecommendationsController, str), "prefetch_recommendations");
    }

    public static boolean A02(ZeroBalanceResultForPreFetchRecommendationsController zeroBalanceResultForPreFetchRecommendationsController) {
        boolean z = false;
        if (((C0dp) zeroBalanceResultForPreFetchRecommendationsController.A02.get()).now() < ((FbSharedPreferences) zeroBalanceResultForPreFetchRecommendationsController.A03.get()).Av1((1G2) ((1Ky) 1Bn.A0A(98565)).A0d.getValue(), Long.MIN_VALUE) + (((FbSharedPreferences) r0.get()).ArU((1G2) ((1Ky) 1Bn.A0A(98565)).A0c.getValue(), 0) * 1000)) {
            z = true;
        }
        return z;
    }

    public void onDetectionFinished(2C1 r302, String str, Context context) {
        boolean equals = r302.equals(2C1.A03);
        boolean AZk = ((2yD) this.A01.get()).AZk(36322254954448131L);
        boolean A02 = A02(this);
        if (equals || !AZk || A02) {
            return;
        }
        A01(this, "ZERO_BALANCE_DETECTED");
    }
}
