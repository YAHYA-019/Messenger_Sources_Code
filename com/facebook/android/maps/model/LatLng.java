package com.facebook.android.maps.model;

import X.1BL;
import X.JQx;
import X.JR1;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LatLng.class */
public final class LatLng implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(96);
    public final double A00;
    public final double A01;

    public LatLng(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public LatLng(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LatLng)) {
                return false;
            }
            LatLng latLng = (LatLng) obj;
            if (JQx.A01(this.A00, latLng.A00) < 0.002d && JQx.A01(this.A01, latLng.A01) < 2.0E-4d) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public String toString() {
        StringBuilder A10 = JR1.A10(this);
        A10.append("{latitude=");
        A10.append(this.A00);
        A10.append(", longitude=");
        A10.append(this.A01);
        return 1BL.A0v(A10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }
}
