package com.facebook.stickers.service.models;

import X.AbN;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: FetchStickersByPackIdResult.class */
public final class FetchStickersByPackIdResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(57);
    public final ImmutableList A00;

    public FetchStickersByPackIdResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, Sticker.class);
    }

    public FetchStickersByPackIdResult(Collection collection) {
        this.A00 = collection != null ? ImmutableList.copyOf(collection) : ImmutableList.of();
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
