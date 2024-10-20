package com.facebook.messaging.neue.contactpicker.broadcastsection;

import X.11T;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ContactPickerBroadcastSection.class */
public final class ContactPickerBroadcastSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(57);
    public int A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
