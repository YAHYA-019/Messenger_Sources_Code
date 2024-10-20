package com.facebook.browserextensions.ipc;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MailingAddressInfo.class */
public final class MailingAddressInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(58);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public MailingAddressInfo(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
    }
}
