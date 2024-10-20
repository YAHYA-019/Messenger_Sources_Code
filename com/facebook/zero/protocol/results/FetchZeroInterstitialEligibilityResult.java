package com.facebook.zero.protocol.results;

import X.4YU;
import X.4YV;
import X.DKG;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* loaded from: FetchZeroInterstitialEligibilityResult.class */
public class FetchZeroInterstitialEligibilityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(84);
    public final String mCampaignId;
    public final int mDelayInterval;
    public final int mTtl;
    public final String mType;

    public FetchZeroInterstitialEligibilityResult() {
        this.mCampaignId = null;
        this.mType = null;
        this.mTtl = 0;
        this.mDelayInterval = 0;
    }

    public FetchZeroInterstitialEligibilityResult(Parcel parcel) {
        this.mCampaignId = parcel.readString();
        this.mType = parcel.readString();
        this.mTtl = parcel.readInt();
        this.mDelayInterval = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FetchZeroInterstitialEligibilityResult) {
            FetchZeroInterstitialEligibilityResult fetchZeroInterstitialEligibilityResult = (FetchZeroInterstitialEligibilityResult) obj;
            if (Objects.equal(this.mCampaignId, fetchZeroInterstitialEligibilityResult.mCampaignId) && Objects.equal(this.mType, fetchZeroInterstitialEligibilityResult.mType)) {
                if (DKG.A1Z(fetchZeroInterstitialEligibilityResult.mTtl, Integer.valueOf(this.mTtl))) {
                    z = 4YV.A1Z(Integer.valueOf(this.mDelayInterval), Integer.valueOf(fetchZeroInterstitialEligibilityResult.mDelayInterval));
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(this.mCampaignId, this.mType, Integer.valueOf(this.mTtl));
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("campaignId", this.mCampaignId);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.mType);
        stringHelper.add("ttl", this.mTtl);
        stringHelper.add("delayInterval", this.mDelayInterval);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCampaignId);
        parcel.writeString(this.mType);
        parcel.writeInt(this.mTtl);
        parcel.writeInt(this.mDelayInterval);
    }
}
