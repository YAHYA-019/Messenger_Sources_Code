package com.facebook.payments.checkout.configuration.model;

import X.AbN;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.form.model.FormRowDefinition;
import com.google.common.collect.ImmutableList;

/* loaded from: CheckoutCustomOption.class */
public final class CheckoutCustomOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(53);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public CheckoutCustomOption(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = AbN.A0e(parcel, FormRowDefinition.class);
        this.A02 = parcel.readString();
    }

    public CheckoutCustomOption(ImmutableList immutableList, String str, String str2, String str3) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = immutableList;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeList(this.A00);
        parcel.writeString(this.A02);
    }
}
