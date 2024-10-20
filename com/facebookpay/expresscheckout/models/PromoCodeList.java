package com.facebookpay.expresscheckout.models;

import X.11T;
import X.C0ty;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: PromoCodeList.class */
public final class PromoCodeList implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(55);
    public final List A00;

    public PromoCodeList() {
        this(C0ty.A00);
    }

    public PromoCodeList(List list) {
        11T.A0F(list, 1);
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeStringList(this.A00);
    }
}
