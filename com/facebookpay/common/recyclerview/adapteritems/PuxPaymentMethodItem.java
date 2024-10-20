package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.AbN;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.paymentmethod.model.PaymentMethod;

/* loaded from: PuxPaymentMethodItem.class */
public final class PuxPaymentMethodItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(14);
    public final KP0 A00;
    public final PaymentMethod A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;

    public PuxPaymentMethodItem() {
        this(KP0.A0g, null, null, false, true);
    }

    public PuxPaymentMethodItem(KP0 kp0, PaymentMethod paymentMethod, Integer num, boolean z, boolean z2) {
        11T.A0F(kp0, 1);
        this.A00 = kp0;
        this.A01 = paymentMethod;
        this.A03 = z;
        this.A02 = num;
        this.A04 = z2;
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
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(AbN.A01(parcel, this.A02));
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
