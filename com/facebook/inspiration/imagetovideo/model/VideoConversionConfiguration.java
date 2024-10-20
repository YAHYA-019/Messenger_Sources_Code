package com.facebook.inspiration.imagetovideo.model;

import X.11T;
import X.4YW;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoConversionConfiguration.class */
public final class VideoConversionConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(37);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public VideoConversionConfiguration(int i, int i2, int i3, int i4, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = str;
    }

    public VideoConversionConfiguration(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = DKH.A0l(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoConversionConfiguration)) {
                return false;
            }
            VideoConversionConfiguration videoConversionConfiguration = (VideoConversionConfiguration) obj;
            if (this.A00 != videoConversionConfiguration.A00 || this.A01 != videoConversionConfiguration.A01 || this.A02 != videoConversionConfiguration.A02 || this.A03 != videoConversionConfiguration.A03 || !11T.A0O(this.A04, videoConversionConfiguration.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, ((((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        4YW.A0E(parcel, this.A04);
    }
}
