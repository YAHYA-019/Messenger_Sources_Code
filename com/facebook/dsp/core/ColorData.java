package com.facebook.dsp.core;

import X.11T;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ColorData.class */
public final class ColorData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(5);
    public final int A00;
    public final int A01;

    public ColorData(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
