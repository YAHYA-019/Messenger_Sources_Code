package com.facebook.messaging.nativepagereply.plugins.highmessagespersecond.quickpromotion;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2PP;
import X.2PX;
import X.2Ps;
import X.2Ws;
import X.3Jg;
import X.C3RI;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: HMPSQuickPromotionBanner.class */
public final class HMPSQuickPromotionBanner {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 2Ws A03;
    public final 3Jg A04;
    public final FbUserSession A05;

    public HMPSQuickPromotionBanner(Context context, FbUserSession fbUserSession, 2Ws r304) {
        1BL.A1H(context, fbUserSession, r304);
        this.A00 = context;
        this.A05 = fbUserSession;
        this.A03 = r304;
        this.A04 = new 3Jg(this);
        this.A01 = 1Lm.A00(context, fbUserSession, 114842);
        this.A02 = 1Bu.A01(context, 68142);
    }

    public static final void A00(HMPSQuickPromotionBanner hMPSQuickPromotionBanner) {
        2PP r0;
        1Br r02 = hMPSQuickPromotionBanner.A01;
        if (((C3RI) 1Br.A0B(r02)).A03) {
            C3RI c3ri = (C3RI) 1Br.A0B(r02);
            c3ri.A02 = false;
            2Ps r03 = c3ri.A00;
            if (r03 != null && (r0 = ((2PX) r03).A00) != null) {
                r0.A04(r03);
            }
            hMPSQuickPromotionBanner.A03.Ch8("high_messages_per_second_quick_promotion_banner");
        }
    }
}
