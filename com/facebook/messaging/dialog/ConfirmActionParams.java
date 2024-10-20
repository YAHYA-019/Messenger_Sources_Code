package com.facebook.messaging.dialog;

import X.7zL;
import X.BKl;
import X.BxS;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ConfirmActionParams.class */
public final class ConfirmActionParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(37);
    public final BKl A00;
    public final BKl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public ConfirmActionParams(BxS bxS) {
        this.A06 = bxS.A07;
        this.A03 = bxS.A03;
        this.A05 = bxS.A06;
        this.A01 = bxS.A01;
        this.A04 = bxS.A04;
        this.A00 = bxS.A00;
        this.A02 = bxS.A02;
        this.A07 = bxS.A05;
    }

    public ConfirmActionParams(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readSerializable();
        this.A04 = parcel.readString();
        this.A00 = parcel.readSerializable();
        this.A02 = parcel.readString();
        this.A07 = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A01);
        parcel.writeString(this.A04);
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
    }
}
