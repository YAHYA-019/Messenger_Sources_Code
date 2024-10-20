package com.facebook.messaging.service.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AddAdminsToGroupResult.class */
public final class AddAdminsToGroupResult implements Parcelable {
    public final boolean A00;

    public AddAdminsToGroupResult(boolean z) {
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
