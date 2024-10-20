package com.facebook.messaging.model.share;

import X.11T;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ShareProperty.class */
public final class ShareProperty implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(58);
    public final String A00;
    public final String A01;
    public final String A02;

    public ShareProperty(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public ShareProperty(String str, String str2, String str3) {
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
