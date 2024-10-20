package com.facebook.messaging.business.plugins.p2bdifferentiation.secondarydata;

import X.1Br;
import X.1Bu;
import X.6iB;
import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: P2BDifferentiationDataLoad.class */
public final class P2BDifferentiationDataLoad {
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final 6iB A03;

    public P2BDifferentiationDataLoad(Context context, ThreadKey threadKey, 6iB r304) {
        7zR.A1N(context, r304);
        this.A00 = context;
        this.A02 = threadKey;
        this.A03 = r304;
        this.A01 = 1Bu.A01(context, 84978);
    }
}
