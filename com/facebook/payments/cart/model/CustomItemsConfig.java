package com.facebook.payments.cart.model;

import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: CustomItemsConfig.class */
public final class CustomItemsConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(45);
    public final int A00;
    public final ImmutableMap A01;
    public final String A02;

    public CustomItemsConfig(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = C53v.A05(parcel);
    }

    public CustomItemsConfig(ImmutableMap immutableMap, String str, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = immutableMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeMap(this.A01);
    }
}
