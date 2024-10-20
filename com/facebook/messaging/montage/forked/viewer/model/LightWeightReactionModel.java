package com.facebook.messaging.montage.forked.viewer.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LightWeightReactionModel.class */
public final class LightWeightReactionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(91);
    public final int A00;
    public final long A01;
    public final String A02;

    public LightWeightReactionModel(int i, String str, long j) {
        this.A00 = i;
        C1pq.A08("reaction", str);
        this.A02 = str;
        this.A01 = j;
    }

    public LightWeightReactionModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A02 = parcel.readString();
        this.A01 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LightWeightReactionModel)) {
                return false;
            }
            LightWeightReactionModel lightWeightReactionModel = (LightWeightReactionModel) obj;
            if (this.A00 != lightWeightReactionModel.A00 || !11T.A0O(this.A02, lightWeightReactionModel.A02) || this.A01 != lightWeightReactionModel.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A02, this.A00 + 31), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A01);
    }
}
