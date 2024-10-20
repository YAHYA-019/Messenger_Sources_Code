package com.facebook.stickers.service.models;

import X.AbN;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: StickerSearchResult.class */
public final class StickerSearchResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(63);
    public final ImmutableList A00;

    public StickerSearchResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, Sticker.class);
    }

    public StickerSearchResult(List list) {
        this.A00 = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
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
