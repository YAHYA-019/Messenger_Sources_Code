package com.facebook.payments.ui;

import X.C53v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MediaGridTextLayoutParams.class */
public final class MediaGridTextLayoutParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(5);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public MediaGridTextLayoutParams(Parcel parcel) {
        this.A00 = parcel.readInt() == 0 ? null : C53v.A01(parcel);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public MediaGridTextLayoutParams(ImmutableList immutableList, String str, String str2, String str3, String str4) {
        this.A00 = immutableList == null ? ImmutableList.of() : immutableList;
        this.A04 = str3;
        this.A05 = str4;
        this.A03 = str2;
        this.A02 = str;
        this.A01 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0M(parcel, this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
