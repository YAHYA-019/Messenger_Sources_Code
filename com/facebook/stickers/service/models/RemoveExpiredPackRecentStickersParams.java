package com.facebook.stickers.service.models;

import X.DKI;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: RemoveExpiredPackRecentStickersParams.class */
public final class RemoveExpiredPackRecentStickersParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(60);
    public final ImmutableList A00;

    public RemoveExpiredPackRecentStickersParams(Parcel parcel) {
        this.A00 = DKI.A0H(parcel, String.class);
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
