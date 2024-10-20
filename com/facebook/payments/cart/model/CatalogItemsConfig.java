package com.facebook.payments.cart.model;

import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CatalogItemsConfig.class */
public final class CatalogItemsConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(44);
    public final boolean A00;

    public CatalogItemsConfig(Parcel parcel) {
        this.A00 = C53v.A0S(parcel);
    }

    public CatalogItemsConfig(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
