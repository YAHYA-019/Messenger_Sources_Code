package com.facebook.securedaction.challenges;

import X.C53v;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SecuredActionChallengeData.class */
public class SecuredActionChallengeData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(8);
    public final String mChallengeCallToActionText;
    public final String mChallengeEntryUrl;
    public final String mChallengeExplanation;
    public final String mChallengeHintText;
    public final String mChallengeSuccessUrl;
    public final String mChallengeTitle;
    public final ChallengeType mChallengeType;
    public final String mForgotPasswordUrl;

    public SecuredActionChallengeData() {
        this.mChallengeType = ChallengeType.A04;
        this.mChallengeTitle = null;
        this.mChallengeExplanation = null;
        this.mChallengeCallToActionText = null;
        this.mChallengeEntryUrl = null;
        this.mChallengeSuccessUrl = null;
        this.mChallengeHintText = null;
        this.mForgotPasswordUrl = null;
    }

    public SecuredActionChallengeData(Parcel parcel) {
        this.mChallengeType = C53v.A07(parcel, ChallengeType.class);
        this.mChallengeTitle = parcel.readString();
        this.mChallengeExplanation = parcel.readString();
        this.mChallengeCallToActionText = parcel.readString();
        this.mChallengeEntryUrl = parcel.readString();
        this.mChallengeSuccessUrl = parcel.readString();
        this.mChallengeHintText = parcel.readString();
        this.mForgotPasswordUrl = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.mChallengeType);
        parcel.writeString(this.mChallengeTitle);
        parcel.writeString(this.mChallengeExplanation);
        parcel.writeString(this.mChallengeCallToActionText);
        parcel.writeString(this.mChallengeEntryUrl);
        parcel.writeString(this.mChallengeSuccessUrl);
        parcel.writeString(this.mChallengeHintText);
        parcel.writeString(this.mForgotPasswordUrl);
    }
}
