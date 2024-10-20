package com.facebook.ipc.composer.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AdsAnimatorConfiguration.class */
public final class AdsAnimatorConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(87);
    public final int A00;
    public final int A01;
    public final String A02;

    public AdsAnimatorConfiguration(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        C1pq.A08("pageId", str);
        this.A02 = str;
    }

    public AdsAnimatorConfiguration(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdsAnimatorConfiguration)) {
                return false;
            }
            AdsAnimatorConfiguration adsAnimatorConfiguration = (AdsAnimatorConfiguration) obj;
            if (this.A00 != adsAnimatorConfiguration.A00 || this.A01 != adsAnimatorConfiguration.A01 || !11T.A0O(this.A02, adsAnimatorConfiguration.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, ((this.A00 + 31) * 31) + this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
    }
}
