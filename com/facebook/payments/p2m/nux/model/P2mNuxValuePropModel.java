package com.facebook.payments.p2m.nux.model;

import X.11T;
import X.7zN;
import X.AbF;
import X.C1pq;
import X.C1u3;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: P2mNuxValuePropModel.class */
public final class P2mNuxValuePropModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(73);
    public final int A00;
    public final C1u3 A01;
    public final String A02;
    public final String A03;

    public P2mNuxValuePropModel(C1u3 c1u3, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = c1u3;
        C1pq.A08("subTitle", str);
        this.A02 = str;
        AbF.A1V(str2);
        this.A03 = str2;
    }

    public P2mNuxValuePropModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = C1u3.values()[parcel.readInt()];
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof P2mNuxValuePropModel)) {
                return false;
            }
            P2mNuxValuePropModel p2mNuxValuePropModel = (P2mNuxValuePropModel) obj;
            if (this.A00 != p2mNuxValuePropModel.A00 || this.A01 != p2mNuxValuePropModel.A01 || !11T.A0O(this.A02, p2mNuxValuePropModel.A02) || !11T.A0O(this.A03, p2mNuxValuePropModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00 + 31;
        return C1pq.A04(this.A03, C1pq.A04(this.A02, (i * 31) + C3o5.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        7zN.A0z(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
