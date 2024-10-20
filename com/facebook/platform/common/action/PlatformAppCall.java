package com.facebook.platform.common.action;

import X.11T;
import X.1BK;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PlatformAppCall.class */
public final class PlatformAppCall implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(33);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public PlatformAppCall(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
        this.A09 = parcel.readString();
        boolean[] createBooleanArray = parcel.createBooleanArray();
        if (createBooleanArray == null) {
            throw 1BK.A0h();
        }
        this.A06 = createBooleanArray[0];
    }

    public PlatformAppCall(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        this.A04 = str5;
        this.A00 = i;
        this.A06 = z;
        this.A08 = str6;
        this.A01 = str;
        this.A03 = str4;
        this.A02 = str2;
        this.A07 = str3;
        this.A05 = str7;
        this.A09 = str8 == null ? 1BK.A0t() : str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A09);
        parcel.writeBooleanArray(new boolean[]{this.A06});
    }
}
