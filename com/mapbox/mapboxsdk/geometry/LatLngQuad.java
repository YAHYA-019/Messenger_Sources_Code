package com.mapbox.mapboxsdk.geometry;

import X.0C9;
import X.1BK;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LatLngQuad.class */
public class LatLngQuad implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.geometry.LatLngQuad.1
        @Override // android.os.Parcelable.Creator
        public LatLngQuad createFromParcel(Parcel parcel) {
            return LatLngQuad.readFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            LatLngQuad readFromParcel = LatLngQuad.readFromParcel(parcel);
            synchronized (0C9.A00) {
            }
            return readFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        public LatLngQuad[] newArray(int i) {
            return new LatLngQuad[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLngQuad[i];
        }
    };
    public final LatLng bottomLeft;
    public final LatLng bottomRight;
    public final LatLng topLeft;
    public final LatLng topRight;

    public LatLngQuad(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        this.topLeft = latLng;
        this.topRight = latLng2;
        this.bottomRight = latLng3;
        this.bottomLeft = latLng4;
    }

    public static LatLngQuad readFromParcel(Parcel parcel) {
        return new LatLngQuad(new LatLng(parcel), new LatLng(parcel), new LatLng(parcel), new LatLng(parcel));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng getBottomLeft() {
        return this.bottomLeft;
    }

    public LatLng getBottomRight() {
        return this.bottomRight;
    }

    public LatLng getTopLeft() {
        return this.topLeft;
    }

    public LatLng getTopRight() {
        return this.topRight;
    }

    public int hashCode() {
        int hashCode = this.topLeft.hashCode();
        int A03 = 1BK.A03(this.topRight, hashCode ^ (hashCode >>> 31));
        int A032 = 1BK.A03(this.bottomRight, A03 ^ (A03 >>> 31));
        return 1BK.A03(this.bottomLeft, A032 ^ (A032 >>> 31));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.topLeft.writeToParcel(parcel, i);
        this.topRight.writeToParcel(parcel, i);
        this.bottomRight.writeToParcel(parcel, i);
        this.bottomLeft.writeToParcel(parcel, i);
    }
}
