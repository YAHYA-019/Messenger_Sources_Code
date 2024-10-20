package com.facebook.platform.opengraph.model;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OpenGraphObject.class */
public final class OpenGraphObject implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(36);
    public final String A00;
    public final String A01;
    public final String A02;

    public OpenGraphObject(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public OpenGraphObject(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
