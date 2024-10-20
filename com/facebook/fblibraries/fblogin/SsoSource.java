package com.facebook.fblibraries.fblogin;

import X.0Pz;
import X.AnonymousClass001;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SsoSource.class */
public final class SsoSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(2);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public SsoSource(int i) {
        this.A01 = 0;
        this.A03 = "com.facebook.katana";
        this.A00 = i;
        this.A02 = null;
    }

    public SsoSource(int i, String str) {
        this.A01 = i;
        this.A03 = str;
        this.A00 = 0;
        this.A02 = null;
    }

    public SsoSource(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SsoSource{sourceType=");
        A0k.append(this.A01 == 0 ? "ContentProvider" : "AccountManager");
        A0k.append(", sourceString='");
        A0k.append(this.A03);
        A0k.append('\'');
        String str = this.A02;
        A0k.append(str != null ? 0Pz.A0j(", providerNameOverride='", str, "'") : "");
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }
}
