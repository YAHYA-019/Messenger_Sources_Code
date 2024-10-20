package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.marketingmessages.plugins.threadview.MarketingMessageOptInThreadViewOnDemandBannerImplementation;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: Fp6.class */
public final class Fp6 implements AYY {
    public final /* synthetic */ InterstitialTrigger A00;
    public final /* synthetic */ DM8 A01;
    public final /* synthetic */ MarketingMessageOptInThreadViewOnDemandBannerImplementation A02;
    public final /* synthetic */ 7OX A03;
    public final /* synthetic */ String A04;

    public Fp6(InterstitialTrigger interstitialTrigger, DM8 dm8, MarketingMessageOptInThreadViewOnDemandBannerImplementation marketingMessageOptInThreadViewOnDemandBannerImplementation, 7OX r305, String str) {
        this.A02 = marketingMessageOptInThreadViewOnDemandBannerImplementation;
        this.A03 = r305;
        this.A00 = interstitialTrigger;
        this.A04 = str;
        this.A01 = dm8;
    }

    public void Bo0(QuickPromotionDefinition quickPromotionDefinition) {
        String str;
        String str2;
        MarketingMessageOptInThreadViewOnDemandBannerImplementation marketingMessageOptInThreadViewOnDemandBannerImplementation = this.A02;
        if (!marketingMessageOptInThreadViewOnDemandBannerImplementation.A03 || quickPromotionDefinition == null) {
            return;
        }
        7OX r0 = this.A03;
        InterstitialTrigger interstitialTrigger = this.A00;
        String str3 = this.A04;
        DM8 dm8 = this.A01;
        FHL A00 = ((6JO) 1Bu.A06(marketingMessageOptInThreadViewOnDemandBannerImplementation.A04, 50062)).A00(interstitialTrigger, quickPromotionDefinition.A02(), quickPromotionDefinition, "11298");
        9RY r314 = null;
        9RY r315 = null;
        C1pq.A08("updateHandler", r0);
        String str4 = quickPromotionDefinition.title;
        String str5 = quickPromotionDefinition.content;
        QuickPromotionDefinition.ImageParameters imageParameters = quickPromotionDefinition.imageParams;
        String str6 = imageParameters != null ? imageParameters.uri : null;
        Cuw cuw = new Cuw(2, marketingMessageOptInThreadViewOnDemandBannerImplementation, r0, A00);
        QuickPromotionDefinition.Action action = quickPromotionDefinition.primaryAction;
        if (action != null && (str2 = action.title) != null && str2.length() != 0) {
            r315 = new 9RY(new CZ1(dm8, marketingMessageOptInThreadViewOnDemandBannerImplementation, r0, A00, str3, 1), AnonymousClass954.SECONDARY, str2);
        }
        QuickPromotionDefinition.Action action2 = quickPromotionDefinition.secondaryAction;
        if (action2 != null && (str = action2.title) != null && str.length() != 0) {
            r314 = FXt.A00(str, r0, A00, marketingMessageOptInThreadViewOnDemandBannerImplementation, 23);
        }
        if (!quickPromotionDefinition.equals(marketingMessageOptInThreadViewOnDemandBannerImplementation.A01) && !marketingMessageOptInThreadViewOnDemandBannerImplementation.A02) {
            11T.A0D(A00);
            9Cz.A00((9NP) null, quickPromotionDefinition, A00);
        }
        marketingMessageOptInThreadViewOnDemandBannerImplementation.A01 = quickPromotionDefinition;
        marketingMessageOptInThreadViewOnDemandBannerImplementation.A02 = true;
        r0.CXr(new 6Kw(r0, cuw, r314, r315, (Boolean) null, str5, str6, str4));
    }
}
