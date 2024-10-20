package com.facebookpay.expresscheckout.models;

import X.11T;
import X.JR1;
import X.KwM;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: TransactionInfo.class */
public final class TransactionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(58);
    public final FulfillmentOptions A00;
    public final PickupInfo A01;
    public final PromoCodeList A02;
    public final ShippingOptions A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final List A09;
    public final String A0A;

    public TransactionInfo(FulfillmentOptions fulfillmentOptions, PickupInfo pickupInfo, PromoCodeList promoCodeList, ShippingOptions shippingOptions, Integer num, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, List list) {
        11T.A0F(str, 1);
        this.A06 = str;
        this.A05 = str2;
        this.A08 = arrayList;
        this.A07 = arrayList2;
        this.A03 = shippingOptions;
        this.A00 = fulfillmentOptions;
        this.A02 = promoCodeList;
        this.A09 = list;
        this.A0A = str3;
        this.A04 = num;
        this.A01 = pickupInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        ArrayList arrayList = this.A08;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A13 = JR1.A13(parcel, arrayList);
            while (A13.hasNext()) {
                ((PriceInfo) A13.next()).writeToParcel(parcel, i);
            }
        }
        ArrayList arrayList2 = this.A07;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A132 = JR1.A13(parcel, arrayList2);
            while (A132.hasNext()) {
                ((PriceInfo) A132.next()).writeToParcel(parcel, i);
            }
        }
        ShippingOptions shippingOptions = this.A03;
        if (shippingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingOptions.writeToParcel(parcel, i);
        }
        FulfillmentOptions fulfillmentOptions = this.A00;
        if (fulfillmentOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fulfillmentOptions.writeToParcel(parcel, i);
        }
        PromoCodeList promoCodeList = this.A02;
        if (promoCodeList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoCodeList.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A0A);
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(KwM.A01(num));
        }
        PickupInfo pickupInfo = this.A01;
        if (pickupInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pickupInfo.writeToParcel(parcel, i);
        }
    }
}
