package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.7zT;
import X.KP0;
import X.KwI;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: SelectionFulfillmentOptionItem.class */
public class SelectionFulfillmentOptionItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(21);
    public Integer A00;
    public final CurrencyAmount A01;
    public final KP0 A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public SelectionFulfillmentOptionItem(CurrencyAmount currencyAmount, KP0 kp0, Integer num, String str, String str2, String str3) {
        7zT.A1W(kp0, num, str, str2);
        this.A02 = kp0;
        this.A00 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = currencyAmount;
        this.A03 = str3;
    }

    public CurrencyAmount A00() {
        return this instanceof SelectionShippingFulfillmentOptionItem ? ((SelectionShippingFulfillmentOptionItem) this).A01 : this instanceof SelectionPickupFulfillmentOptionItem ? ((SelectionPickupFulfillmentOptionItem) this).A01 : this.A01;
    }

    public String A01() {
        return this instanceof SelectionShippingFulfillmentOptionItem ? ((SelectionShippingFulfillmentOptionItem) this).A03 : this instanceof SelectionPickupFulfillmentOptionItem ? ((SelectionPickupFulfillmentOptionItem) this).A06 : this.A03;
    }

    public String A02() {
        return this instanceof SelectionShippingFulfillmentOptionItem ? ((SelectionShippingFulfillmentOptionItem) this).A05 : this instanceof SelectionPickupFulfillmentOptionItem ? ((SelectionPickupFulfillmentOptionItem) this).A08 : this.A05;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this instanceof SelectionShippingFulfillmentOptionItem ? ((SelectionShippingFulfillmentOptionItem) this).A02 : this instanceof SelectionPickupFulfillmentOptionItem ? ((SelectionPickupFulfillmentOptionItem) this).A03 : this.A02;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public Integer B9u() {
        return this instanceof SelectionShippingFulfillmentOptionItem ? ((SelectionShippingFulfillmentOptionItem) this).A00 : this instanceof SelectionPickupFulfillmentOptionItem ? ((SelectionPickupFulfillmentOptionItem) this).A00 : this.A00;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public void CuR(Integer num) {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            11T.A0F(num, 0);
            ((SelectionShippingFulfillmentOptionItem) this).A00 = num;
        } else if (this instanceof SelectionPickupFulfillmentOptionItem) {
            11T.A0F(num, 0);
            ((SelectionPickupFulfillmentOptionItem) this).A00 = num;
        } else {
            11T.A0F(num, 0);
            this.A00 = num;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public String getId() {
        return this instanceof SelectionShippingFulfillmentOptionItem ? ((SelectionShippingFulfillmentOptionItem) this).A04 : this instanceof SelectionPickupFulfillmentOptionItem ? ((SelectionPickupFulfillmentOptionItem) this).A07 : this.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            SelectionShippingFulfillmentOptionItem selectionShippingFulfillmentOptionItem = (SelectionShippingFulfillmentOptionItem) this;
            11T.A0F(parcel, 0);
            1BL.A12(parcel, selectionShippingFulfillmentOptionItem.A02);
            parcel.writeString(KwI.A01(selectionShippingFulfillmentOptionItem.A00));
            parcel.writeString(selectionShippingFulfillmentOptionItem.A04);
            parcel.writeString(selectionShippingFulfillmentOptionItem.A05);
            parcel.writeParcelable(selectionShippingFulfillmentOptionItem.A01, i);
            parcel.writeString(selectionShippingFulfillmentOptionItem.A03);
            parcel.writeSerializable(selectionShippingFulfillmentOptionItem.A07);
            parcel.writeSerializable(selectionShippingFulfillmentOptionItem.A06);
            return;
        }
        if (!(this instanceof SelectionPickupFulfillmentOptionItem)) {
            11T.A0F(parcel, 0);
            1BL.A12(parcel, this.A02);
            parcel.writeString(KwI.A01(this.A00));
            parcel.writeString(this.A04);
            parcel.writeString(this.A05);
            parcel.writeParcelable(this.A01, i);
            parcel.writeString(this.A03);
            return;
        }
        SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) this;
        11T.A0F(parcel, 0);
        1BL.A12(parcel, selectionPickupFulfillmentOptionItem.A03);
        parcel.writeString(KwI.A01(selectionPickupFulfillmentOptionItem.A00));
        parcel.writeString(selectionPickupFulfillmentOptionItem.A07);
        parcel.writeString(selectionPickupFulfillmentOptionItem.A08);
        parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A01, i);
        parcel.writeString(selectionPickupFulfillmentOptionItem.A06);
        parcel.writeSerializable(selectionPickupFulfillmentOptionItem.A0A);
        parcel.writeSerializable(selectionPickupFulfillmentOptionItem.A09);
        parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A04, i);
        Boolean bool = selectionPickupFulfillmentOptionItem.A05;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A02, i);
        parcel.writeInt(selectionPickupFulfillmentOptionItem.A0B ? 1 : 0);
    }
}
