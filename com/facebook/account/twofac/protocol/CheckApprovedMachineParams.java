package com.facebook.account.twofac.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckApprovedMachineParams.class */
public final class CheckApprovedMachineParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(83);
    public long A00;
    public String A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }
}
