package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ItemDetails;
import java.util.List;

/* loaded from: PuxOrderSummaryItem.class */
public final class PuxOrderSummaryItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(13);
    public final int A00;
    public final CurrencyAmount A01;
    public final CurrencyAmount A02;
    public final KP0 A03;
    public final ItemDetails A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public PuxOrderSummaryItem(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, KP0 kp0, ItemDetails itemDetails, String str, String str2, List list, int i, boolean z, boolean z2, boolean z3) {
        1BK.A1K(kp0, 1, list);
        4YV.A1M(currencyAmount, 6, currencyAmount2);
        11T.A0F(itemDetails, 11);
        this.A03 = kp0;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = list;
        this.A00 = i;
        this.A02 = currencyAmount;
        this.A01 = currencyAmount2;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A04 = itemDetails;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeStringList(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
    }
}
