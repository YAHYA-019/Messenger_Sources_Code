package com.facebook.android.maps.model;

import X.1BL;
import X.JR1;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CameraPosition.class */
public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(95);
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    public CameraPosition(Parcel parcel) {
        this.A03 = (LatLng) 1BL.A0C(parcel, LatLng.class);
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this.A03 = latLng;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CameraPosition)) {
                return false;
            }
            CameraPosition cameraPosition = (CameraPosition) obj;
            if (this.A00 == cameraPosition.A00) {
                LatLng latLng = this.A03;
                LatLng latLng2 = cameraPosition.A03;
                if (latLng == null) {
                    if (latLng2 == null) {
                        return true;
                    }
                } else if (latLng.equals(latLng2) && this.A01 == cameraPosition.A01 && this.A02 == cameraPosition.A02) {
                    return true;
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((((((this.A03 != null ? 527.0f + r0.hashCode() : 17.0f) * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public String toString() {
        StringBuilder A10 = JR1.A10(this);
        A10.append("{target=");
        A10.append(this.A03);
        A10.append(", zoom=");
        A10.append(this.A02);
        A10.append(", tilt=");
        A10.append(this.A01);
        A10.append(", bearing=");
        A10.append(this.A00);
        return 1BL.A0v(A10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }
}
