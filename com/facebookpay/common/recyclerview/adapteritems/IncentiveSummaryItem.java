package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.C0ty;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: IncentiveSummaryItem.class */
public final class IncentiveSummaryItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(3);
    public final int A00;
    public final List A01;
    public final KP0 A02;

    public IncentiveSummaryItem() {
        this(KP0.A0I, C0ty.A00, 0);
    }

    public IncentiveSummaryItem(KP0 kp0, List list, int i) {
        1BL.A1F(kp0, list);
        this.A02 = kp0;
        this.A01 = list;
        this.A00 = i;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A02);
        parcel.writeStringList(this.A01);
        parcel.writeInt(this.A00);
    }
}
