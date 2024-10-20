package com.facebook.iorg.common.upsell.server;

import X.AnonymousClass001;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UpsellPromo.class */
public final class UpsellPromo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(79);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public UpsellPromo() {
        this(null, null, null, null, null, null, null, null, null, false, false);
    }

    public UpsellPromo(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A08 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = parcel.readString();
        boolean z = true;
        this.A0A = AnonymousClass001.A1N(parcel.readByte());
        this.A09 = parcel.readByte() == 0 ? false : z;
        this.A00 = parcel.readString();
        this.A07 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public UpsellPromo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        this.A05 = str;
        this.A08 = str2;
        this.A03 = str3;
        this.A01 = str4;
        this.A06 = str5;
        this.A0A = z;
        this.A09 = z2;
        this.A00 = str6;
        this.A07 = str7;
        this.A04 = str8;
        this.A02 = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
    }
}
