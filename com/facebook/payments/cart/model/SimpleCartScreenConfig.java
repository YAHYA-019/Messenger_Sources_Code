package com.facebook.payments.cart.model;

import X.1BL;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SimpleCartScreenConfig.class */
public final class SimpleCartScreenConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(49);
    public final CatalogItemsConfig A00;
    public final CustomItemsConfig A01;
    public final String A02;
    public final String A03;
    public final int A04;
    public final Parcelable A05;
    public final InvoiceConfirmationCreationConfig A06;

    public SimpleCartScreenConfig(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readInt();
        this.A01 = (CustomItemsConfig) 1BL.A0C(parcel, CustomItemsConfig.class);
        this.A00 = (CatalogItemsConfig) 1BL.A0C(parcel, CatalogItemsConfig.class);
        this.A06 = (InvoiceConfirmationCreationConfig) 1BL.A0C(parcel, InvoiceConfirmationCreationConfig.class);
        this.A05 = 1BL.A0C(parcel, getClass());
    }

    public SimpleCartScreenConfig(Parcelable parcelable, CatalogItemsConfig catalogItemsConfig, CustomItemsConfig customItemsConfig, InvoiceConfirmationCreationConfig invoiceConfirmationCreationConfig, String str, String str2, int i) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = i;
        this.A01 = customItemsConfig;
        this.A00 = catalogItemsConfig;
        this.A06 = invoiceConfirmationCreationConfig;
        this.A05 = parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A05, i);
    }
}
