package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.4YW;
import X.KP0;
import X.LGp;
import X.MPZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: PuxTermsConditionItem.class */
public final class PuxTermsConditionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(18);
    public final MPZ A00;
    public final MPZ A01;
    public final MPZ A02;
    public final MPZ A03;
    public final KP0 A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public PuxTermsConditionItem() {
        this(null, null, null, null, KP0.A0l, null, null, null, null, false);
    }

    public PuxTermsConditionItem(MPZ mpz, MPZ mpz2, MPZ mpz3, MPZ mpz4, KP0 kp0, String str, String str2, List list, List list2, boolean z) {
        11T.A0F(kp0, 1);
        this.A04 = kp0;
        this.A05 = str;
        this.A01 = mpz;
        this.A06 = str2;
        this.A07 = list;
        this.A02 = mpz2;
        this.A03 = mpz3;
        this.A08 = list2;
        this.A00 = mpz4;
        this.A09 = z;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A04);
        parcel.writeString(this.A05);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A06);
        parcel.writeStringList(this.A07);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A03);
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A09 = 4YW.A09(parcel, list);
            while (A09.hasNext()) {
                parcel.writeValue(A09.next());
            }
        }
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A09 ? 1 : 0);
    }
}
