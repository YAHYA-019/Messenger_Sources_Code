package com.facebook.messaging.sharing.broadcastflow.model;

import X.C53v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BroadcastFlowUIConfigModel.class */
public final class BroadcastFlowUIConfigModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(61);
    public final boolean A00;

    public BroadcastFlowUIConfigModel(Parcel parcel) {
        this.A00 = C53v.A0S(parcel);
    }

    public BroadcastFlowUIConfigModel(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
