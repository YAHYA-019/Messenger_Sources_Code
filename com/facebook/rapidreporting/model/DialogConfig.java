package com.facebook.rapidreporting.model;

import X.FKW;
import X.GIc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DialogConfig.class */
public final class DialogConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(86);
    public final GIc A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public DialogConfig(GIc gIc, String str, String str2, String str3) {
        this.A04 = str3;
        this.A03 = str2;
        this.A02 = str;
        this.A01 = null;
        this.A06 = null;
        this.A05 = null;
        this.A00 = gIc;
    }

    public DialogConfig(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = null;
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
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
    }
}
