package com.mapbox.mapboxsdk.geometry;

import X.0C9;
import X.AnonymousClass002;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LatLngSpan.class */
public class LatLngSpan implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.geometry.LatLngSpan.1
        @Override // android.os.Parcelable.Creator
        public LatLngSpan createFromParcel(Parcel parcel) {
            return new LatLngSpan(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            LatLngSpan latLngSpan = new LatLngSpan(parcel);
            synchronized (0C9.A00) {
            }
            return latLngSpan;
        }

        @Override // android.os.Parcelable.Creator
        public LatLngSpan[] newArray(int i) {
            return new LatLngSpan[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLngSpan[i];
        }
    };
    public double mLatitudeSpan;
    public double mLongitudeSpan;

    public LatLngSpan(double d, double d2) {
        this.mLatitudeSpan = d;
        this.mLongitudeSpan = d2;
    }

    public LatLngSpan(Parcel parcel) {
        this.mLatitudeSpan = parcel.readDouble();
        this.mLongitudeSpan = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LatLngSpan)) {
                return false;
            }
            LatLngSpan latLngSpan = (LatLngSpan) obj;
            if (this.mLongitudeSpan != latLngSpan.mLongitudeSpan || this.mLatitudeSpan != latLngSpan.mLatitudeSpan) {
                return false;
            }
        }
        return true;
    }

    public double getLatitudeSpan() {
        return this.mLatitudeSpan;
    }

    public double getLongitudeSpan() {
        return this.mLongitudeSpan;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mLatitudeSpan);
        return AnonymousClass002.A03(Double.doubleToLongBits(this.mLongitudeSpan), ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31);
    }

    public void setLatitudeSpan(double d) {
        this.mLatitudeSpan = d;
    }

    public void setLongitudeSpan(double d) {
        this.mLongitudeSpan = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitudeSpan);
        parcel.writeDouble(this.mLongitudeSpan);
    }
}
