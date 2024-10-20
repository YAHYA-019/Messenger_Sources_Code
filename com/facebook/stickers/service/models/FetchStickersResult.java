package com.facebook.stickers.service.models;

import X.4YV;
import X.82N;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: FetchStickersResult.class */
public final class FetchStickersResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(9);
    public final ImmutableList A00;

    public FetchStickersResult(Parcel parcel) {
        this.A00 = ImmutableList.copyOf((Collection) 4YV.A0y(parcel, Sticker.class));
    }

    public FetchStickersResult(List list) {
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
