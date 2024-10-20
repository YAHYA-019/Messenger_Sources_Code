package com.facebook.messaging.accountlogin.fragment.operation;

import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FirstPartySsoContextResult.class */
public final class FirstPartySsoContextResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(82);
    public int[] A00;
    public int[] A01;
    public int[] A02;
    public int[] A03;
    public int[] A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A00);
    }
}
