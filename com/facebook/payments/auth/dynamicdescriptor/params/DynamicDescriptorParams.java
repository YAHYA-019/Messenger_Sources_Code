package com.facebook.payments.auth.dynamicdescriptor.params;

import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DynamicDescriptorParams.class */
public final class DynamicDescriptorParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(34);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
    }
}
