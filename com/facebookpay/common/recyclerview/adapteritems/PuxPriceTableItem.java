package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.JR0;
import X.JR1;
import X.KP0;
import X.KwL;
import X.KwM;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: PuxPriceTableItem.class */
public final class PuxPriceTableItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(15);
    public final Integer A00;
    public final Integer A01;
    public final ArrayList A02;
    public final KP0 A03;

    public PuxPriceTableItem(KP0 kp0, Integer num, Integer num2, ArrayList arrayList) {
        11T.A0F(kp0, 1);
        this.A03 = kp0;
        this.A01 = num;
        this.A00 = num2;
        this.A02 = arrayList;
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
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(KwM.A01(num));
        }
        Integer num2 = this.A00;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(KwL.A01(num2));
        }
        Iterator A13 = JR1.A13(parcel, this.A02);
        while (A13.hasNext()) {
            JR0.A17(parcel, A13, i);
        }
    }
}
