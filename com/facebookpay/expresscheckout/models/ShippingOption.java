package com.facebookpay.expresscheckout.models;

import X.11T;
import X.7zT;
import X.KwM;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: ShippingOption.class */
public final class ShippingOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(56);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Integer A04;

    public ShippingOption(CurrencyAmount currencyAmount, Integer num, String str, String str2, String str3) {
        7zT.A1W(str, num, str2, currencyAmount);
        11T.A0F(str3, 5);
        this.A02 = str;
        this.A04 = num;
        this.A03 = str2;
        this.A00 = currencyAmount;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(KwM.A01(this.A04));
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
