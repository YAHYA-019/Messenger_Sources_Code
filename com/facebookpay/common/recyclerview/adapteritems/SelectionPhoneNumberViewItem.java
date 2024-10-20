package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.7zT;
import X.KP0;
import X.KwI;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SelectionPhoneNumberViewItem.class */
public final class SelectionPhoneNumberViewItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(26);
    public Integer A00;
    public String A01;
    public String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final KP0 A07;

    public SelectionPhoneNumberViewItem(KP0 kp0, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        7zT.A1W(kp0, num, str, str2);
        this.A07 = kp0;
        this.A00 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = str4;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A07;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public Integer B9u() {
        return this.A00;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public void CuR(Integer num) {
        11T.A0F(num, 0);
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public String getId() {
        return this.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A07);
        parcel.writeString(KwI.A01(this.A00));
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
    }
}
