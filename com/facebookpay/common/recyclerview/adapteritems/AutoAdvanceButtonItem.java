package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.FKb;
import X.KP0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AutoAdvanceButtonItem.class */
public final class AutoAdvanceButtonItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = FKb.A00(96);
    public final int A00;
    public final KP0 A01;

    public AutoAdvanceButtonItem(KP0 kp0, int i) {
        11T.A0F(kp0, 1);
        this.A01 = kp0;
        this.A00 = i;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A01);
        parcel.writeInt(this.A00);
    }
}
