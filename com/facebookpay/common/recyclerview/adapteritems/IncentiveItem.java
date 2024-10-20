package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.C0ty;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: IncentiveItem.class */
public final class IncentiveItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(2);
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final KP0 A03;

    public IncentiveItem() {
        this(KP0.A0e, C0ty.A00, 0, true);
    }

    public IncentiveItem(KP0 kp0, List list, int i, boolean z) {
        1BL.A1F(kp0, list);
        this.A03 = kp0;
        this.A01 = list;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A03);
        parcel.writeStringList(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
