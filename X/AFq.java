package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation;

/* loaded from: AFq.class */
public final class AFq implements Runnable {
    public static final String __redex_internal_original_name = "ChannelListServerPromotionBannerImplementation$requestShowQP$2";
    public final /* synthetic */ 1GU A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ ChannelListServerPromotionBannerImplementation A02;

    public AFq(1GU r302, 1Br r303, ChannelListServerPromotionBannerImplementation channelListServerPromotionBannerImplementation) {
        this.A02 = channelListServerPromotionBannerImplementation;
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChannelListServerPromotionBannerImplementation channelListServerPromotionBannerImplementation = this.A02;
        InterstitialTrigger interstitialTrigger = channelListServerPromotionBannerImplementation.A00;
        if (interstitialTrigger == null) {
            11T.A0L("interstitialTrigger");
            throw 0Q8.createAndThrow();
        }
        this.A00.Ciz(new AEW(channelListServerPromotionBannerImplementation, 9Bb.A00((C2t1) 1Br.A0B(this.A01), interstitialTrigger)));
    }
}
