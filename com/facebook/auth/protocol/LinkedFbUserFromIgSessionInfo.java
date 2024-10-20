package com.facebook.auth.protocol;

import X.AbM;
import X.AnonymousClass001;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LinkedFbUserFromIgSessionInfo.class */
public final class LinkedFbUserFromIgSessionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(40);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final String A06;
    public final String A07;

    public LinkedFbUserFromIgSessionInfo(Parcel parcel) {
        this.A02 = AbM.A0t(parcel);
        this.A03 = AbM.A0t(parcel);
        boolean z = false;
        this.A05 = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A04 = parcel.readByte() == 1 ? true : z;
        this.A07 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A06 = parcel.readString();
    }

    public LinkedFbUserFromIgSessionInfo(String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A06 = str5;
        this.A03 = str2;
        this.A07 = str3;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
        this.A01 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
    }
}
