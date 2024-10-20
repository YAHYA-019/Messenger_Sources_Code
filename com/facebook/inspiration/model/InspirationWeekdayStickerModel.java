package com.facebook.inspiration.model;

import X.11T;
import X.4YW;
import X.AbF;
import X.AbK;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationWeekdayStickerModel.class */
public final class InspirationWeekdayStickerModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(87);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public InspirationWeekdayStickerModel(Parcel parcel) {
        this.A00 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = AbN.A1U(parcel);
    }

    public InspirationWeekdayStickerModel(String str, String str2, String str3, boolean z) {
        this.A00 = str;
        AbF.A1T(str2);
        this.A01 = str2;
        C1pq.A08("imageAssetUrl", str3);
        this.A02 = str3;
        this.A03 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationWeekdayStickerModel)) {
                return false;
            }
            InspirationWeekdayStickerModel inspirationWeekdayStickerModel = (InspirationWeekdayStickerModel) obj;
            if (!11T.A0O(this.A00, inspirationWeekdayStickerModel.A00) || !11T.A0O(this.A01, inspirationWeekdayStickerModel.A01) || !11T.A0O(this.A02, inspirationWeekdayStickerModel.A02) || this.A03 != inspirationWeekdayStickerModel.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
