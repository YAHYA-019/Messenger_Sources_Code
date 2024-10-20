package com.facebook.payments.p2p.model.verification;

import X.C53v;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: ScreenData.class */
public class ScreenData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(98);
    public final String mCardIssuer;
    public final String mCardLastFour;
    public final int mDobDay;
    public final int mDobMonth;
    public final int mDobYear;
    public final String mErrorMessage;
    public final String mFirstName;
    public final boolean mHasThrownException;
    public final String mIntroReason;
    public final boolean mIsSender;
    public final String mLastName;
    public final boolean mPreviousAttemptFailed;
    public final String mSenderShortName;
    public final boolean mVerificationSucceeded;

    public ScreenData() {
        this.mIntroReason = null;
        this.mFirstName = null;
        this.mLastName = null;
        this.mSenderShortName = null;
        this.mCardIssuer = null;
        this.mCardLastFour = null;
        this.mErrorMessage = null;
        this.mDobYear = 0;
        this.mDobMonth = 0;
        this.mDobDay = 0;
        this.mIsSender = false;
        this.mPreviousAttemptFailed = false;
        this.mHasThrownException = false;
        this.mVerificationSucceeded = false;
    }

    public ScreenData(Parcel parcel) {
        this.mIntroReason = parcel.readString();
        this.mFirstName = parcel.readString();
        this.mLastName = parcel.readString();
        this.mSenderShortName = parcel.readString();
        this.mCardIssuer = parcel.readString();
        this.mCardLastFour = parcel.readString();
        this.mErrorMessage = parcel.readString();
        this.mDobYear = parcel.readInt();
        this.mDobMonth = parcel.readInt();
        this.mDobDay = parcel.readInt();
        this.mIsSender = C53v.A0S(parcel);
        this.mPreviousAttemptFailed = C53v.A0S(parcel);
        this.mHasThrownException = C53v.A0S(parcel);
        this.mVerificationSucceeded = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("intro_reason", this.mIntroReason);
        stringHelper.add("first_name", this.mFirstName);
        stringHelper.add("last_name", this.mLastName);
        stringHelper.add("sender_short_name", this.mSenderShortName);
        stringHelper.add("card_issuer", this.mCardIssuer);
        stringHelper.add("card_last_four", this.mCardLastFour);
        stringHelper.add("error_message", this.mErrorMessage);
        stringHelper.add("dob_year", this.mDobYear);
        stringHelper.add("dob_month", this.mDobMonth);
        stringHelper.add("dob_day", this.mDobDay);
        stringHelper.add("is_sender", this.mIsSender);
        stringHelper.add("previous_attempt_failed", this.mPreviousAttemptFailed);
        stringHelper.add("has_thrown_exception", this.mHasThrownException);
        stringHelper.add("verification_succeeded", this.mVerificationSucceeded);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mIntroReason);
        parcel.writeString(this.mFirstName);
        parcel.writeString(this.mLastName);
        parcel.writeString(this.mSenderShortName);
        parcel.writeString(this.mCardIssuer);
        parcel.writeString(this.mCardLastFour);
        parcel.writeString(this.mErrorMessage);
        parcel.writeInt(this.mDobYear);
        parcel.writeInt(this.mDobMonth);
        parcel.writeInt(this.mDobDay);
        parcel.writeInt(this.mIsSender ? 1 : 0);
        parcel.writeInt(this.mPreviousAttemptFailed ? 1 : 0);
        parcel.writeInt(this.mHasThrownException ? 1 : 0);
        parcel.writeInt(this.mVerificationSucceeded ? 1 : 0);
    }
}
