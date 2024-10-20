package com.facebook.zero.protocol.results;

import X.4YU;
import X.4YV;
import X.AnonymousClass001;
import X.C0A2;
import X.DKF;
import X.FKb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: FetchZeroInterstitialContentResult.class */
public class FetchZeroInterstitialContentResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(83);
    public final String mCampaignTokenToRefreshType;
    public final String mClickableLinkText;
    public final Uri mClickableLinkUrl;
    public final String mDescriptionText;
    public final String mDetailText;
    public final String mFacepileText;
    public final Uri mImageUrl;
    public final String mPrimaryButtonAction;
    public final String mPrimaryButtonIntentUrl;
    public final String mPrimaryButtonStep;
    public final String mPrimaryButtonText;
    public final ImmutableList mProfilePictureUrls;
    public final String mSecondaryButtonAction;
    public final String mSecondaryButtonIntentUrl;
    public final boolean mSecondaryButtonOverrideBackOnly;
    public final String mSecondaryButtonStep;
    public final String mSecondaryButtonText;
    public final boolean mShouldUseDefaultImage;
    public final String mSubTitle;
    public final String mTitle;

    public FetchZeroInterstitialContentResult() {
        this.mTitle = null;
        this.mSubTitle = null;
        this.mDescriptionText = null;
        this.mImageUrl = 4YU.A0F("");
        this.mShouldUseDefaultImage = false;
        this.mFacepileText = null;
        this.mProfilePictureUrls = ImmutableList.of();
        this.mDetailText = null;
        this.mClickableLinkText = null;
        this.mClickableLinkUrl = Uri.parse("");
        this.mPrimaryButtonText = null;
        this.mPrimaryButtonIntentUrl = null;
        this.mPrimaryButtonStep = null;
        this.mPrimaryButtonAction = null;
        this.mSecondaryButtonText = null;
        this.mSecondaryButtonIntentUrl = null;
        this.mSecondaryButtonStep = null;
        this.mSecondaryButtonAction = null;
        this.mSecondaryButtonOverrideBackOnly = false;
        this.mCampaignTokenToRefreshType = null;
    }

    public FetchZeroInterstitialContentResult(Parcel parcel) {
        this.mTitle = parcel.readString();
        this.mSubTitle = parcel.readString();
        this.mDescriptionText = parcel.readString();
        this.mImageUrl = C0A2.A03(parcel.readString());
        boolean z = true;
        this.mShouldUseDefaultImage = AnonymousClass001.A1N(parcel.readByte());
        this.mFacepileText = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readStringList(A0s);
        this.mProfilePictureUrls = ImmutableList.copyOf((Collection) A0s);
        this.mDetailText = parcel.readString();
        this.mClickableLinkText = parcel.readString();
        this.mClickableLinkUrl = C0A2.A03(parcel.readString());
        this.mPrimaryButtonText = parcel.readString();
        this.mPrimaryButtonIntentUrl = parcel.readString();
        this.mPrimaryButtonStep = parcel.readString();
        this.mPrimaryButtonAction = parcel.readString();
        this.mSecondaryButtonText = parcel.readString();
        this.mSecondaryButtonIntentUrl = parcel.readString();
        this.mSecondaryButtonStep = parcel.readString();
        this.mSecondaryButtonAction = parcel.readString();
        this.mSecondaryButtonOverrideBackOnly = parcel.readByte() == 0 ? false : z;
        this.mCampaignTokenToRefreshType = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroInterstitialContentResult) {
            FetchZeroInterstitialContentResult fetchZeroInterstitialContentResult = (FetchZeroInterstitialContentResult) obj;
            if (Objects.equal(this.mTitle, fetchZeroInterstitialContentResult.mTitle) && Objects.equal(this.mSubTitle, fetchZeroInterstitialContentResult.mSubTitle) && Objects.equal(this.mDescriptionText, fetchZeroInterstitialContentResult.mDescriptionText) && Objects.equal(this.mImageUrl, fetchZeroInterstitialContentResult.mImageUrl) && this.mShouldUseDefaultImage == fetchZeroInterstitialContentResult.mShouldUseDefaultImage && Objects.equal(this.mFacepileText, fetchZeroInterstitialContentResult.mFacepileText) && Objects.equal(this.mProfilePictureUrls, fetchZeroInterstitialContentResult.mProfilePictureUrls) && Objects.equal(this.mDetailText, fetchZeroInterstitialContentResult.mDetailText) && Objects.equal(this.mClickableLinkText, fetchZeroInterstitialContentResult.mClickableLinkText) && Objects.equal(this.mClickableLinkUrl, fetchZeroInterstitialContentResult.mClickableLinkUrl) && Objects.equal(this.mPrimaryButtonText, fetchZeroInterstitialContentResult.mPrimaryButtonText) && Objects.equal(this.mPrimaryButtonIntentUrl, fetchZeroInterstitialContentResult.mPrimaryButtonIntentUrl) && Objects.equal(this.mPrimaryButtonStep, fetchZeroInterstitialContentResult.mPrimaryButtonStep) && Objects.equal(this.mPrimaryButtonAction, fetchZeroInterstitialContentResult.mPrimaryButtonAction) && Objects.equal(this.mSecondaryButtonText, fetchZeroInterstitialContentResult.mSecondaryButtonText) && Objects.equal(this.mSecondaryButtonIntentUrl, fetchZeroInterstitialContentResult.mSecondaryButtonIntentUrl) && Objects.equal(this.mSecondaryButtonStep, fetchZeroInterstitialContentResult.mSecondaryButtonStep) && Objects.equal(this.mSecondaryButtonAction, fetchZeroInterstitialContentResult.mSecondaryButtonAction) && this.mSecondaryButtonOverrideBackOnly == fetchZeroInterstitialContentResult.mSecondaryButtonOverrideBackOnly) {
                z = 4YV.A1Z(this.mCampaignTokenToRefreshType, fetchZeroInterstitialContentResult.mCampaignTokenToRefreshType);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mTitle, this.mDescriptionText, this.mImageUrl, Boolean.valueOf(this.mShouldUseDefaultImage), this.mFacepileText, this.mProfilePictureUrls, this.mDetailText, this.mClickableLinkText, this.mClickableLinkUrl, this.mPrimaryButtonText, this.mPrimaryButtonIntentUrl, this.mPrimaryButtonStep, this.mPrimaryButtonAction, this.mSecondaryButtonText, this.mSecondaryButtonIntentUrl, this.mSecondaryButtonStep, this.mSecondaryButtonAction, Boolean.valueOf(this.mSecondaryButtonOverrideBackOnly), this.mCampaignTokenToRefreshType});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("title", this.mTitle);
        stringHelper.add("subTitle", this.mSubTitle);
        stringHelper.add("description_text", this.mDescriptionText);
        stringHelper.add("image_url", this.mImageUrl);
        stringHelper.add("should_use_default_image", this.mShouldUseDefaultImage);
        stringHelper.add("facepile_text", this.mFacepileText);
        stringHelper.add("profile_picture_urls", this.mProfilePictureUrls);
        stringHelper.add("detail_text", this.mDetailText);
        stringHelper.add("clickable_link_text", this.mClickableLinkText);
        stringHelper.add("clickable_link_url", this.mClickableLinkUrl);
        stringHelper.add("primary_button_text", this.mPrimaryButtonText);
        stringHelper.add("primary_button_intent_url", this.mPrimaryButtonIntentUrl);
        stringHelper.add("primary_button_step", this.mPrimaryButtonStep);
        stringHelper.add("primary_button_action", this.mPrimaryButtonAction);
        stringHelper.add("secondary_button_text", this.mSecondaryButtonText);
        stringHelper.add("secondary_button_intent_url", this.mSecondaryButtonIntentUrl);
        stringHelper.add("secondary_button_step", this.mSecondaryButtonStep);
        stringHelper.add("secondary_button_action", this.mSecondaryButtonAction);
        stringHelper.add("secondary_button_override_back_only", this.mSecondaryButtonOverrideBackOnly);
        return 4YV.A0s(stringHelper, this.mCampaignTokenToRefreshType, "campaign_token_to_refresh_type");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mSubTitle);
        parcel.writeString(this.mDescriptionText);
        DKF.A1E(parcel, this.mImageUrl);
        parcel.writeByte(this.mShouldUseDefaultImage ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mFacepileText);
        parcel.writeStringList(this.mProfilePictureUrls);
        parcel.writeString(this.mDetailText);
        parcel.writeString(this.mClickableLinkText);
        DKF.A1E(parcel, this.mClickableLinkUrl);
        parcel.writeString(this.mPrimaryButtonText);
        parcel.writeString(this.mPrimaryButtonIntentUrl);
        parcel.writeString(this.mPrimaryButtonStep);
        parcel.writeString(this.mPrimaryButtonAction);
        parcel.writeString(this.mSecondaryButtonText);
        parcel.writeString(this.mSecondaryButtonIntentUrl);
        parcel.writeString(this.mSecondaryButtonStep);
        parcel.writeString(this.mSecondaryButtonAction);
        parcel.writeByte(this.mSecondaryButtonOverrideBackOnly ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mCampaignTokenToRefreshType);
    }
}
