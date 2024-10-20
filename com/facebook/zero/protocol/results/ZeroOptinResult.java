package com.facebook.zero.protocol.results;

import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ZeroOptinResult.class */
public class ZeroOptinResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(86);
    public final String mStatus;

    public ZeroOptinResult() {
        this.mStatus = null;
    }

    public ZeroOptinResult(Parcel parcel) {
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
