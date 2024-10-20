package com.facebook.messaging.marketplace.banner.plugins.marksoldwithtxnsurveyscaledcta;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.7gY;
import X.A00;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MarketplaceMarkAsSoldWithTxnSurveyScaledCtaHandler.class */
public final class MarketplaceMarkAsSoldWithTxnSurveyScaledCtaHandler {
    public final 1Br A00;
    public final Context A01;
    public final FbUserSession A02;

    public MarketplaceMarkAsSoldWithTxnSurveyScaledCtaHandler(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A00 = 1Bu.A00(147577);
    }

    public final void A00(Context context, Long l) {
        1Br.A0C(this.A00);
        1Br A00 = 1Lm.A00(context, this.A02, 68289);
        if (l != null) {
            ((7gY) 1Br.A0B(A00)).A00(new A00(0), l.longValue());
        }
    }
}
