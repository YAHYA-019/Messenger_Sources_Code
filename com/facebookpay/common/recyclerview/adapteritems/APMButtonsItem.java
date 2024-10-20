package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.AbN;
import X.FKb;
import X.KP0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;

/* loaded from: APMButtonsItem.class */
public final class APMButtonsItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = FKb.A00(93);
    public final Integer A00;
    public final APMBloksNativeProps A01;
    public final KP0 A02;

    public APMButtonsItem(APMBloksNativeProps aPMBloksNativeProps, KP0 kp0, Integer num) {
        1BL.A1F(kp0, aPMBloksNativeProps);
        this.A02 = kp0;
        this.A01 = aPMBloksNativeProps;
        this.A00 = num;
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
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(AbN.A01(parcel, this.A00));
        parcel.writeParcelable(null, i);
    }
}
