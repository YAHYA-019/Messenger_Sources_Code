package com.facebook.auth.credentials;

import X.1BL;
import X.BLr;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.openidconnect.model.OpenIDCredential;

/* loaded from: OpenIDLoginCredentials.class */
public final class OpenIDLoginCredentials implements LoginCredentials {
    public static final Parcelable.Creator CREATOR = DKf.A00(19);
    public final BLr A00;
    public final OpenIDCredential A01;
    public final String A02;

    public OpenIDLoginCredentials(BLr bLr, OpenIDCredential openIDCredential, String str) {
        this.A02 = str;
        this.A01 = openIDCredential;
        this.A00 = bLr;
    }

    public OpenIDLoginCredentials(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = (OpenIDCredential) 1BL.A0C(parcel, OpenIDCredential.class);
        this.A00 = parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeSerializable(this.A00);
    }
}
