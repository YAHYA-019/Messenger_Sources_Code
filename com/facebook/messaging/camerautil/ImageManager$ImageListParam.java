package com.facebook.messaging.camerautil;

import X.BL9;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ImageManager$ImageListParam.class */
public final class ImageManager$ImageListParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(47);
    public int A00;
    public int A01;
    public Uri A02;
    public BL9 A03;
    public String A04;
    public boolean A05;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("ImageListParam{loc=%s,inc=%d,sort=%d,bucket=%s,empty=%b,single=%s}", this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A04, Boolean.valueOf(this.A05), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03.ordinal());
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
