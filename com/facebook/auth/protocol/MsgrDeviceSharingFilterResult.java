package com.facebook.auth.protocol;

import X.4YV;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MsgrDeviceSharingFilterResult.class */
public final class MsgrDeviceSharingFilterResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(41);
    public final boolean A00;

    public MsgrDeviceSharingFilterResult(Parcel parcel) {
        this.A00 = 4YV.A1U(parcel.readByte());
    }

    public MsgrDeviceSharingFilterResult(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
