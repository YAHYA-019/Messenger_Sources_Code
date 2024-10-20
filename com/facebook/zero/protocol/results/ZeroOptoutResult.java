package com.facebook.zero.protocol.results;

import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ZeroOptoutResult.class */
public class ZeroOptoutResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(87);
    public final String mStatus;

    public ZeroOptoutResult() {
        this.mStatus = null;
    }

    public ZeroOptoutResult(Parcel parcel) {
        this.mStatus = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mStatus);
    }
}
