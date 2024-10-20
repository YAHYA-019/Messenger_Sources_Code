package com.facebook.messaging.phoneconfirmation.protocol;

import X.1BL;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.protocol.InstagramUserInfo;

/* loaded from: CheckConfirmationCodeParams.class */
public final class CheckConfirmationCodeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CST(98);
    public final InstagramUserInfo A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public CheckConfirmationCodeParams(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (InstagramUserInfo) 1BL.A0C(parcel, InstagramUserInfo.class);
    }

    public CheckConfirmationCodeParams(String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = null;
        this.A00 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
