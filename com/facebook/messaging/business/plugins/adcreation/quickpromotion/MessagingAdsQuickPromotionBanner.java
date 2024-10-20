package com.facebook.messaging.business.plugins.adcreation.quickpromotion;

import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Ql;
import X.2Ws;
import X.3E6;
import X.3OP;
import X.C2bv;
import android.content.Context;

/* loaded from: MessagingAdsQuickPromotionBanner.class */
public final class MessagingAdsQuickPromotionBanner {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2Ws A05;

    public MessagingAdsQuickPromotionBanner(Context context, 2Ws r303) {
        1BL.A1F(context, r303);
        this.A00 = context;
        this.A05 = r303;
        this.A01 = 1Bu.A00(66596);
        this.A04 = 1Bu.A00(68279);
        this.A02 = 1BK.A0E();
        this.A03 = 1Bu.A01(context, 99777);
    }

    public static final void A00(MessagingAdsQuickPromotionBanner messagingAdsQuickPromotionBanner) {
        ((3OP) 1Br.A0B(messagingAdsQuickPromotionBanner.A04)).A00(3E6.A02);
        1Ql.A01(1Br.A08(messagingAdsQuickPromotionBanner.A02).putBoolean(C2bv.A0H, true), C2bv.A0Z, false);
    }
}
