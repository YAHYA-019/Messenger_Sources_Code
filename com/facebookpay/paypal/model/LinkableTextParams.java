package com.facebookpay.paypal.model;

import X.11T;
import X.1BK;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LinkableTextParams.class */
public final class LinkableTextParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(9);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public LinkableTextParams(String str, int i, int i2, String str2) {
        1BK.A1K(str, 1, str2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
    }
}
