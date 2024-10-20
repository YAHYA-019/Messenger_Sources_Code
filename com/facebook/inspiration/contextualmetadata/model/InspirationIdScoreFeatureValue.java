package com.facebook.inspiration.contextualmetadata.model;

import X.11T;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationIdScoreFeatureValue.class */
public final class InspirationIdScoreFeatureValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(28);
    public final double A00;
    public final int A01;
    public final String A02;

    public InspirationIdScoreFeatureValue(int i, String str, double d) {
        this.A01 = i;
        AbF.A1U(str);
        this.A02 = str;
        this.A00 = d;
    }

    public InspirationIdScoreFeatureValue(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this);
        this.A02 = parcel.readString();
        this.A00 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationIdScoreFeatureValue)) {
                return false;
            }
            InspirationIdScoreFeatureValue inspirationIdScoreFeatureValue = (InspirationIdScoreFeatureValue) obj;
            if (this.A01 != inspirationIdScoreFeatureValue.A01 || !11T.A0O(this.A02, inspirationIdScoreFeatureValue.A02) || this.A00 != inspirationIdScoreFeatureValue.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A00(this.A00, C1pq.A04(this.A02, this.A01 + 31));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
        parcel.writeDouble(this.A00);
    }
}
