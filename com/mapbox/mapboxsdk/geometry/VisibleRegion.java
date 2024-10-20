package com.mapbox.mapboxsdk.geometry;

import X.0C9;
import X.1BL;
import X.AnonymousClass001;
import X.JQy;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.DexStore;

/* loaded from: VisibleRegion.class */
public class VisibleRegion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.geometry.VisibleRegion.1
        @Override // android.os.Parcelable.Creator
        public VisibleRegion createFromParcel(Parcel parcel) {
            return new VisibleRegion(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            VisibleRegion visibleRegion = new VisibleRegion(parcel);
            synchronized (0C9.A00) {
            }
            return visibleRegion;
        }

        @Override // android.os.Parcelable.Creator
        public VisibleRegion[] newArray(int i) {
            return new VisibleRegion[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VisibleRegion[i];
        }
    };
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    public VisibleRegion(Parcel parcel) {
        this.farLeft = (LatLng) 1BL.A0C(parcel, LatLng.class);
        this.farRight = (LatLng) 1BL.A0C(parcel, LatLng.class);
        this.nearLeft = (LatLng) 1BL.A0C(parcel, LatLng.class);
        this.nearRight = (LatLng) 1BL.A0C(parcel, LatLng.class);
        this.latLngBounds = (LatLngBounds) 1BL.A0C(parcel, LatLngBounds.class);
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.farLeft = latLng;
        this.farRight = latLng2;
        this.nearLeft = latLng3;
        this.nearRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof VisibleRegion) {
            if (obj == this) {
                return true;
            }
            VisibleRegion visibleRegion = (VisibleRegion) obj;
            if (this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight)) {
                z = JQy.A1Z(this.latLngBounds, visibleRegion.latLngBounds);
            }
        }
        return z;
    }

    public int hashCode() {
        return this.farLeft.hashCode() + 90 + ((this.farRight.hashCode() + 90) * 1000) + ((this.nearLeft.hashCode() + 180) * DexStore.MS_IN_NS) + ((this.nearRight.hashCode() + 180) * 1000000000);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[farLeft [");
        A0k.append(this.farLeft);
        A0k.append("], farRight [");
        A0k.append(this.farRight);
        A0k.append("], nearLeft [");
        A0k.append(this.nearLeft);
        A0k.append("], nearRight [");
        A0k.append(this.nearRight);
        A0k.append("], latLngBounds [");
        A0k.append(this.latLngBounds);
        return AnonymousClass001.A0d("]]", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.farLeft, i);
        parcel.writeParcelable(this.farRight, i);
        parcel.writeParcelable(this.nearLeft, i);
        parcel.writeParcelable(this.nearRight, i);
        parcel.writeParcelable(this.latLngBounds, i);
    }
}
