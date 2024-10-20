package com.facebook.auth.credentials;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TwoFactorCredentials.class */
public final class TwoFactorCredentials extends PasswordCredentials {
    public static final Parcelable.Creator CREATOR = DKf.A00(23);
    public String A00;
    public String A01;
    public String A02;

    @Override // com.facebook.auth.credentials.PasswordCredentials, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
