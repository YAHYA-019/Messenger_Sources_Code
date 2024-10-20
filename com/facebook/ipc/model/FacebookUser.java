package com.facebook.ipc.model;

import X.1BL;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.google.common.base.MoreObjects;

/* loaded from: FacebookUser.class */
public class FacebookUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(57);
    public final FacebookUserCoverPhoto mCoverPhoto;
    public String mDisplayName;
    public final String mFirstName;
    public final String mImageUrl;
    public final String mLastName;
    public final long mUserId;

    public FacebookUser() {
        this.mUserId = -1;
        this.mFirstName = null;
        this.mLastName = null;
        this.mDisplayName = null;
        this.mImageUrl = null;
        this.mCoverPhoto = null;
    }

    public FacebookUser(Parcel parcel) {
        this.mUserId = parcel.readLong();
        this.mFirstName = parcel.readString();
        this.mLastName = parcel.readString();
        this.mDisplayName = parcel.readString();
        this.mImageUrl = parcel.readString();
        this.mCoverPhoto = (FacebookUserCoverPhoto) 1BL.A0C(parcel, FacebookUserCoverPhoto.class);
    }

    public FacebookUser(FacebookUserCoverPhoto facebookUserCoverPhoto, String str, String str2, String str3, String str4, long j) {
        this.mUserId = j;
        this.mFirstName = str;
        this.mLastName = str2;
        this.mDisplayName = str3;
        this.mImageUrl = str4;
        this.mCoverPhoto = facebookUserCoverPhoto;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper((Class) getClass());
        stringHelper.add("display name", this.mDisplayName);
        stringHelper.add(ErrorReportingConstants.USER_ID_KEY, this.mUserId);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mUserId);
        parcel.writeString(this.mFirstName);
        parcel.writeString(this.mLastName);
        parcel.writeString(this.mDisplayName);
        parcel.writeString(this.mImageUrl);
        parcel.writeParcelable(this.mCoverPhoto, i);
    }
}
