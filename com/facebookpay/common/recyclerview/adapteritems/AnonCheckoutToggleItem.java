package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.FKb;
import X.KP0;
import X.MPZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AnonCheckoutToggleItem.class */
public final class AnonCheckoutToggleItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = FKb.A00(95);
    public final MPZ A00;
    public final MPZ A01;
    public final boolean A02;
    public final KP0 A03;

    public AnonCheckoutToggleItem() {
        this(null, null, KP0.A09, false);
    }

    public AnonCheckoutToggleItem(MPZ mpz, MPZ mpz2, KP0 kp0, boolean z) {
        11T.A0F(kp0, 1);
        this.A03 = kp0;
        this.A02 = z;
        this.A01 = mpz;
        this.A00 = mpz2;
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
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A00);
    }
}
