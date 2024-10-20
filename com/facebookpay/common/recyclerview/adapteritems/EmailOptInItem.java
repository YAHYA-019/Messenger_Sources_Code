package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.KP0;
import X.LGp;
import X.MPZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EmailOptInItem.class */
public final class EmailOptInItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(1);
    public boolean A00;
    public final MPZ A01;
    public final KP0 A02;
    public final String A03;
    public final boolean A04;

    public EmailOptInItem() {
        this(null, KP0.A0G, null, false, false);
    }

    public EmailOptInItem(MPZ mpz, KP0 kp0, String str, boolean z, boolean z2) {
        11T.A0F(kp0, 1);
        this.A02 = kp0;
        this.A00 = z;
        this.A01 = mpz;
        this.A03 = str;
        this.A04 = z2;
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
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
