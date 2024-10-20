package com.facebook.bitmaps;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Dimension.class */
public final class Dimension implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(48);
    public final int A00;
    public final int A01;

    public Dimension(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public Dimension(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof Dimension)) {
                return false;
            }
            Dimension dimension = (Dimension) obj;
            if (this.A01 != dimension.A01 || this.A00 != dimension.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
