package com.facebook.auth.component;

import X.1BL;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;

/* loaded from: AccountSwitchingAuthenticationResult.class */
public final class AccountSwitchingAuthenticationResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(10);
    public final AuthenticationResult A00;
    public final String A01;
    public final String A02;

    public AccountSwitchingAuthenticationResult(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = (AuthenticationResult) 1BL.A0C(parcel, AuthenticationResult.class);
    }

    public AccountSwitchingAuthenticationResult(AuthenticationResult authenticationResult, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = authenticationResult;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
