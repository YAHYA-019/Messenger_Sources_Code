package com.facebook.platform.opengraph.server;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GetRobotextPreviewMethod$Params.class */
public final class GetRobotextPreviewMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(37);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public GetRobotextPreviewMethod$Params(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public GetRobotextPreviewMethod$Params(String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A03 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
