package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationStickerLocationInfo.class */
public final class InspirationStickerLocationInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(48);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public InspirationStickerLocationInfo(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
    }

    public InspirationStickerLocationInfo(String str, String str2, String str3, int i) {
        C1pq.A08("locationContent", str);
        this.A01 = str;
        C1pq.A08("locationId", str2);
        this.A02 = str2;
        this.A00 = i;
        C1pq.A08("locationPlaceTopicId", str3);
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStickerLocationInfo)) {
                return false;
            }
            InspirationStickerLocationInfo inspirationStickerLocationInfo = (InspirationStickerLocationInfo) obj;
            if (!11T.A0O(this.A01, inspirationStickerLocationInfo.A01) || !11T.A0O(this.A02, inspirationStickerLocationInfo.A02) || this.A00 != inspirationStickerLocationInfo.A00 || !11T.A0O(this.A03, inspirationStickerLocationInfo.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, (C1pq.A04(this.A02, C1pq.A03(this.A01)) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
    }
}
