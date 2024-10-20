package com.facebook.messaging.media.photoquality;

import X.11T;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PhotoQuality.class */
public final class PhotoQuality implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(24);
    public final int A00;
    public final int A01;

    public PhotoQuality(int i) {
        this.A01 = i;
        this.A00 = Math.min(Math.max((int) (((i - 960) * (-0.015625f)) + 85.0f), 55), 95);
    }

    public PhotoQuality(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public PhotoQuality(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
