package com.facebook.auth.credentials;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DBLLocalAuthCredentials.class */
public class DBLLocalAuthCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(14);
    public final String accessToken;
    public final String analyticsClaim;
    public final int confirmationStatus;
    public final String machineId;
    public final String secret;
    public final String sessionCookieString;
    public final String sessionKey;
    public final String uid;
    public final String username;

    public DBLLocalAuthCredentials() {
        this.uid = null;
        this.accessToken = null;
        this.sessionCookieString = null;
        this.secret = null;
        this.sessionKey = null;
        this.username = null;
        this.machineId = null;
        this.confirmationStatus = 3;
        this.analyticsClaim = null;
    }

    public DBLLocalAuthCredentials(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        this.uid = str;
        this.accessToken = str2;
        this.sessionCookieString = str3;
        this.secret = str4;
        this.sessionKey = str5;
        this.username = str6;
        this.machineId = str7;
        this.confirmationStatus = i;
        this.analyticsClaim = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.accessToken);
        parcel.writeString(this.sessionCookieString);
        parcel.writeString(this.secret);
        parcel.writeString(this.sessionKey);
        parcel.writeString(this.username);
        parcel.writeString(this.machineId);
        parcel.writeInt(this.confirmationStatus);
        parcel.writeString(this.analyticsClaim);
    }
}
