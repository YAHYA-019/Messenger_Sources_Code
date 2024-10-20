package com.facebookpay.expresscheckout.models;

import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AuthScreenStyle.class */
public final class AuthScreenStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(35);
    public final int A00;

    public AuthScreenStyle() {
        this(0);
    }

    public AuthScreenStyle(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
    }
}
