package com.facebook.payments.checkout.configuration.model;

import X.1BL;
import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: CheckoutContentConfiguration.class */
public final class CheckoutContentConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(52);
    public final CheckoutConfigPrice A00;
    public final CheckoutEntity A01;
    public final CheckoutPayActionContent A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final ImmutableList A05;

    public CheckoutContentConfiguration(Parcel parcel) {
        this.A01 = (CheckoutEntity) 1BL.A0C(parcel, CheckoutEntity.class);
        this.A04 = C53v.A04(parcel, CheckoutItem.class);
        this.A03 = C53v.A04(parcel, CheckoutConfigPrice.class);
        this.A05 = C53v.A04(parcel, CheckoutPurchaseInfoExtension.class);
        this.A02 = (CheckoutPayActionContent) 1BL.A0C(parcel, CheckoutPayActionContent.class);
        this.A00 = (CheckoutConfigPrice) 1BL.A0C(parcel, CheckoutConfigPrice.class);
    }

    public CheckoutContentConfiguration(CheckoutConfigPrice checkoutConfigPrice, CheckoutEntity checkoutEntity, CheckoutPayActionContent checkoutPayActionContent, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3) {
        this.A01 = checkoutEntity;
        this.A04 = immutableList2;
        this.A03 = immutableList;
        this.A05 = immutableList3;
        this.A02 = checkoutPayActionContent;
        this.A00 = checkoutConfigPrice;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeList(this.A04);
        parcel.writeList(this.A03);
        parcel.writeList(this.A05);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
    }
}
