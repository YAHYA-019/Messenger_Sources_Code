package com.facebook.payments.checkout.configuration.model;

import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: CheckoutOption.class */
public final class CheckoutOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(61);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public CheckoutOption(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = C53v.A0S(parcel);
        this.A00 = C53v.A04(parcel, CheckoutConfigPrice.class);
    }

    public CheckoutOption(ImmutableList immutableList, String str, String str2, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeList(this.A00);
    }
}
