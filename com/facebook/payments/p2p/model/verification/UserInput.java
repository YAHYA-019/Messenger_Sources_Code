package com.facebook.payments.p2p.model.verification;

import X.4YV;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: UserInput.class */
public class UserInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(99);
    public final String mCardFirstSix;
    public final String mDobDay;
    public final String mDobMonth;
    public final String mDobYear;
    public final String mFirstName;
    public final String mLastName;
    public final String mSsnLastFour;

    public UserInput(Parcel parcel) {
        this.mFirstName = parcel.readString();
        this.mLastName = parcel.readString();
        this.mCardFirstSix = parcel.readString();
        this.mDobYear = parcel.readString();
        this.mDobMonth = parcel.readString();
        this.mDobDay = parcel.readString();
        this.mSsnLastFour = parcel.readString();
    }

    public UserInput(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.mFirstName = str5;
        this.mLastName = str6;
        this.mCardFirstSix = str;
        this.mDobYear = str4;
        this.mDobMonth = str3;
        this.mDobDay = str2;
        this.mSsnLastFour = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("first_name", this.mFirstName);
        stringHelper.add("last_name", this.mLastName);
        stringHelper.add("card_first_six", this.mCardFirstSix);
        stringHelper.add("dob_year", this.mDobYear);
        stringHelper.add("dob_month", this.mDobMonth);
        stringHelper.add("dob_day", this.mDobDay);
        return 4YV.A0s(stringHelper, this.mSsnLastFour, "ssn_last_four");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mFirstName);
        parcel.writeString(this.mLastName);
        parcel.writeString(this.mCardFirstSix);
        parcel.writeString(this.mDobYear);
        parcel.writeString(this.mDobMonth);
        parcel.writeString(this.mDobDay);
        parcel.writeString(this.mSsnLastFour);
    }
}
