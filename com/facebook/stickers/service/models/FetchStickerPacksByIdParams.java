package com.facebook.stickers.service.models;

import X.AbN;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.StickerPack;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: FetchStickerPacksByIdParams.class */
public final class FetchStickerPacksByIdParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(49);
    public final ImmutableList A00;

    public FetchStickerPacksByIdParams(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, StickerPack.class);
    }

    public FetchStickerPacksByIdParams(Collection collection) {
        this.A00 = ImmutableList.copyOf(collection);
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
