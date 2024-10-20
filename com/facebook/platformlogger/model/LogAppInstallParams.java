package com.facebook.platformlogger.model;

import X.C53v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LogAppInstallParams.class */
public final class LogAppInstallParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(47);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public LogAppInstallParams(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = C53v.A0S(parcel);
        this.A03 = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
