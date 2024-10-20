package com.facebook.account.recovery.common.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryLaraEndpointMethod$Params.class */
public final class AccountRecoveryLaraEndpointMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(63);
    public String A00 = "";
    public String A03 = "";
    public String A01 = "";
    public String A02 = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
