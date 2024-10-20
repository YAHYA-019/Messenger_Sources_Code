package com.facebook.mqtt.service.ipc;

import X.11T;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SubscriptionParcelable.class */
public final class SubscriptionParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(7);
    public int A00;
    public String A01 = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
