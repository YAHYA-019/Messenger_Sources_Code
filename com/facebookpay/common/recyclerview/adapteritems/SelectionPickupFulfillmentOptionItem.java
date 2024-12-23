package com.facebookpay.common.recyclerview.adapteritems;

import X.7zT;
import X.KP0;
import X.LGp;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.Date;

/* loaded from: SelectionPickupFulfillmentOptionItem.class */
public final class SelectionPickupFulfillmentOptionItem extends SelectionFulfillmentOptionItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(27);
    public Integer A00;
    public final CurrencyAmount A01;
    public final Distance A02;
    public final KP0 A03;
    public final ShippingAddress A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Date A09;
    public final Date A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionPickupFulfillmentOptionItem(CurrencyAmount currencyAmount, Distance distance, KP0 kp0, ShippingAddress shippingAddress, Boolean bool, Integer num, String str, String str2, String str3, Date date, Date date2, boolean z) {
        super(currencyAmount, kp0, num, str, str2, str3);
        7zT.A1W(kp0, num, str, str2);
        this.A03 = kp0;
        this.A00 = num;
        this.A07 = str;
        this.A08 = str2;
        this.A01 = currencyAmount;
        this.A06 = str3;
        this.A0A = date;
        this.A09 = date2;
        this.A04 = shippingAddress;
        this.A05 = bool;
        this.A02 = distance;
        this.A0B = z;
    }
}
