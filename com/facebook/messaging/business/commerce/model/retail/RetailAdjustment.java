package com.facebook.messaging.business.commerce.model.retail;

import X.11T;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RetailAdjustment.class */
public final class RetailAdjustment implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(20);
    public final String A00;
    public final String A01;

    public RetailAdjustment(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public RetailAdjustment(String str, String str2) {
        this.A01 = str2;
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
        parcel.writeString(this.A00);
    }
}
