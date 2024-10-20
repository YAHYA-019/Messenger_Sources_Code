package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.C3o5;
import X.KP0;
import X.LGp;
import X.MFo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SelectionActionViewItem.class */
public final class SelectionActionViewItem implements BaseCheckoutItem, MFo {
    public static final Parcelable.Creator CREATOR = LGp.A00(19);
    public Integer A00;
    public String A01;
    public final Integer A02;
    public final KP0 A03;
    public final String A04;

    public SelectionActionViewItem() {
        this(KP0.A0m, null, null, null, null);
    }

    public SelectionActionViewItem(KP0 kp0, Integer num, Integer num2, String str, String str2) {
        11T.A0F(kp0, 1);
        this.A03 = kp0;
        this.A02 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A00 = num2;
    }

    @Override // X.MFo
    public Integer AnA() {
        return this.A02;
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
        C3o5.A0f(parcel, this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        C3o5.A0f(parcel, this.A00);
    }
}
