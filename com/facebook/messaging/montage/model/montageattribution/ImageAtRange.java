package com.facebook.messaging.montage.model.montageattribution;

import X.11T;
import X.4YV;
import X.4YW;
import X.82M;
import X.C1pq;
import X.C7qy;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ImageAtRange.class */
public final class ImageAtRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(65);
    public final int A00;
    public final int A01;
    public final EntityWithImage A02;

    public ImageAtRange(C7qy c7qy) {
        this.A02 = c7qy.A02;
        this.A00 = c7qy.A00;
        this.A01 = c7qy.A01;
    }

    public ImageAtRange(Parcel parcel) {
        this.A02 = parcel.readInt() == 0 ? null : (EntityWithImage) parcel.readParcelable(4YV.A0e(this));
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public ImageAtRange(EntityWithImage entityWithImage, int i, int i2) {
        this.A02 = entityWithImage;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ImageAtRange)) {
                return false;
            }
            ImageAtRange imageAtRange = (ImageAtRange) obj;
            if (!11T.A0O(this.A02, imageAtRange.A02) || this.A00 != imageAtRange.A00 || this.A01 != imageAtRange.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C1pq.A03(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
