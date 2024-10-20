package com.facebook.iorg.common.upsell.server;

import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ZeroSmartUpsellButton.class */
public final class ZeroSmartUpsellButton implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(83);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ZeroSmartUpsellButton(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
