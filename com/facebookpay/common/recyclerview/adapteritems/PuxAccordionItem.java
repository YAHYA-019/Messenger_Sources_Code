package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.4YW;
import X.FJC;
import X.KP0;
import X.Kld;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: PuxAccordionItem.class */
public final class PuxAccordionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(8);
    public final Kld A00;
    public final FJC A01;
    public final List A02;
    public final boolean A03;
    public final KP0 A04;

    public PuxAccordionItem(KP0 kp0, Kld kld, FJC fjc, List list, boolean z) {
        1BL.A1H(kp0, fjc, list);
        this.A04 = kp0;
        this.A01 = fjc;
        this.A02 = list;
        this.A03 = z;
        this.A00 = kld;
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
        parcel.writeValue(this.A01);
        Iterator A09 = 4YW.A09(parcel, this.A02);
        while (A09.hasNext()) {
            parcel.writeValue(A09.next());
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeValue(this.A00);
    }
}
