package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InvisibleHeaderItem.class */
public final class InvisibleHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(6);
    public final KP0 A00;

    public InvisibleHeaderItem() {
        this(KP0.A0L);
    }

    public InvisibleHeaderItem(KP0 kp0) {
        11T.A0F(kp0, 1);
        this.A00 = kp0;
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
    }
}
