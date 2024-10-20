package com.facebookpay.bloks.nativeprops;

import X.11T;
import X.1BL;
import X.7zT;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: APMBloksNativeProps.class */
public final class APMBloksNativeProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(89);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public APMBloksNativeProps(String str, String str2, String str3, String str4, String str5, String str6) {
        7zT.A1W(str, str2, str3, str4);
        1BL.A1G(str5, str6);
        this.A05 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A00 = str5;
        this.A03 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
    }
}
