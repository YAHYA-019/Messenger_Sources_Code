package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.KP0;
import X.LGp;
import X.MPZ;
import X.RW0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: PuxBannerItem.class */
public final class PuxBannerItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(9);
    public final MPZ A00;
    public final KP0 A01;
    public final CharSequence A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    public PuxBannerItem(MPZ mpz, KP0 kp0, CharSequence charSequence, Integer num, String str, boolean z) {
        1BL.A1F(kp0, str);
        this.A01 = kp0;
        this.A04 = str;
        this.A03 = num;
        this.A02 = charSequence;
        this.A00 = mpz;
        this.A05 = z;
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
        parcel.writeString(this.A04);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(RW0.A01(num));
        }
        TextUtils.writeToParcel(this.A02, parcel, i);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
