package com.facebook.stickers.service.models;

import X.AbN;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: FetchRecentStickersResult.class */
public final class FetchRecentStickersResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(41);
    public final ImmutableList A00;

    public FetchRecentStickersResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, Sticker.class);
    }

    public FetchRecentStickersResult(List list) {
        this.A00 = ImmutableList.copyOf((Collection) list);
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
