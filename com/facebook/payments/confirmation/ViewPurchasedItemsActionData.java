package com.facebook.payments.confirmation;

import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ViewPurchasedItemsActionData.class */
public final class ViewPurchasedItemsActionData implements Parcelable, PostPurchaseActionSpec$PostPurchaseActionData {
    public static final Parcelable.Creator CREATOR = FKZ.A00(32);
    public final int A00;

    public ViewPurchasedItemsActionData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ViewPurchasedItemsActionData) && this.A00 == ((ViewPurchasedItemsActionData) obj).A00);
    }

    public int hashCode() {
        return this.A00 + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }
}
