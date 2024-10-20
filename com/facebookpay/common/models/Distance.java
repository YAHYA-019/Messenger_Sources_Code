package com.facebookpay.common.models;

import X.11T;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Distance.class */
public final class Distance implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(91);
    public final double A00;
    public final Integer A01;

    public Distance(Integer num, double d) {
        this.A00 = d;
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeString(1 - this.A01.intValue() != 0 ? "MILES" : "KILOMETERS");
    }
}
