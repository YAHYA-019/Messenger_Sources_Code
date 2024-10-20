package com.facebook.messaging.locationpermission;

import X.11T;
import X.4YW;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSV;
import X.DKH;
import X.DKI;
import X.GOq;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LocationPermissionRequest.class */
public final class LocationPermissionRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(8);
    public final Integer A00;
    public final String A01;
    public final boolean A02;

    public LocationPermissionRequest(Parcel parcel) {
        this.A02 = DKI.A0k(parcel, this);
        this.A01 = DKH.A0l(parcel);
        this.A00 = 7zU.A0e(parcel, 2);
    }

    public LocationPermissionRequest(Integer num, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LocationPermissionRequest)) {
                return false;
            }
            LocationPermissionRequest locationPermissionRequest = (LocationPermissionRequest) obj;
            if (this.A02 != locationPermissionRequest.A02 || !11T.A0O(this.A01, locationPermissionRequest.A01) || this.A00 != locationPermissionRequest.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A01, C1pq.A05(this.A02));
        return (A04 * 31) + C3o5.A04(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LocationPermissionRequest{backgroundCollectionRequired=");
        A0k.append(this.A02);
        A0k.append(", entryPoint=");
        A0k.append(this.A01);
        A0k.append(", source=");
        Integer num = this.A00;
        return GOq.A12(num != null ? 1 - num.intValue() != 0 ? "LOCATION_SHARING" : "LOCATION_PICKER" : "null", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        4YW.A0E(parcel, this.A01);
        parcel.writeInt(this.A00.intValue());
    }
}
