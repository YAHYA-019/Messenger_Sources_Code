package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.business.bmcconsiderationgrowth.conversationfeedback.plugins.threadview.ondemandthreadviewbanner.ThreadViewOnDemandBannerImplementation;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: Fp4.class */
public final class Fp4 implements AYY {
    public final /* synthetic */ ThreadViewOnDemandBannerImplementation A00;
    public final /* synthetic */ 7OX A01;
    public final /* synthetic */ 1CO A02;

    public Fp4(ThreadViewOnDemandBannerImplementation threadViewOnDemandBannerImplementation, 7OX r303, 1CO r304) {
        this.A00 = threadViewOnDemandBannerImplementation;
        this.A02 = r304;
        this.A01 = r303;
    }

    public void Bo0(QuickPromotionDefinition quickPromotionDefinition) {
        String str;
        String str2;
        ThreadViewOnDemandBannerImplementation threadViewOnDemandBannerImplementation = this.A00;
        if (threadViewOnDemandBannerImplementation.A01 && quickPromotionDefinition != null && this.A02.AZk(36321705198764734L)) {
            7OX r0 = this.A01;
            6JO r02 = (6JO) 1Br.A0B(threadViewOnDemandBannerImplementation.A04);
            QuickPromotionDefinition.Creative A02 = quickPromotionDefinition.A02();
            InterstitialTrigger interstitialTrigger = ThreadViewOnDemandBannerImplementation.A07;
            if (interstitialTrigger != null) {
                FHL A00 = r02.A00(interstitialTrigger, A02, quickPromotionDefinition, "11298");
                9RY r313 = null;
                9RY r314 = null;
                C1pq.A08("updateHandler", r0);
                String str3 = quickPromotionDefinition.title;
                String str4 = quickPromotionDefinition.content;
                QuickPromotionDefinition.ImageParameters imageParameters = quickPromotionDefinition.imageParams;
                String str5 = imageParameters != null ? imageParameters.uri : null;
                Cuw cuw = new Cuw(0, threadViewOnDemandBannerImplementation, r0, A00);
                QuickPromotionDefinition.Action action = quickPromotionDefinition.primaryAction;
                if (action != null && (str2 = action.title) != null && str2.length() != 0) {
                    r314 = FXt.A00(str2, r0, A00, threadViewOnDemandBannerImplementation, 15);
                }
                QuickPromotionDefinition.Action action2 = quickPromotionDefinition.secondaryAction;
                if (action2 != null && (str = action2.title) != null && str.length() != 0) {
                    r313 = FXt.A00(str, r0, A00, threadViewOnDemandBannerImplementation, 16);
                }
                if ((!ThreadViewOnDemandBannerImplementation.A06.equals(quickPromotionDefinition.promotionId)) && !ThreadViewOnDemandBannerImplementation.A09) {
                    11T.A0D(A00);
                    if (ThreadViewOnDemandBannerImplementation.A07 != null) {
                        9Cz.A00((9NP) null, quickPromotionDefinition, A00);
                    }
                }
                ThreadViewOnDemandBannerImplementation.A06 = quickPromotionDefinition.promotionId;
                InterstitialTrigger interstitialTrigger2 = ThreadViewOnDemandBannerImplementation.A07;
                if (interstitialTrigger2 != null) {
                    ThreadViewOnDemandBannerImplementation.A08 = interstitialTrigger2.A01;
                    ThreadViewOnDemandBannerImplementation.A09 = true;
                    r0.CXr(new 6Kw(r0, cuw, r313, r314, (Boolean) null, str4, str5, str3));
                    return;
                }
            }
            11T.A0L("interstitialTrigger");
            throw 0Q8.createAndThrow();
        }
    }
}
