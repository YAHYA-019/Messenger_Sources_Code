package com.facebook.messaging.service.model;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EditUsernameResult.class */
public final class EditUsernameResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(87);
    public final String A00;

    public EditUsernameResult(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public EditUsernameResult(String str) {
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
