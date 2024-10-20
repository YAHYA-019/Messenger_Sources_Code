package com.facebook.messaging.business.montageads.models;

import X.11T;
import X.4YV;
import X.4YW;
import X.C1pq;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MontageAdsImage.class */
public final class MontageAdsImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(37);
    public final int A00;
    public final int A01;
    public final Uri A02;

    public MontageAdsImage(Uri uri, int i, int i2) {
        this.A00 = i;
        this.A02 = uri;
        this.A01 = i2;
    }

    public MontageAdsImage(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() == 0 ? null : (Uri) parcel.readParcelable(A0e);
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageAdsImage)) {
                return false;
            }
            MontageAdsImage montageAdsImage = (MontageAdsImage) obj;
            if (this.A00 != montageAdsImage.A00 || !11T.A0O(this.A02, montageAdsImage.A02) || this.A01 != montageAdsImage.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A02, this.A00 + 31) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        4YW.A0D(parcel, this.A02, i);
        parcel.writeInt(this.A01);
    }
}
