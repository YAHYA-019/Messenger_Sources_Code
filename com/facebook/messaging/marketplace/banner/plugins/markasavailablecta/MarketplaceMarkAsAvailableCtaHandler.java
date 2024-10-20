package com.facebook.messaging.marketplace.banner.plugins.markasavailablecta;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.7gY;
import X.A00;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MarketplaceMarkAsAvailableCtaHandler.class */
public final class MarketplaceMarkAsAvailableCtaHandler {
    public final 1Br A00;
    public final Context A01;
    public final FbUserSession A02;

    public MarketplaceMarkAsAvailableCtaHandler(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A00 = 1Bu.A00(147577);
    }

    public final void A00(Long l) {
        if (l != null) {
            long longValue = l.longValue();
            1Br.A0C(this.A00);
            ((7gY) 1Br.A0B(1Lm.A00(this.A01, this.A02, 68289))).A00(new A00(0), longValue);
        }
    }
}
