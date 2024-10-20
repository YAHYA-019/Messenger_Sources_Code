package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbF;
import X.AbH;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationStaticStickerModel.class */
public final class InspirationStaticStickerModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(64);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public InspirationStaticStickerModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        int readInt = parcel.readInt();
        InspirationStickerAssetModel[] inspirationStickerAssetModelArr = new InspirationStickerAssetModel[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationStickerAssetModelArr, i2);
        }
        this.A00 = ImmutableList.copyOf(inspirationStickerAssetModelArr);
        this.A04 = DKH.A0l(parcel);
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        while (i < readInt2) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A01 = ImmutableList.copyOf(strArr);
    }

    public InspirationStaticStickerModel(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3) {
        C1pq.A08("bloksStickerStyleString", str);
        this.A02 = str;
        AbF.A1T(str2);
        this.A03 = str2;
        C1pq.A08("stickerAssets", immutableList);
        this.A00 = immutableList;
        this.A04 = str3;
        C1pq.A08("stickerTags", immutableList2);
        this.A01 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStaticStickerModel)) {
                return false;
            }
            InspirationStaticStickerModel inspirationStaticStickerModel = (InspirationStaticStickerModel) obj;
            if (!11T.A0O(this.A02, inspirationStaticStickerModel.A02) || !11T.A0O(this.A03, inspirationStaticStickerModel.A03) || !11T.A0O(this.A00, inspirationStaticStickerModel.A00) || !11T.A0O(this.A04, inspirationStaticStickerModel.A04) || !11T.A0O(this.A01, inspirationStaticStickerModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationStickerAssetModel) A0b.next(), i);
        }
        4YW.A0E(parcel, this.A04);
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
    }
}
