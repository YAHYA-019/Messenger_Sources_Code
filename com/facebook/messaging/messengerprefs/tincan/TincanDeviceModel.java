package com.facebook.messaging.messengerprefs.tincan;

import X.CSV;
import X.D14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TincanDeviceModel.class */
public final class TincanDeviceModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(43);
    public final D14 A00;
    public final String A01;
    public final String A02;

    public TincanDeviceModel(D14 d14, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = d14;
    }

    public TincanDeviceModel(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (D14) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A00);
    }
}
