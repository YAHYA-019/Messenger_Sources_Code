package com.facebook.messaging.service.model;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EditUsernameParams.class */
public final class EditUsernameParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(86);
    public final String A00;

    public EditUsernameParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public EditUsernameParams(String str) {
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
