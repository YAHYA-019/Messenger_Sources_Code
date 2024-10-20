package com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner;

import X.11T;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.2S4;
import X.2Ws;
import X.2Wv;
import X.2vS;
import X.6JP;
import X.AnonymousClass001;
import android.content.Context;
import android.os.Looper;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ChannelListServerPromotionBannerImplementation.class */
public final class ChannelListServerPromotionBannerImplementation {
    public InterstitialTrigger A00;
    public InterstitialTriggerContext A01;
    public 2vS A02;
    public QuickPromotionDefinition A03;
    public QuickPromotionDefinition A04;
    public final Context A05;
    public final 2S4 A06;
    public final 1Br A07;
    public final 2Ws A08;
    public final 2Wv A09;
    public final ParcelableSecondaryData A0A;
    public final FbUserSession A0B;

    public ChannelListServerPromotionBannerImplementation(Context context, FbUserSession fbUserSession, 2S4 r304, 2Ws r305, 2Wv r306, ParcelableSecondaryData parcelableSecondaryData) {
        1BL.A11(1, r305, r304, context);
        11T.A0F(fbUserSession, 5);
        this.A08 = r305;
        this.A09 = r306;
        this.A06 = r304;
        this.A05 = context;
        this.A0B = fbUserSession;
        this.A0A = parcelableSecondaryData;
        this.A07 = 1Bq.A00(66481);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Throwable, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(android.content.Context r301, com.facebook.interstitial.triggers.InterstitialTrigger r302, com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation r303) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation.A00(android.content.Context, com.facebook.interstitial.triggers.InterstitialTrigger, com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation):void");
    }

    public static final void A01(ChannelListServerPromotionBannerImplementation channelListServerPromotionBannerImplementation, 2vS r302) {
        QuickPromotionDefinition A00;
        if (!11T.A0O(Looper.myLooper(), Looper.getMainLooper())) {
            throw AnonymousClass001.A0N("Must run on UI thread!");
        }
        Object A0A = 1Bn.A0A(67788);
        Context context = channelListServerPromotionBannerImplementation.A05;
        11T.A0F(A0A, 1);
        if (r302 == null || (A00 = 6JP.A00(context, r302)) == null) {
            return;
        }
        channelListServerPromotionBannerImplementation.A03 = A00;
        channelListServerPromotionBannerImplementation.A02 = r302;
        channelListServerPromotionBannerImplementation.A08.Ch8("cm_channel_list_server_banner");
    }
}
