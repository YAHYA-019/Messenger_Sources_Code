package com.facebook.account.recovery.common.protocol;

import X.AbE;
import X.C53v;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: AccountRecoverySearchAccountMethodParams.class */
public final class AccountRecoverySearchAccountMethodParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(69);
    public String A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public ArrayList A04;
    public ArrayList A05;
    public final int A06;
    public final String A07;
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
    public final ArrayList A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public AccountRecoverySearchAccountMethodParams(Parcel parcel) {
        this.A0H = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A07 = parcel.readString();
        this.A0D = parcel.readString();
        this.A0E = parcel.readString();
        this.A0F = parcel.readString();
        this.A0I = parcel.createStringArrayList();
        this.A0G = parcel.readString();
        this.A0M = C53v.A0S(parcel);
        this.A0J = C53v.A0S(parcel);
        this.A0K = C53v.A0S(parcel);
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A06 = parcel.readInt();
        this.A00 = parcel.readString();
        this.A03 = parcel.createStringArrayList();
        this.A0L = C53v.A0S(parcel);
        this.A05 = parcel.createStringArrayList();
        this.A04 = parcel.createStringArrayList();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public AccountRecoverySearchAccountMethodParams(String str, String str2, String str3) {
        this.A0H = str;
        this.A08 = "";
        this.A09 = null;
        this.A0A = str2;
        this.A07 = str3;
        this.A0D = "";
        this.A0E = "";
        this.A0F = null;
        this.A0I = null;
        this.A0G = null;
        this.A0M = false;
        this.A0J = false;
        this.A0K = false;
        this.A0B = "";
        this.A0C = "";
        this.A06 = -1;
        this.A00 = "";
        this.A03 = null;
        this.A0L = false;
        this.A05 = null;
        this.A04 = null;
    }

    public AccountRecoverySearchAccountMethodParams(String str, String str2, String str3, String str4) {
        this.A0H = str;
        this.A08 = "";
        this.A09 = str2;
        this.A0A = str3;
        this.A07 = str4;
        this.A0D = "";
        this.A0E = "";
        this.A0F = "messenger";
        this.A0I = null;
        this.A0G = null;
        this.A0M = false;
        this.A0J = false;
        this.A0K = false;
        this.A0B = "";
        this.A0C = "";
        this.A06 = -1;
        this.A00 = "";
        this.A03 = null;
        this.A0L = false;
        this.A05 = null;
        this.A04 = null;
    }

    public AccountRecoverySearchAccountMethodParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, boolean z) {
        String A00 = AbE.A00(598);
        this.A0H = "";
        this.A08 = "";
        this.A09 = str3;
        this.A0A = str4;
        this.A07 = str5;
        this.A0D = "";
        this.A0E = "";
        this.A0F = A00;
        this.A0I = null;
        this.A0G = "";
        this.A0M = false;
        this.A0J = false;
        this.A0K = false;
        this.A0B = "";
        this.A0C = "";
        this.A06 = -1;
        this.A00 = "";
        this.A03 = null;
        this.A0L = false;
        this.A05 = null;
        this.A04 = null;
    }

    public AccountRecoverySearchAccountMethodParams(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A0H = "";
        this.A08 = "";
        this.A09 = str2;
        this.A0A = str3;
        this.A07 = str4;
        this.A0D = "";
        this.A0E = "";
        this.A0F = "messenger";
        this.A0I = null;
        this.A0G = null;
        this.A0M = false;
        this.A0J = false;
        this.A0K = false;
        this.A0B = "";
        this.A0C = "";
        this.A06 = -1;
        this.A00 = "";
        this.A0L = true;
        this.A03 = null;
        this.A05 = null;
        this.A04 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0H);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeStringList(this.A0I);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A03);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeStringList(this.A05);
        parcel.writeStringList(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
