package com.facebook.stickers.service.models;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YT;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKe;
import X.RHB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.selfiestickers.model.SelfieStickerItem;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchSelfieStickersResult.class */
public final class FetchSelfieStickersResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(43);
    public final ImmutableList A00;

    public FetchSelfieStickersResult(RHB rhb) {
        ImmutableList immutableList = rhb.A00;
        C1pq.A08(4YT.A00(1460), immutableList);
        this.A00 = immutableList;
    }

    public FetchSelfieStickersResult(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        SelfieStickerItem[] selfieStickerItemArr = new SelfieStickerItem[A01];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A01) {
                this.A00 = ImmutableList.copyOf(selfieStickerItemArr);
                return;
            }
            i = DKG.A02(parcel, SelfieStickerItem.CREATOR, selfieStickerItemArr, i2);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FetchSelfieStickersResult) && 11T.A0O(this.A00, ((FetchSelfieStickersResult) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            ((SelfieStickerItem) A0b.next()).writeToParcel(parcel, i);
        }
    }
}
