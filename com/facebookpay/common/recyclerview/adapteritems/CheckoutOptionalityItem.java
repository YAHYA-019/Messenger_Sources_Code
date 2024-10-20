package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.FKb;
import X.KP0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutOptionalityItem.class */
public final class CheckoutOptionalityItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = FKb.A00(97);
    public final String A00;
    public final KP0 A01;

    public CheckoutOptionalityItem(KP0 kp0, String str) {
        1BL.A1F(kp0, str);
        this.A01 = kp0;
        this.A00 = str;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A01);
        parcel.writeString(this.A00);
    }
}