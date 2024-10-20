package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zR;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ItemDetails;

/* loaded from: PuxEntityItem.class */
public final class PuxEntityItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(11);
    public final CurrencyAmount A00;
    public final ItemDetails A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final KP0 A06;
    public final String A07;

    public PuxEntityItem(CurrencyAmount currencyAmount, KP0 kp0, ItemDetails itemDetails, String str, String str2, String str3, String str4, String str5) {
        7zR.A1N(kp0, str2);
        4YV.A1M(itemDetails, 5, currencyAmount);
        this.A06 = kp0;
        this.A07 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = itemDetails;
        this.A05 = str4;
        this.A00 = currencyAmount;
        this.A03 = str5;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }
}
