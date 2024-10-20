package com.facebook.messaging.business.common.calltoaction.model;

import X.11T;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CTAUserConfirmation.class */
public final class CTAUserConfirmation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(28);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public CTAUserConfirmation(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public CTAUserConfirmation(String str, String str2, String str3, String str4) {
        this.A02 = str3;
        this.A01 = str2;
        this.A03 = str4;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }
}
