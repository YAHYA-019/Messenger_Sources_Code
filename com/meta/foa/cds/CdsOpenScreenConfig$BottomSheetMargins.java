package com.meta.foa.cds;

import X.11T;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CdsOpenScreenConfig$BottomSheetMargins.class */
public final class CdsOpenScreenConfig$BottomSheetMargins implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGm(97);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public CdsOpenScreenConfig$BottomSheetMargins(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}
