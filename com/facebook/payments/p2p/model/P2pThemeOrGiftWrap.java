package com.facebook.payments.p2p.model;

import X.1BL;
import X.C53v;
import X.FKZ;
import X.Qnz;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: P2pThemeOrGiftWrap.class */
public final class P2pThemeOrGiftWrap implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(91);
    public final Qnz A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final Uri A04;
    public final Uri A05;
    public final Uri A06;
    public final Uri A07;

    public P2pThemeOrGiftWrap(Parcel parcel) {
        this.A03 = parcel.readInt();
        Qnz A07 = C53v.A07(parcel, Qnz.class);
        A07.getClass();
        this.A00 = A07;
        this.A07 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A02 = parcel.readString();
        this.A04 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A06 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A05 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        C53v.A0J(parcel, this.A00);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A01);
    }
}
