package com.facebook.quickpromotion.event;

import X.0S2;
import X.11T;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Hv;
import X.1I7;
import X.1PA;
import android.content.Context;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;

/* loaded from: QuickPromotionEventManager.class */
public final class QuickPromotionEventManager {
    public long A00;
    public 1PA A01;
    public Integer A02;
    public final 1I7 A03;
    public final FbNetworkManager A04;
    public final 1Br A05;
    public final Context A06;

    public QuickPromotionEventManager() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A06 = A00;
        this.A03 = (1I7) 1Hv.A02(A00, 65728);
        this.A04 = (FbNetworkManager) 1Bi.A03(16687);
        this.A05 = 1Bq.A00(99390);
        this.A02 = 0S2.A00;
    }
}
