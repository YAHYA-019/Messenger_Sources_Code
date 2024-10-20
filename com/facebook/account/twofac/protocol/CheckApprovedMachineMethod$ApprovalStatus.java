package com.facebook.account.twofac.protocol;

import X.1BK;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckApprovedMachineMethod$ApprovalStatus.class */
public class CheckApprovedMachineMethod$ApprovalStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(81);
    public Boolean A00 = 1BK.A0d();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A00.booleanValue() ? (byte) 1 : (byte) 0);
    }
}
