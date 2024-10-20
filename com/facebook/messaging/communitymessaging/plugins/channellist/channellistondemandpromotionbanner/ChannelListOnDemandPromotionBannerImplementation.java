package com.facebook.messaging.communitymessaging.plugins.channellist.channellistondemandpromotionbanner;

import X.2Ws;
import X.2Wv;
import X.7zT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ChannelListOnDemandPromotionBannerImplementation.class */
public final class ChannelListOnDemandPromotionBannerImplementation {
    public static InterstitialTrigger A05;
    public static InterstitialTriggerContext A06;
    public static QuickPromotionDefinition A07;
    public static QuickPromotionDefinition A08;
    public final Context A00;
    public final FbUserSession A01;
    public final 2Ws A02;
    public final 2Wv A03;
    public final ParcelableSecondaryData A04;

    public ChannelListOnDemandPromotionBannerImplementation(Context context, FbUserSession fbUserSession, 2Ws r304, 2Wv r305, ParcelableSecondaryData parcelableSecondaryData) {
        7zT.A1T(context, fbUserSession, r304);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = r305;
        this.A02 = r304;
        this.A04 = parcelableSecondaryData;
    }
}
