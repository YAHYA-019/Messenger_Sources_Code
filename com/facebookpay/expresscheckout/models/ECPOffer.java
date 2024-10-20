package com.facebookpay.expresscheckout.models;

import X.11T;
import X.7zT;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ECPOffer.class */
public final class ECPOffer implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(40);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public ECPOffer(String str, String str2, String str3, String str4, String str5) {
        7zT.A1W(str, str2, str3, str4);
        11T.A0F(str5, 5);
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = str4;
        this.A01 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
