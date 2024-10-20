package com.facebook.messaging.montage.model.montageattribution;

import X.11T;
import X.4YV;
import X.4YW;
import X.82M;
import X.C1pq;
import X.C7o4;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EntityWithImage.class */
public final class EntityWithImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(63);
    public final Image A00;

    public EntityWithImage(C7o4 c7o4) {
        this.A00 = c7o4.A00;
    }

    public EntityWithImage(Parcel parcel) {
        this.A00 = parcel.readInt() == 0 ? null : (Image) parcel.readParcelable(4YV.A0e(this));
    }

    public EntityWithImage(Image image) {
        this.A00 = image;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EntityWithImage) && 11T.A0O(this.A00, ((EntityWithImage) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A00, i);
    }
}
