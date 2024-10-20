package com.facebookpay.common.recyclerview.adapteritems;

import X.7zT;
import X.KP0;
import X.LGp;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import java.util.Date;

/* loaded from: SelectionShippingFulfillmentOptionItem.class */
public final class SelectionShippingFulfillmentOptionItem extends SelectionFulfillmentOptionItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(29);
    public Integer A00;
    public final CurrencyAmount A01;
    public final KP0 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Date A06;
    public final Date A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionShippingFulfillmentOptionItem(CurrencyAmount currencyAmount, KP0 kp0, Integer num, String str, String str2, String str3, Date date, Date date2) {
        super(currencyAmount, kp0, num, str, str2, str3);
        7zT.A1W(kp0, num, str, str2);
        this.A02 = kp0;
        this.A00 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = currencyAmount;
        this.A03 = str3;
        this.A07 = date;
        this.A06 = date2;
    }
}
