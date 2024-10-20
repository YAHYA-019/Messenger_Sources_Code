package com.facebook.messaging.badging.logging;

import X.11T;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ThreadReadStats.class */
public final class ThreadReadStats implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(15);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
