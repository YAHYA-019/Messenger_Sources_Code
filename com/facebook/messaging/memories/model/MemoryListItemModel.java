package com.facebook.messaging.memories.model;

import X.11T;
import X.7zR;
import X.C04v;
import X.C3o5;
import X.CSV;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MemoryListItemModel.class */
public final class MemoryListItemModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(36);
    public final long A00;
    public final long A01;
    public final Uri A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final int A07;
    public final Integer A08;
    public final Integer A09;
    public final Long A0A;
    public final Long A0B;
    public final Long A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;

    public MemoryListItemModel(Uri uri, Boolean bool, Integer num, Integer num2, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, long j2) {
        7zR.A1N(str, str2);
        11T.A0F(str3, 5);
        this.A04 = str;
        this.A00 = j;
        this.A0F = str2;
        this.A07 = i;
        this.A0D = str3;
        this.A01 = j2;
        this.A02 = uri;
        this.A0C = l;
        this.A0E = str4;
        this.A08 = num;
        this.A09 = num2;
        this.A05 = str5;
        this.A0G = str6;
        this.A06 = str7;
        this.A0A = l2;
        this.A0B = l3;
        this.A03 = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A07);
        parcel.writeString(this.A0D);
        parcel.writeLong(this.A01);
        parcel.writeParcelable(this.A02, i);
        C3o5.A0g(parcel, this.A0C);
        parcel.writeString(this.A0E);
        C3o5.A0f(parcel, this.A08);
        C3o5.A0f(parcel, this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A06);
        C3o5.A0g(parcel, this.A0A);
        C3o5.A0g(parcel, this.A0B);
        Boolean bool = this.A03;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
