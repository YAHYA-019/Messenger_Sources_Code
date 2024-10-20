package com.facebook.auth.credentials;

import X.AnonymousClass001;
import X.DKF;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DBLFacebookCredentials.class */
public class DBLFacebookCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(13);
    public final String mAlternativeAccessToken;
    public final String mFullName;
    public final Boolean mIsPinSet;
    public final Boolean mIsPrimaryTestUser;
    public final String mLopNonce;
    public final String mName;
    public final String mNonce;
    public final String mPicUrl;
    public final int mTime;
    public final String mUserId;
    public final String mUsername;

    public DBLFacebookCredentials() {
        this.mUserId = null;
        this.mTime = 0;
        this.mName = null;
        this.mFullName = null;
        this.mUsername = null;
        this.mPicUrl = null;
        this.mNonce = null;
        this.mIsPinSet = false;
        this.mAlternativeAccessToken = null;
        this.mLopNonce = null;
        this.mIsPrimaryTestUser = false;
    }

    public DBLFacebookCredentials(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2) {
        this.mUserId = str;
        this.mTime = i;
        this.mName = str2;
        this.mFullName = str3;
        this.mUsername = str4;
        this.mPicUrl = str5;
        this.mNonce = str6;
        this.mIsPinSet = Boolean.valueOf(z);
        this.mAlternativeAccessToken = str7;
        this.mLopNonce = str8;
        this.mIsPrimaryTestUser = Boolean.valueOf(z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DBLFacebookCredentials{mUserId='");
        A0k.append(this.mUserId);
        A0k.append('\'');
        A0k.append(", mTime=");
        A0k.append(this.mTime);
        A0k.append(", mName='");
        A0k.append(this.mName);
        A0k.append('\'');
        A0k.append(", mFullName='");
        A0k.append(this.mFullName);
        A0k.append('\'');
        A0k.append(", mUsername='");
        A0k.append(this.mUsername);
        A0k.append('\'');
        A0k.append(", mPicUrl='");
        A0k.append(this.mPicUrl);
        A0k.append('\'');
        A0k.append(", mNonce='");
        A0k.append(this.mNonce);
        A0k.append('\'');
        A0k.append(", mIsPinSet=");
        A0k.append(this.mIsPinSet);
        A0k.append(", mAlternativeAccessToken='");
        A0k.append(this.mAlternativeAccessToken);
        A0k.append('\'');
        A0k.append(", mLopNonce='");
        A0k.append(this.mLopNonce);
        A0k.append('\'');
        A0k.append(", mIsPrimaryTestUser=");
        A0k.append(this.mIsPrimaryTestUser);
        A0k.append('\'');
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUserId);
        parcel.writeInt(this.mTime);
        parcel.writeString(this.mName);
        parcel.writeString(this.mFullName);
        parcel.writeString(this.mUsername);
        parcel.writeString(this.mPicUrl);
        parcel.writeString(this.mNonce);
        DKF.A1C(parcel, this.mIsPinSet);
        parcel.writeString(this.mAlternativeAccessToken);
        parcel.writeString(this.mLopNonce);
        DKF.A1C(parcel, this.mIsPrimaryTestUser);
    }
}
