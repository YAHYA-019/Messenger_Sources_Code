package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationOverlayProductInfo.class */
public final class InspirationOverlayProductInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(33);
    public final int A00;
    public final String A01;
    public final String A02;

    public InspirationOverlayProductInfo(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public InspirationOverlayProductInfo(String str, String str2, int i) {
        C1pq.A08("productID", str);
        this.A01 = str;
        C1pq.A08("productTitle", str2);
        this.A02 = str2;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayProductInfo)) {
                return false;
            }
            InspirationOverlayProductInfo inspirationOverlayProductInfo = (InspirationOverlayProductInfo) obj;
            if (!11T.A0O(this.A01, inspirationOverlayProductInfo.A01) || !11T.A0O(this.A02, inspirationOverlayProductInfo.A02) || this.A00 != inspirationOverlayProductInfo.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A02, C1pq.A03(this.A01)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }
}
