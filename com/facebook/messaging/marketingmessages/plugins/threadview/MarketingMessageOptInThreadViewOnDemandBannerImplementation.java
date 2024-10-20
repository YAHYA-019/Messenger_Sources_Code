package com.facebook.messaging.marketingmessages.plugins.threadview;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: MarketingMessageOptInThreadViewOnDemandBannerImplementation.class */
public final class MarketingMessageOptInThreadViewOnDemandBannerImplementation {
    public int A00;
    public QuickPromotionDefinition A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final FbUserSession A05;

    public MarketingMessageOptInThreadViewOnDemandBannerImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A04 = context;
        this.A05 = fbUserSession;
    }
}
