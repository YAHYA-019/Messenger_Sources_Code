package com.facebook.messaging.phoneconfirmation.protocol;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ConfirmPhoneMethod$Params.class */
public final class ConfirmPhoneMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(0);
    public final String A00;

    public ConfirmPhoneMethod$Params(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public ConfirmPhoneMethod$Params(String str) {
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
