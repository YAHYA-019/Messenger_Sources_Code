package com.facebook.browserextensions.ipc;

import X.1BL;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UserCredentialInfo.class */
public final class UserCredentialInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(59);
    public final MailingAddressInfo A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public UserCredentialInfo(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (MailingAddressInfo) 1BL.A0C(parcel, MailingAddressInfo.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
