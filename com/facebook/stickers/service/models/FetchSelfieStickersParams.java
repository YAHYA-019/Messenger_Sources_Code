package com.facebook.stickers.service.models;

import X.C1pq;
import X.DKI;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchSelfieStickersParams.class */
public final class FetchSelfieStickersParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(42);
    public final boolean A00;

    public FetchSelfieStickersParams(Parcel parcel) {
        this.A00 = DKI.A0k(parcel, this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FetchSelfieStickersParams) && this.A00 == ((FetchSelfieStickersParams) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
