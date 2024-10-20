package com.facebook.push.fbns.ipc;

import X.11T;
import X.C0px;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* loaded from: FbnsAIDLResult.class */
public class FbnsAIDLResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0px(2);
    public Bundle A00;
    public final long A01;

    public FbnsAIDLResult(Bundle bundle) {
        this.A01 = SystemClock.elapsedRealtime();
        this.A00 = bundle;
    }

    public FbnsAIDLResult(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readBundle();
    }

    public void A00(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeBundle(this.A00);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        A00(parcel, i);
    }
}
