package com.facebook.messaging.registration.protocol;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UpdateAccountRecoveryIdParams.class */
public final class UpdateAccountRecoveryIdParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(42);
    public final String A00;

    public UpdateAccountRecoveryIdParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public UpdateAccountRecoveryIdParams(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
