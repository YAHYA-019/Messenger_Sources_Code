package com.facebookpay.incentives.model;

import X.11T;
import X.4YW;
import X.C0ty;
import X.JR0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: IncentiveList.class */
public final class IncentiveList implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(98);
    public final List A00;

    public IncentiveList() {
        this(C0ty.A00);
    }

    public IncentiveList(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A09 = 4YW.A09(parcel, this.A00);
        while (A09.hasNext()) {
            JR0.A17(parcel, A09, i);
        }
    }
}
