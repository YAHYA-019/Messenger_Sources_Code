package com.facebook.stickers.service.models;

import X.AbN;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchStickerPackIdsResult.class */
public final class FetchStickerPackIdsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(45);
    public final ImmutableList A00;

    public FetchStickerPackIdsResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, String.class);
    }

    public FetchStickerPackIdsResult(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }
}
