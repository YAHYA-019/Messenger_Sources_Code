package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.shippingaddress.model.ShippingAddress;

/* loaded from: PuxShippingAddressItem.class */
public final class PuxShippingAddressItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(17);
    public final KP0 A00;
    public final ShippingAddress A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public PuxShippingAddressItem() {
        this(KP0.A0k, null, null, null, null, false);
    }

    public PuxShippingAddressItem(KP0 kp0, ShippingAddress shippingAddress, String str, String str2, String str3, boolean z) {
        11T.A0F(kp0, 1);
        this.A00 = kp0;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = shippingAddress;
        this.A05 = z;
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
