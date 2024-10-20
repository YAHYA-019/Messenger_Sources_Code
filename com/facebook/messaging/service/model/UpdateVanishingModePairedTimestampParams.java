package com.facebook.messaging.service.model;

import X.1BL;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: UpdateVanishingModePairedTimestampParams.class */
public final class UpdateVanishingModePairedTimestampParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(25);
    public final long A00;
    public final ThreadKey A01;

    public UpdateVanishingModePairedTimestampParams(Parcel parcel) {
        this.A01 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        this.A00 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeLong(this.A00);
    }
}
