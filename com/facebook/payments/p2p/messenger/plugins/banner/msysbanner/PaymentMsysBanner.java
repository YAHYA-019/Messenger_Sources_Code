package com.facebook.payments.p2p.messenger.plugins.banner.msysbanner;

import X.11T;
import X.1Br;
import X.1HG;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PaymentMsysBanner.class */
public final class PaymentMsysBanner {
    public final 1Br A00;
    public final ThreadKey A01;
    public final Context A02;

    public PaymentMsysBanner(Context context, ThreadKey threadKey) {
        11T.A0F(context, 1);
        11T.A0F(threadKey, 2);
        this.A02 = context;
        this.A01 = threadKey;
        this.A00 = 1HG.A00(context, 82515);
    }
}
