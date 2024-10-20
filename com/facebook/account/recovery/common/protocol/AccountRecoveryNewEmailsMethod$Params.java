package com.facebook.account.recovery.common.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryNewEmailsMethod$Params.class */
public final class AccountRecoveryNewEmailsMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(66);
    public final String A00;
    public final String A01;
    public final String A02;

    public AccountRecoveryNewEmailsMethod$Params(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
