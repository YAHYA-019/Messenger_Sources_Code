package com.facebook.payments.checkout.configuration.model;

import X.1BL;
import X.AbN;
import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: CheckoutOptionsPurchaseInfoExtension.class */
public final class CheckoutOptionsPurchaseInfoExtension implements CheckoutPurchaseInfoExtension {
    public static final Parcelable.Creator CREATOR = FKY.A00(62);
    public final CheckoutCustomOption A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public CheckoutOptionsPurchaseInfoExtension(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = AbN.A0e(parcel, String.class);
        this.A01 = AbN.A0e(parcel, CheckoutOption.class);
        this.A07 = C53v.A0S(parcel);
        this.A08 = C53v.A0S(parcel);
        this.A00 = (CheckoutCustomOption) 1BL.A0C(parcel, CheckoutCustomOption.class);
        this.A09 = C53v.A0S(parcel);
    }

    public CheckoutOptionsPurchaseInfoExtension(CheckoutCustomOption checkoutCustomOption, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A05 = str3;
        this.A06 = str4;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = immutableList2;
        this.A01 = immutableList;
        this.A07 = z;
        this.A08 = z2;
        this.A00 = checkoutCustomOption;
        this.A09 = z3;
        boolean z4 = true;
        if (immutableList2.size() > 1 && !z) {
            z4 = false;
        }
        Preconditions.checkArgument(z4, "Multiple options can be preselected only when multi-selection is allowed.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeList(this.A02);
        parcel.writeList(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A09 ? 1 : 0);
    }
}
