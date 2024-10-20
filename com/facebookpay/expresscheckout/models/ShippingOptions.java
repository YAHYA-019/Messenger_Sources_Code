package com.facebookpay.expresscheckout.models;

import X.11T;
import X.JR1;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: ShippingOptions.class */
public final class ShippingOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(57);
    public final String A00;
    public final ArrayList A01;

    public ShippingOptions(String str, ArrayList arrayList) {
        this.A00 = str;
        this.A01 = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A13 = JR1.A13(parcel, this.A01);
        while (A13.hasNext()) {
            ((ShippingOption) A13.next()).writeToParcel(parcel, i);
        }
    }
}
