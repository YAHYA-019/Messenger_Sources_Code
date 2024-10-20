package com.facebook.payments.checkout.protocol.model;

import X.0fH;
import X.24X;
import X.DKF;
import X.DKH;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;

/* loaded from: CheckoutChargeResult.class */
public final class CheckoutChargeResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(21);
    public final 24X A00;
    public final String A01;

    public CheckoutChargeResult(24X r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public CheckoutChargeResult(Parcel parcel) {
        24X r303;
        this.A01 = parcel.readString();
        try {
            r303 = DKH.A0c(parcel);
        } catch (IOException e) {
            0fH.A0K(CheckoutChargeResult.class, "Could not read JSON from parcel", e);
            r303 = null;
        }
        this.A00 = r303;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        DKF.A1E(parcel, this.A00);
    }
}
