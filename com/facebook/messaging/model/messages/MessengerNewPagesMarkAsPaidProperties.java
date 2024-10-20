package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: MessengerNewPagesMarkAsPaidProperties.class */
public final class MessengerNewPagesMarkAsPaidProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(8);
    public String A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
