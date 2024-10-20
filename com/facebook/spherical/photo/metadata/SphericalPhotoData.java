package com.facebook.spherical.photo.metadata;

import X.11T;
import X.4YV;
import X.4YW;
import X.AbN;
import X.C1pq;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SphericalPhotoData.class */
public final class SphericalPhotoData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(29);
    public final int A00;
    public final SphericalPhotoMetadata A01;
    public final boolean A02;

    public SphericalPhotoData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A02 = AbN.A1U(parcel);
        this.A01 = parcel.readInt() == 0 ? null : (SphericalPhotoMetadata) parcel.readParcelable(A0e);
    }

    public SphericalPhotoData(SphericalPhotoMetadata sphericalPhotoMetadata, int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = sphericalPhotoMetadata;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SphericalPhotoData)) {
                return false;
            }
            SphericalPhotoData sphericalPhotoData = (SphericalPhotoData) obj;
            if (this.A00 != sphericalPhotoData.A00 || this.A02 != sphericalPhotoData.A02 || !11T.A0O(this.A01, sphericalPhotoData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A02(this.A00 + 31, this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        4YW.A0D(parcel, this.A01, i);
    }
}
