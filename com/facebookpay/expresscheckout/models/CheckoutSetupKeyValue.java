package com.facebookpay.expresscheckout.models;

import X.11T;
import X.1BL;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutSetupKeyValue.class */
public final class CheckoutSetupKeyValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGp(38);
    public final String A00;
    public final String A01;

    public CheckoutSetupKeyValue(String str, String str2) {
        1BL.A1F(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
