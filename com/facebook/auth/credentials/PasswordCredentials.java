package com.facebook.auth.credentials;

import X.7zN;
import X.DKf;
import X.EPM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;

/* loaded from: PasswordCredentials.class */
public class PasswordCredentials implements LoginCredentials {
    public static final Parcelable.Creator CREATOR = DKf.A00(20);
    public int A00;
    public final EPM A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public PasswordCredentials(EPM epm, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = epm;
        this.A04 = null;
    }

    public PasswordCredentials(EPM epm, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = epm;
        this.A04 = str3;
    }

    public PasswordCredentials(EPM epm, String str, String str2, String str3, int i) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = epm;
        this.A04 = str3;
        this.A00 = i;
    }

    public PasswordCredentials(Parcel parcel) {
        String readString = parcel.readString();
        Preconditions.checkNotNull(readString, "identifier should NOT be null at this point");
        this.A02 = readString;
        String readString2 = parcel.readString();
        Preconditions.checkNotNull(readString2, "password should NOT be null at this point");
        this.A03 = readString2;
        this.A01 = EPM.values()[parcel.readInt()];
        this.A04 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        7zN.A0z(parcel, this.A01);
        parcel.writeString(this.A04);
    }
}
