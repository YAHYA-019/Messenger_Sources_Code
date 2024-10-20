package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationStickerAssetModel.class */
public final class InspirationStickerAssetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(65);
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public InspirationStickerAssetModel(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A04 = C3o5.A0O(parcel);
        this.A05 = parcel.readString();
    }

    public InspirationStickerAssetModel(String str, String str2, String str3, String str4, double d, double d2) {
        AbF.A1T(str);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = d;
        this.A01 = d2;
        this.A04 = str3;
        C1pq.A08("stickerUri", str4);
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStickerAssetModel)) {
                return false;
            }
            InspirationStickerAssetModel inspirationStickerAssetModel = (InspirationStickerAssetModel) obj;
            if (!11T.A0O(this.A02, inspirationStickerAssetModel.A02) || !11T.A0O(this.A03, inspirationStickerAssetModel.A03) || this.A00 != inspirationStickerAssetModel.A00 || this.A01 != inspirationStickerAssetModel.A01 || !11T.A0O(this.A04, inspirationStickerAssetModel.A04) || !11T.A0O(this.A05, inspirationStickerAssetModel.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A00(this.A01, C1pq.A00(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
    }
}
