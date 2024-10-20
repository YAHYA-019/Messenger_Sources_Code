package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YW;
import X.AbH;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationStaticStickerInfo.class */
public final class InspirationStaticStickerInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(45);
    public final ImmutableList A00;
    public final String A01;

    public InspirationStaticStickerInfo(Parcel parcel) {
        this.A01 = AbK.A15(parcel, C3o5.A01(parcel, this));
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
    }

    public InspirationStaticStickerInfo(ImmutableList immutableList, String str) {
        this.A01 = str;
        C1pq.A08("imageAssetIds", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStaticStickerInfo)) {
                return false;
            }
            InspirationStaticStickerInfo inspirationStaticStickerInfo = (InspirationStaticStickerInfo) obj;
            if (!11T.A0O(this.A01, inspirationStaticStickerInfo.A01) || !11T.A0O(this.A00, inspirationStaticStickerInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
    }
}
