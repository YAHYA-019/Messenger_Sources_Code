package com.facebook.payments.auth.pin.params;

import X.AbM;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VerifyFingerprintNonceParams.class */
public final class VerifyFingerprintNonceParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(42);
    public final String A00;

    public VerifyFingerprintNonceParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public VerifyFingerprintNonceParams(String str) {
        AbM.A1T(str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}