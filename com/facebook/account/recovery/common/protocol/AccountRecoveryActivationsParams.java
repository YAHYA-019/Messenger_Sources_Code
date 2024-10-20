package com.facebook.account.recovery.common.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryActivationsParams.class */
public final class AccountRecoveryActivationsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(62);
    public final String A00;
    public final String A01;

    public AccountRecoveryActivationsParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
