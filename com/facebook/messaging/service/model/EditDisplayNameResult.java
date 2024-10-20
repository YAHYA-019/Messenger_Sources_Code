package com.facebook.messaging.service.model;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EditDisplayNameResult.class */
public final class EditDisplayNameResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(83);
    public final String A00;
    public final String A01;

    public EditDisplayNameResult(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public EditDisplayNameResult(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
