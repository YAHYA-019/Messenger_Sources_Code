package com.facebook.messaging.blocking;

import X.7zS;
import X.AbK;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AdManageBlockingParam.class */
public final class AdManageBlockingParam extends ManageBlockingParam {
    public static final Parcelable.Creator CREATOR = CSW.A00(1);
    public final ThreadKey A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public AdManageBlockingParam(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = 7zS.A1Z(parcel);
        this.A00 = AbK.A0X(parcel);
    }

    public AdManageBlockingParam(ThreadKey threadKey, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A05 = str5;
        this.A03 = str3;
        this.A06 = str6;
        this.A02 = str2;
        this.A01 = str;
        this.A04 = str4;
        this.A07 = z;
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }
}
