package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.7zT;
import X.C3o5;
import X.EnumC3490Mfk;
import X.KOm;
import X.KP0;
import X.KwI;
import X.LGp;
import X.MPh;
import X.MQH;
import X.Qtn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SelectionPaymentMethodItem.class */
public final class SelectionPaymentMethodItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(25);
    public MPh A00;
    public Qtn A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final MQH A08;
    public final EnumC3490Mfk A09;
    public final KOm A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final KP0 A0L;
    public final boolean A0M;

    public SelectionPaymentMethodItem(KP0 kp0, MQH mqh, MPh mPh, EnumC3490Mfk enumC3490Mfk, Qtn qtn, KOm kOm, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        7zT.A1W(kp0, num, str, str2);
        11T.A0F(str3, 5);
        11T.A0F(enumC3490Mfk, 14);
        11T.A0F(str7, 15);
        this.A0L = kp0;
        this.A03 = num;
        this.A0F = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = qtn;
        this.A0I = str4;
        this.A0E = str5;
        this.A08 = mqh;
        this.A0A = kOm;
        this.A0C = str6;
        this.A02 = num2;
        this.A00 = mPh;
        this.A09 = enumC3490Mfk;
        this.A0D = str7;
        this.A0B = num3;
        this.A06 = z;
        this.A0J = z2;
        this.A0M = z3;
        this.A0G = str8;
        this.A0H = str9;
        this.A0K = z4;
        this.A07 = z5;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A0L;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public Integer B9u() {
        return this.A03;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public void CuR(Integer num) {
        11T.A0F(num, 0);
        this.A03 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public String getId() {
        return this.A0F;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A0L);
        parcel.writeString(KwI.A01(this.A03));
        parcel.writeString(this.A0F);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        Qtn qtn = this.A01;
        if (qtn == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, qtn);
        }
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0E);
        parcel.writeValue(this.A08);
        KOm kOm = this.A0A;
        if (kOm == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, kOm);
        }
        parcel.writeString(this.A0C);
        C3o5.A0f(parcel, this.A02);
        parcel.writeValue(this.A00);
        1BL.A12(parcel, this.A09);
        parcel.writeString(this.A0D);
        C3o5.A0f(parcel, this.A0B);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
    }
}
