package com.facebook.messaging.font;

import X.82M;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FontAsset.class */
public final class FontAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(33);
    public final String A00;
    public final String A01;
    public final String A02;

    public FontAsset(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public FontAsset(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
