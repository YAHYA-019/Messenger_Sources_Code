package com.facebook.zero.easydogfooding;

import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1G2;
import X.1HG;
import X.1HN;
import X.1Ky;
import X.1P9;
import X.1PA;
import X.Frp;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: ZeroEasyDogfoodController.class */
public final class ZeroEasyDogfoodController implements 1HN {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;
    public final 1PA A03;

    public ZeroEasyDogfoodController() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A02 = A00;
        1Br A002 = 1HG.A00(A00, 65728);
        this.A01 = A002;
        this.A03 = 1P9.A01(1P9.A00(A002.A00), new Frp(this, 17), "com.facebook.zero.ZERO_RATING_STATE_CHANGED");
        this.A00 = 1BK.A0E();
        1Br.A09(this.A00).CcV(this, (1G2) ((1Ky) 1Bn.A0A(98565)).A0I.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Throwable, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.zero.easydogfooding.ZeroEasyDogfoodController r301) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.easydogfooding.ZeroEasyDogfoodController.A00(com.facebook.zero.easydogfooding.ZeroEasyDogfoodController):void");
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        A00(this);
    }
}
