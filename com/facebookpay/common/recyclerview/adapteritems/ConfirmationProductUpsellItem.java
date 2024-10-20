package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.FKb;
import X.KP0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ConfirmationProductUpsellItem.class */
public final class ConfirmationProductUpsellItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = FKb.A00(99);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final KP0 A04;

    public ConfirmationProductUpsellItem(KP0 kp0, String str, String str2, String str3, String str4) {
        1BL.A1H(kp0, str, str2);
        11T.A0F(str4, 5);
        this.A04 = kp0;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
