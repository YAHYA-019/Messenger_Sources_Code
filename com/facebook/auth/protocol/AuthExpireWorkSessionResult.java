package com.facebook.auth.protocol;

import X.4YV;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AuthExpireWorkSessionResult.class */
public final class AuthExpireWorkSessionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(29);
    public final String A00;
    public final boolean A01;

    public AuthExpireWorkSessionResult(Parcel parcel) {
        this.A01 = 4YV.A1U(parcel.readByte());
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A00);
    }
}
