package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: MessengerPageThreadActionSystemAddDetailsProperty.class */
public final class MessengerPageThreadActionSystemAddDetailsProperty extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(9);
    public String A00;
    public String A01;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
