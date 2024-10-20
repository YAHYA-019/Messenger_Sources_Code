package com.facebookpay.common.recyclerview.adapteritems;

import X.0S2;
import X.11T;
import X.1BL;
import X.KP0;
import X.KwL;
import X.KwM;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;

/* loaded from: PuxFulfillmentOptionItem.class */
public final class PuxFulfillmentOptionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(12);
    public final KP0 A00;
    public final FulfillmentOptionComponent A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;

    public PuxFulfillmentOptionItem() {
        this(KP0.A0d, null, 0S2.A00, null, false, false);
    }

    public PuxFulfillmentOptionItem(KP0 kp0, FulfillmentOptionComponent fulfillmentOptionComponent, Integer num, Integer num2, boolean z, boolean z2) {
        11T.A0F(kp0, 1);
        this.A00 = kp0;
        this.A01 = fulfillmentOptionComponent;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = num;
        this.A02 = num2;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(KwM.A01(num));
        }
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(KwL.A01(num2));
        }
    }
}
