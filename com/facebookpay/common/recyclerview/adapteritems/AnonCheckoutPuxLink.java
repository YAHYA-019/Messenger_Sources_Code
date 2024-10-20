package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.FKb;
import X.KP0;
import X.MPZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AnonCheckoutPuxLink.class */
public final class AnonCheckoutPuxLink implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new FKb(94);
    public final MPZ A00;
    public final KP0 A01;
    public final boolean A02;

    public AnonCheckoutPuxLink() {
        this(null, KP0.A08, false);
    }

    public AnonCheckoutPuxLink(MPZ mpz, KP0 kp0, boolean z) {
        11T.A0F(kp0, 1);
        this.A01 = kp0;
        this.A00 = mpz;
        this.A02 = z;
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
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
