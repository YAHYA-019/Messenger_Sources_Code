package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.AbN;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SelectionTextViewItem.class */
public final class SelectionTextViewItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(30);
    public Integer A00;
    public String A01;
    public boolean A02;
    public final KP0 A03;

    public SelectionTextViewItem() {
        this(KP0.A0t, null, null, false);
    }

    public SelectionTextViewItem(KP0 kp0, Integer num, String str, boolean z) {
        11T.A0F(kp0, 1);
        this.A03 = kp0;
        this.A01 = str;
        this.A00 = num;
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
        parcel.writeString(this.A01);
        parcel.writeInt(AbN.A01(parcel, this.A00));
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
