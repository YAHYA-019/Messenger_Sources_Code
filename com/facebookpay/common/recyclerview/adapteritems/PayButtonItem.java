package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: PayButtonItem.class */
public final class PayButtonItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(7);
    public final CurrencyAmount A00;
    public final KP0 A01;
    public final String A02;
    public final boolean A03;

    public PayButtonItem(CurrencyAmount currencyAmount, KP0 kp0, String str, boolean z) {
        11T.A0F(kp0, 1);
        this.A01 = kp0;
        this.A00 = currencyAmount;
        this.A03 = z;
        this.A02 = str;
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
