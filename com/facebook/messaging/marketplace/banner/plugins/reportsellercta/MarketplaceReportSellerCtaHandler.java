package com.facebook.messaging.marketplace.banner.plugins.reportsellercta;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.C3w;
import X.D46;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MarketplaceReportSellerCtaHandler.class */
public final class MarketplaceReportSellerCtaHandler {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Context A03;

    public MarketplaceReportSellerCtaHandler(Context context) {
        11T.A0F(context, 1);
        this.A03 = context;
        this.A00 = 1Bu.A01(context, 83524);
        this.A01 = 1Bu.A01(context, 82031);
        this.A02 = 1Bq.A00(16456);
    }

    public final void A00(Context context, ThreadKey threadKey) {
        1Br.A0D(this.A02, new D46(context, this, 3), ((C3w) 1Br.A0B(this.A00)).A00(threadKey));
    }
}
