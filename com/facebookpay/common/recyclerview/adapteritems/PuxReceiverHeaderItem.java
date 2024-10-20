package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PuxReceiverHeaderItem.class */
public final class PuxReceiverHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(16);
    public final KP0 A00;
    public final String A01;
    public final String A02;

    public PuxReceiverHeaderItem(KP0 kp0, String str, String str2) {
        11T.A0F(kp0, 1);
        this.A00 = kp0;
        this.A02 = str;
        this.A01 = str2;
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
