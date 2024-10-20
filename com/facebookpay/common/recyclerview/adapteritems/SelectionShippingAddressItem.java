package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.4YW;
import X.C3o5;
import X.EN6;
import X.KP0;
import X.KwI;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: SelectionShippingAddressItem.class */
public final class SelectionShippingAddressItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(28);
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;
    public final KP0 A0I;

    public SelectionShippingAddressItem(KP0 kp0, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, boolean z) {
        1BL.A1H(kp0, num, str);
        this.A0I = kp0;
        this.A01 = num;
        this.A0A = str;
        this.A0E = str2;
        this.A0F = str3;
        this.A0B = str4;
        this.A0G = str5;
        this.A07 = str6;
        this.A0D = str7;
        this.A08 = str8;
        this.A0C = str9;
        this.A03 = str10;
        this.A02 = str11;
        this.A04 = str12;
        this.A00 = num2;
        this.A05 = str13;
        this.A0H = z;
        this.A09 = str14;
        this.A06 = list;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A0I;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public Integer B9u() {
        return this.A01;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public void CuR(Integer num) {
        11T.A0F(num, 0);
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public String getId() {
        return this.A0A;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A0I);
        parcel.writeString(KwI.A01(this.A01));
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        C3o5.A0f(parcel, this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A09);
        List list = this.A06;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A09 = 4YW.A09(parcel, list);
        while (A09.hasNext()) {
            1BL.A12(parcel, (EN6) A09.next());
        }
    }
}
