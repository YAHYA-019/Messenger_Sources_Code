package com.facebook.account.recovery.common.protocol;

import X.C53v;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryValidateCodeMethod$Params.class */
public final class AccountRecoveryValidateCodeMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(74);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    public AccountRecoveryValidateCodeMethod$Params(Parcel parcel) {
        this.A0C = parcel.readString();
        this.A09 = parcel.readString();
        this.A0D = parcel.readString();
        this.A0B = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = parcel.readString();
        this.A03 = parcel.readString();
        this.A05 = parcel.readString();
        this.A0A = parcel.readString();
        this.A02 = parcel.readString();
        this.A06 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0F = C53v.A0S(parcel);
    }

    public AccountRecoveryValidateCodeMethod$Params(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2) {
        this.A0C = str;
        this.A09 = str2;
        this.A0D = str3;
        this.A0B = String.valueOf(z);
        this.A01 = str5;
        this.A00 = str6;
        this.A08 = str7;
        this.A0E = str4;
        this.A03 = str8;
        this.A05 = str9;
        this.A0A = str10;
        this.A02 = str11;
        this.A06 = str12;
        this.A04 = str13;
        this.A07 = str14;
        this.A0F = z2;
    }

    public AccountRecoveryValidateCodeMethod$Params(String str, String str2, String str3, String str4, boolean z) {
        this.A0C = str;
        this.A09 = str2;
        this.A0D = str3;
        this.A0B = String.valueOf(z);
        this.A01 = "";
        this.A00 = "undefined";
        this.A08 = str4;
        this.A0E = "";
        this.A03 = "";
        this.A05 = "";
        this.A0A = "";
        this.A02 = "";
        this.A06 = "";
        this.A04 = "";
        this.A07 = null;
        this.A0F = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0F ? 1 : 0);
    }
}
