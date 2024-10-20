package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationLazyStickerStyleInfo.class */
public final class InspirationLazyStickerStyleInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(19);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public InspirationLazyStickerStyleInfo(int i, int i2, int i3, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        C1pq.A08("originalUri", str);
        this.A03 = str;
    }

    public InspirationLazyStickerStyleInfo(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationLazyStickerStyleInfo)) {
                return false;
            }
            InspirationLazyStickerStyleInfo inspirationLazyStickerStyleInfo = (InspirationLazyStickerStyleInfo) obj;
            if (this.A00 != inspirationLazyStickerStyleInfo.A00 || this.A01 != inspirationLazyStickerStyleInfo.A01 || this.A02 != inspirationLazyStickerStyleInfo.A02 || !11T.A0O(this.A03, inspirationLazyStickerStyleInfo.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, ((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
    }
}
