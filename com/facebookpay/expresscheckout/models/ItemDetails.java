package com.facebookpay.expresscheckout.models;

import X.0S2;
import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ItemDetails.class */
public final class ItemDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(49);
    public String A00;
    public final Integer A01;

    public ItemDetails() {
        this(0S2.A00, null);
    }

    public ItemDetails(Integer num, String str) {
        11T.A0F(num, 1);
        this.A01 = num;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01.intValue() != 0 ? "RESELLER" : "DEFAULT");
        parcel.writeString(this.A00);
    }
}
