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

/* loaded from: FetchZeroOptinContentRequestResult.class */
public class FetchZeroOptinContentRequestResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(85);
    public final String mDescriptionText;
    public final String mFriendsText;
    public final String mLearnMoreText;
    public final Uri mLearnMoreUrl;
    public final String mLegalDisclaimerText;
    public final Uri mLogoUrl;
    public final String mOptinConfirmButtonText;
    public final String mOptinDeclineButtonCancelText;
    public final String mOptinDeclineButtonConfirmText;
    public final String mOptinDeclineButtonText;
    public final String mOptinDeclineConfirmText;
    public final String mOptinDeclineTitle;
    public final ImmutableList mProfilePictureUrls;
    public final String mTitle;

    public FetchZeroOptinContentRequestResult() {
        this.mTitle = null;
        this.mDescriptionText = null;
        this.mLogoUrl = 4YU.A0F("");
        this.mFriendsText = null;
        this.mProfilePictureUrls = ImmutableList.of();
        this.mLegalDisclaimerText = null;
        this.mLearnMoreText = null;
        this.mLearnMoreUrl = Uri.parse("");
        this.mOptinDeclineTitle = null;
        this.mOptinDeclineConfirmText = null;
        this.mOptinDeclineButtonConfirmText = null;
        this.mOptinDeclineButtonCancelText = null;
        this.mOptinConfirmButtonText = null;
        this.mOptinDeclineButtonText = null;
    }

    public FetchZeroOptinContentRequestResult(Parcel parcel) {
        this.mTitle = parcel.readString();
        this.mDescriptionText = parcel.readString();
        this.mLogoUrl = C0A2.A03(parcel.readString());
        this.mFriendsText = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readStringList(A0s);
        this.mProfilePictureUrls = ImmutableList.copyOf((Collection) A0s);
        this.mLegalDisclaimerText = parcel.readString();
        this.mLearnMoreText = parcel.readString();
        this.mLearnMoreUrl = C0A2.A03(parcel.readString());
        this.mOptinDeclineTitle = parcel.readString();
        this.mOptinDeclineConfirmText = parcel.readString();
        this.mOptinDeclineButtonConfirmText = parcel.readString();
        this.mOptinDeclineButtonCancelText = parcel.readString();
        this.mOptinConfirmButtonText = parcel.readString();
        this.mOptinDeclineButtonText = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroOptinContentRequestResult) {
            FetchZeroOptinContentRequestResult fetchZeroOptinContentRequestResult = (FetchZeroOptinContentRequestResult) obj;
            if (Objects.equal(this.mTitle, fetchZeroOptinContentRequestResult.mTitle) && Objects.equal(this.mDescriptionText, fetchZeroOptinContentRequestResult.mDescriptionText) && Objects.equal(this.mLogoUrl, fetchZeroOptinContentRequestResult.mLogoUrl) && Objects.equal(this.mFriendsText, fetchZeroOptinContentRequestResult.mFriendsText) && Objects.equal(this.mProfilePictureUrls, fetchZeroOptinContentRequestResult.mProfilePictureUrls) && Objects.equal(this.mLegalDisclaimerText, fetchZeroOptinContentRequestResult.mLegalDisclaimerText) && Objects.equal(this.mLearnMoreText, fetchZeroOptinContentRequestResult.mLearnMoreText) && Objects.equal(this.mLearnMoreUrl, fetchZeroOptinContentRequestResult.mLearnMoreUrl) && Objects.equal(this.mOptinDeclineTitle, fetchZeroOptinContentRequestResult.mOptinDeclineTitle) && Objects.equal(this.mOptinDeclineConfirmText, fetchZeroOptinContentRequestResult.mOptinDeclineConfirmText) && Objects.equal(this.mOptinDeclineButtonConfirmText, fetchZeroOptinContentRequestResult.mOptinDeclineButtonConfirmText) && Objects.equal(this.mOptinDeclineButtonCancelText, fetchZeroOptinContentRequestResult.mOptinDeclineButtonCancelText) && Objects.equal(this.mOptinConfirmButtonText, fetchZeroOptinContentRequestResult.mOptinConfirmButtonText)) {
                z = 4YV.A1Z(this.mOptinDeclineButtonText, fetchZeroOptinContentRequestResult.mOptinDeclineButtonText);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mTitle, this.mDescriptionText, this.mLogoUrl, this.mFriendsText, this.mProfilePictureUrls, this.mLegalDisclaimerText, this.mLearnMoreText, this.mLearnMoreUrl, this.mOptinDeclineTitle, this.mOptinDeclineConfirmText, this.mOptinDeclineButtonConfirmText, this.mOptinDeclineButtonCancelText, this.mOptinConfirmButtonText, this.mOptinDeclineButtonText});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("title", this.mTitle);
        stringHelper.add("description_text", this.mDescriptionText);
        stringHelper.add("logo_url", this.mLogoUrl);
        stringHelper.add("friends_text", this.mFriendsText);
        stringHelper.add("friends_profile_picture_urls", this.mProfilePictureUrls);
        stringHelper.add("legal_disclaimer_text", this.mLegalDisclaimerText);
        stringHelper.add("learn_more_text", this.mLearnMoreText);
        stringHelper.add("learn_more_url", this.mLearnMoreUrl);
        stringHelper.add("optin_decline_title", this.mOptinDeclineTitle);
        stringHelper.add("optin_decline_confirm_text", this.mOptinDeclineConfirmText);
        stringHelper.add("optin_decline_button_confirm_text", this.mOptinDeclineButtonConfirmText);
        stringHelper.add("optin_decline_button_cancel_text", this.mOptinDeclineButtonCancelText);
        stringHelper.add("optin_confirm_button_text", this.mOptinConfirmButtonText);
        return 4YV.A0s(stringHelper, this.mOptinDeclineButtonText, "optin_decline_button_text");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mDescriptionText);
        DKF.A1E(parcel, this.mLogoUrl);
        parcel.writeString(this.mFriendsText);
        parcel.writeStringList(this.mProfilePictureUrls);
        parcel.writeString(this.mLegalDisclaimerText);
        parcel.writeString(this.mLearnMoreText);
        DKF.A1E(parcel, this.mLearnMoreUrl);
        parcel.writeString(this.mOptinDeclineTitle);
        parcel.writeString(this.mOptinDeclineConfirmText);
        parcel.writeString(this.mOptinDeclineButtonConfirmText);
        parcel.writeString(this.mOptinDeclineButtonCancelText);
        parcel.writeString(this.mOptinConfirmButtonText);
        parcel.writeString(this.mOptinDeclineButtonText);
    }
}
