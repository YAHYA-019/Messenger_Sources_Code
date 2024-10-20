package com.facebook.messaging.service.model;

import X.C53v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RemoveAdminsFromGroupResult.class */
public final class RemoveAdminsFromGroupResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(9);
    public final boolean A00;

    public RemoveAdminsFromGroupResult(Parcel parcel) {
        this.A00 = C53v.A0S(parcel);
    }

    public RemoveAdminsFromGroupResult(boolean z) {
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
