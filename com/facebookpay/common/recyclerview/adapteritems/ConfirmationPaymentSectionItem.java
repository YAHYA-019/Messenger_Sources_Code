package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.7zT;
import X.FKb;
import X.KP0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ConfirmationPaymentSectionItem.class */
public final class ConfirmationPaymentSectionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = FKb.A00(98);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final KP0 A05;

    public ConfirmationPaymentSectionItem(KP0 kp0, String str, String str2, String str3, String str4, String str5) {
        7zT.A1T(kp0, str, str3);
        11T.A0F(str4, 5);
        this.A05 = kp0;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A04 = str5;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
    }
}
