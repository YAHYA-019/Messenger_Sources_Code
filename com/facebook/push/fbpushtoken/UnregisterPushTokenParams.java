package com.facebook.push.fbpushtoken;

import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UnregisterPushTokenParams.class */
public final class UnregisterPushTokenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(70);
    public final String A00;

    public UnregisterPushTokenParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public UnregisterPushTokenParams(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
