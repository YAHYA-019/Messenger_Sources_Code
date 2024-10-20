package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.AbN;
import X.KP0;
import X.LGp;
import X.MFo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PuxContactItem.class */
public final class PuxContactItem implements BaseCheckoutItem, MFo {
    public static final Parcelable.Creator CREATOR = LGp.A00(10);
    public final KP0 A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public PuxContactItem() {
        this(KP0.A0b, null, null, null, null, null, null, false);
    }

    public PuxContactItem(KP0 kp0, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        11T.A0F(kp0, 1);
        this.A00 = kp0;
        this.A01 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = z;
        this.A02 = str5;
    }

    @Override // X.MFo
    public Integer AnA() {
        return this.A01;
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
        parcel.writeInt(AbN.A01(parcel, this.A01));
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
