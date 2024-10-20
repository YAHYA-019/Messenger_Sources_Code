package com.google.android.material.timepicker;

import X.JR0;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TimeModel.class */
public final class TimeModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(81);
    public int A00;
    public int A01;
    public int A02;
    public final int A03;

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof TimeModel)) {
                return false;
            }
            TimeModel timeModel = (TimeModel) obj;
            if (this.A00 == timeModel.A00 && this.A01 == timeModel.A01 && this.A03 == timeModel.A03 && this.A02 == timeModel.A02) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0N(Integer.valueOf(this.A03), Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
    }
}
