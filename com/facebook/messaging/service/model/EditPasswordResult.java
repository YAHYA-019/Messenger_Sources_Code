package com.facebook.messaging.service.model;

import X.7zS;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EditPasswordResult.class */
public final class EditPasswordResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(85);
    public final boolean A00;

    public EditPasswordResult() {
        this.A00 = true;
    }

    public EditPasswordResult(Parcel parcel) {
        this.A00 = 7zS.A1Z(parcel);
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
