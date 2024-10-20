package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.4YW;
import X.7zT;
import X.AnonymousClass001;
import X.KP0;
import X.LGp;
import X.MO1;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: SelectionIncentiveEmbeddedBloksItem.class */
public final class SelectionIncentiveEmbeddedBloksItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(23);
    public final MO1 A00;
    public final List A01;
    public final List A02;
    public final Function1 A03;
    public final Function1 A04;
    public final boolean A05;
    public final KP0 A06;

    public SelectionIncentiveEmbeddedBloksItem(MO1 mo1, KP0 kp0, List list, List list2, Function1 function1, Function1 function12, boolean z) {
        7zT.A11(1, kp0, list2, function1, function12);
        this.A06 = kp0;
        this.A00 = mo1;
        this.A02 = list;
        this.A01 = list2;
        this.A03 = function1;
        this.A04 = function12;
        this.A05 = z;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A06);
        parcel.writeValue(this.A00);
        Iterator A09 = 4YW.A09(parcel, this.A02);
        while (A09.hasNext()) {
            Map map = (Map) A09.next();
            parcel.writeInt(map.size());
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                parcel.writeString(AnonymousClass001.A0j(A0z));
                parcel.writeValue(A0z.getValue());
            }
        }
        parcel.writeStringList(this.A01);
        parcel.writeSerializable((Serializable) this.A03);
        parcel.writeSerializable((Serializable) this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
