package com.facebook.messaging.phoneconfirmation.protocol;

import X.1BL;
import X.AbN;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RegisterMessengerOnlyUserParams.class */
public final class RegisterMessengerOnlyUserParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(3);
    public final RegisterMessengerOnlyUserRegData A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public RegisterMessengerOnlyUserParams(Parcel parcel) {
        this.A00 = (RegisterMessengerOnlyUserRegData) 1BL.A0C(parcel, RegisterMessengerOnlyUserRegData.class);
        this.A01 = parcel.readString();
        this.A03 = AbN.A1U(parcel);
        this.A02 = parcel.readString();
    }

    public RegisterMessengerOnlyUserParams(RegisterMessengerOnlyUserRegData registerMessengerOnlyUserRegData, String str, String str2) {
        this.A00 = registerMessengerOnlyUserRegData;
        this.A01 = str;
        this.A03 = true;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
