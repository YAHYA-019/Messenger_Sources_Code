package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.zero.optin.activity.ZeroOptinInterstitialActivity;
import com.facebook.zero.protocol.results.FetchZeroInterstitialContentResult;

/* loaded from: Fsy.class */
public final class Fsy implements GIn {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ ZeroOptinInterstitialActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public Fsy(Bundle bundle, ZeroOptinInterstitialActivity zeroOptinInterstitialActivity, String str, String str2) {
        this.A01 = zeroOptinInterstitialActivity;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = bundle;
    }

    @Override // X.GIn
    public void ByP(Throwable th) {
        ZeroOptinInterstitialActivity zeroOptinInterstitialActivity = this.A01;
        CallerContext callerContext = ZeroOptinInterstitialActivity.A0h;
        ((Euj) zeroOptinInterstitialActivity.A0A.get()).A02.remove(this);
        zeroOptinInterstitialActivity.finish();
    }

    @Override // X.GIn
    public void ByQ(FetchZeroInterstitialContentResult fetchZeroInterstitialContentResult) {
        ZeroOptinInterstitialActivity zeroOptinInterstitialActivity = this.A01;
        CallerContext callerContext = ZeroOptinInterstitialActivity.A0h;
        ((Euj) zeroOptinInterstitialActivity.A0A.get()).A02.remove(this);
        String str = this.A02;
        if (1JF.A0B(str)) {
            ZeroOptinInterstitialActivity.A12(this.A00, zeroOptinInterstitialActivity, this.A03);
        } else {
            1QE valueOf = 1QE.valueOf(str);
            Fsk fsk = new Fsk(this, 2);
            C00i c00i = zeroOptinInterstitialActivity.A0e;
            DKC.A0h(c00i).A0G(fsk);
            DKC.A0h(c00i).A0I(valueOf);
        }
        1G3 r0 = (1G3) DKG.A0w().A0E.getValue();
        1Ql A0V = 1BL.A0V(zeroOptinInterstitialActivity.A07);
        A0V.CaL(1G3.A01(r0, "title_key"), fetchZeroInterstitialContentResult.mTitle);
        A0V.CaL(1G3.A01(r0, "subtitle_key"), fetchZeroInterstitialContentResult.mSubTitle);
        A0V.CaL(1G3.A01(r0, "description_text_key"), fetchZeroInterstitialContentResult.mDescriptionText);
        A0V.CaL(1G3.A01(r0, "image_url_key"), fetchZeroInterstitialContentResult.mImageUrl.toString());
        A0V.putBoolean(1G3.A01(r0, "should_use_default_image_key"), fetchZeroInterstitialContentResult.mShouldUseDefaultImage);
        A0V.CaL(1G3.A01(r0, "facepile_text_key"), fetchZeroInterstitialContentResult.mFacepileText);
        A0V.CaL(1G3.A01(r0, "terms_and_conditions_text_key"), fetchZeroInterstitialContentResult.mDetailText);
        A0V.CaL(1G3.A01(r0, "clickable_link_text_key"), fetchZeroInterstitialContentResult.mClickableLinkText);
        A0V.CaL(1G3.A01(r0, "clickable_link_url_key"), fetchZeroInterstitialContentResult.mClickableLinkUrl.toString());
        A0V.CaL(1G3.A01(r0, "primary_button_text_key"), fetchZeroInterstitialContentResult.mPrimaryButtonText);
        A0V.CaL(1G3.A01(r0, "primary_button_intent_key"), fetchZeroInterstitialContentResult.mPrimaryButtonIntentUrl);
        A0V.CaL(1G3.A01(r0, "primary_button_step_key"), fetchZeroInterstitialContentResult.mPrimaryButtonStep);
        A0V.CaL(1G3.A01(r0, "primary_button_action_key"), fetchZeroInterstitialContentResult.mPrimaryButtonAction);
        A0V.CaL(1G3.A01(r0, "secondary_button_text_key"), fetchZeroInterstitialContentResult.mSecondaryButtonText);
        A0V.CaL(1G3.A01(r0, "secondary_button_intent_key"), fetchZeroInterstitialContentResult.mSecondaryButtonIntentUrl);
        A0V.CaL(1G3.A01(r0, "secondary_button_step_key"), fetchZeroInterstitialContentResult.mSecondaryButtonStep);
        A0V.CaL(1G3.A01(r0, "secondary_button_action_key"), fetchZeroInterstitialContentResult.mSecondaryButtonAction);
        A0V.putBoolean(1G3.A01(r0, "secondary_button_override_back_only_key"), fetchZeroInterstitialContentResult.mSecondaryButtonOverrideBackOnly);
        A0V.CaL(1G3.A01(r0, "campaign_token_to_refresh_type_key"), fetchZeroInterstitialContentResult.mCampaignTokenToRefreshType);
        A0V.CaL(1G3.A01(r0, "facepile_profile_picture_urls_key"), 2Bb.A01(fetchZeroInterstitialContentResult.mProfilePictureUrls));
        A0V.commit();
        ZeroOptinInterstitialActivity.A1D(zeroOptinInterstitialActivity, ED6.A00(zeroOptinInterstitialActivity, 1BK.A0R(zeroOptinInterstitialActivity.A07)));
        ZeroOptinInterstitialActivity.A16(zeroOptinInterstitialActivity);
    }
}
