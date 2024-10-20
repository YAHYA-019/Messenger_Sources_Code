package com.facebook.account.recovery.common.protocol;

import X.1BK;
import X.C53v;
import X.DKF;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: AccountRecoverySendConfirmationCodeMethod$Params.class */
public final class AccountRecoverySendConfirmationCodeMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(70);
    public int A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    public AccountRecoverySendConfirmationCodeMethod$Params(Parcel parcel) {
        this.A09 = parcel.readString();
        this.A0B = parcel.createStringArrayList();
        this.A0A = parcel.readString();
        this.A08 = parcel.readString();
        this.A01 = Boolean.valueOf(C53v.A0S(parcel));
        this.A03 = Boolean.valueOf(C53v.A0S(parcel));
        this.A07 = parcel.readString();
        this.A04 = Boolean.valueOf(C53v.A0S(parcel));
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A02 = Boolean.valueOf(C53v.A0S(parcel));
        this.A00 = parcel.readInt();
    }

    public AccountRecoverySendConfirmationCodeMethod$Params(String str, String str2, List list) {
        this.A09 = str;
        this.A0B = list;
        this.A0A = str2;
        this.A08 = null;
        Boolean A0d = 1BK.A0d();
        this.A01 = A0d;
        this.A03 = A0d;
        this.A07 = "";
        this.A04 = A0d;
        this.A05 = null;
        this.A06 = "";
        this.A02 = A0d;
        this.A00 = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeStringList(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        DKF.A1C(parcel, this.A01);
        DKF.A1C(parcel, this.A03);
        parcel.writeString(this.A07);
        DKF.A1C(parcel, this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        DKF.A1C(parcel, this.A02);
        parcel.writeInt(this.A00);
    }
}
