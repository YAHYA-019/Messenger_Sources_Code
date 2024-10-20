package com.facebook.messaging.business.messengerextensions.model;

import X.11T;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessengerExtensionProperties.class */
public final class MessengerExtensionProperties implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(36);
    public final String A00;
    public final String A01;
    public final String A02;

    public MessengerExtensionProperties(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
