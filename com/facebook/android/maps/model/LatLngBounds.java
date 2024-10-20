package com.facebook.android.maps.model;

import X.1BK;
import X.1BL;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JR1;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LatLngBounds.class */
public final class LatLngBounds implements Parcelable {
    public static final LatLngBounds A02 = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = LGo.A00(97);
    public final LatLng A00;
    public final LatLng A01;

    public LatLngBounds(Parcel parcel) {
        this.A00 = (LatLng) 1BL.A0C(parcel, LatLng.class);
        this.A01 = (LatLng) 1BL.A0C(parcel, LatLng.class);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        double d = latLng.A00;
        double d2 = latLng2.A00;
        if (d <= d2) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Southern latitude (");
        A0k.append(d);
        A0k.append(") exceeds Northern latitude (");
        A0k.append(d2);
        throw AnonymousClass002.A0D(").", A0k);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LatLngBounds)) {
                return false;
            }
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            if (this.A00.equals(latLngBounds.A00) && this.A01.equals(latLngBounds.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AbstractC2327GOs.A08(this.A00));
    }

    public String toString() {
        StringBuilder A10 = JR1.A10(this);
        A10.append("{northeast=");
        A10.append(this.A00);
        A10.append(", southwest=");
        return AbstractC2327GOs.A0U(this.A01, A10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
