package com.facebook.messaging.search.lists.model;

import X.82M;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FTSMessageIndexProgress.class */
public final class FTSMessageIndexProgress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(82);
    public final int A00;
    public final int A01;

    public FTSMessageIndexProgress(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public FTSMessageIndexProgress(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FTSMessageIndexProgress)) {
                return false;
            }
            FTSMessageIndexProgress fTSMessageIndexProgress = (FTSMessageIndexProgress) obj;
            if (this.A00 != fTSMessageIndexProgress.A00 || this.A01 != fTSMessageIndexProgress.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
