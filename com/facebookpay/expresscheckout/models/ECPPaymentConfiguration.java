package com.facebookpay.expresscheckout.models;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C3o5;
import X.ELW;
import X.JR1;
import X.KMl;
import X.KNi;
import X.KOJ;
import X.LGp;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: ECPPaymentConfiguration.class */
public final class ECPPaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(41);
    public final CurrencyAmount A00;
    public final KnownData A01;
    public final KNi A02;
    public final String A03;
    public final String A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final ArrayList A07;
    public final Map A08;
    public final Set A09;

    public ECPPaymentConfiguration(CurrencyAmount currencyAmount, KnownData knownData, KNi kNi, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map, Set set) {
        11T.A0F(kNi, 1);
        this.A02 = kNi;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = arrayList;
        this.A00 = currencyAmount;
        this.A07 = arrayList2;
        this.A01 = knownData;
        this.A05 = arrayList3;
        this.A08 = map;
        this.A09 = set;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        Iterator A13 = JR1.A13(parcel, this.A06);
        while (A13.hasNext()) {
            1BL.A12(parcel, (ELW) A13.next());
        }
        parcel.writeParcelable(this.A00, i);
        Iterator A132 = JR1.A13(parcel, this.A07);
        while (A132.hasNext()) {
            1BL.A12(parcel, (KOJ) A132.next());
        }
        KnownData knownData = this.A01;
        if (knownData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            knownData.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.A05);
        Map map = this.A08;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                1BL.A12(parcel, (KOJ) A0z.getKey());
                parcel.writeBundle((Bundle) A0z.getValue());
            }
        }
        Set set = this.A09;
        if (set == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0S = C3o5.A0S(parcel, set);
        while (A0S.hasNext()) {
            1BL.A12(parcel, (KMl) A0S.next());
        }
    }
}
