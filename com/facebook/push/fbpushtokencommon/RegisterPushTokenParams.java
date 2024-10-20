package com.facebook.push.fbpushtokencommon;

import X.11T;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RegisterPushTokenParams.class */
public final class RegisterPushTokenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(71);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;

    public RegisterPushTokenParams(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0G = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A09 = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0C = readString3;
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A0H = AbM.A0t(parcel);
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0B = parcel.readString();
        this.A06 = parcel.readLong();
        this.A0A = parcel.readString();
        this.A05 = parcel.readLong();
        this.A08 = parcel.readString();
        this.A0D = parcel.readString();
        this.A0F = parcel.readString();
        this.A0E = parcel.readString();
    }

    public RegisterPushTokenParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z) {
        11T.A0F(str2, 2);
        this.A0G = str;
        this.A09 = str2;
        this.A0C = AbJ.A1A(str3);
        this.A00 = i;
        this.A02 = i2;
        this.A07 = j;
        this.A0H = str4;
        this.A03 = i3;
        this.A04 = z ? 1 : 0;
        this.A01 = i4;
        this.A0B = str5;
        this.A06 = j2;
        this.A0A = str6;
        this.A05 = j3;
        this.A08 = null;
        this.A0D = str7;
        this.A0F = str8;
        this.A0E = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A07);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
    }
}
