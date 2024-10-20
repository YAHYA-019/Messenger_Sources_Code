package com.facebookpay.expresscheckout.models;

import X.11T;
import X.1BL;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import java.util.Date;

/* loaded from: FulfillmentOption.class */
public class FulfillmentOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(47);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final Date A03;
    public final Date A04;

    public FulfillmentOption(CurrencyAmount currencyAmount, String str, String str2, Date date, Date date2) {
        1BL.A1H(str, str2, currencyAmount);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = currencyAmount;
        this.A04 = date;
        this.A03 = date2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!(this instanceof PickupFulfillmentOption)) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeParcelable(this.A00, i);
            parcel.writeSerializable(this.A04);
            parcel.writeSerializable(this.A03);
            return;
        }
        PickupFulfillmentOption pickupFulfillmentOption = (PickupFulfillmentOption) this;
        11T.A0F(parcel, 0);
        parcel.writeString(pickupFulfillmentOption.A03);
        parcel.writeString(pickupFulfillmentOption.A04);
        parcel.writeParcelable(pickupFulfillmentOption.A00, i);
        parcel.writeSerializable(pickupFulfillmentOption.A06);
        parcel.writeSerializable(pickupFulfillmentOption.A05);
        parcel.writeParcelable(pickupFulfillmentOption.A02, i);
        parcel.writeInt(pickupFulfillmentOption.A07 ? 1 : 0);
        parcel.writeParcelable(pickupFulfillmentOption.A01, i);
    }
}
