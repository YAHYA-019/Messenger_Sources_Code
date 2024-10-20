package com.facebook.location.logging;

import X.1BL;
import X.AbG;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MaxImpressionsPerInterval.class */
public final class MaxImpressionsPerInterval implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(64);
    public final int A00;
    public final long A01;

    public MaxImpressionsPerInterval(Parcel parcel) {
        AbG.A1X(this);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MaxImpressionsPerInterval)) {
                return false;
            }
            MaxImpressionsPerInterval maxImpressionsPerInterval = (MaxImpressionsPerInterval) obj;
            if (this.A01 != maxImpressionsPerInterval.A01 || this.A00 != maxImpressionsPerInterval.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1BL.A01(this.A01) + 31) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
    }
}
