package com.facebook.auth.protocol;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* loaded from: ConfirmedMessengerCredentials.class */
public final class ConfirmedMessengerCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(32);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Calendar A05;

    public ConfirmedMessengerCredentials(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
        this.A05 = (Calendar) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A05);
    }
}
