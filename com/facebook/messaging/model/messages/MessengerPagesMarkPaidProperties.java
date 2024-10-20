package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: MessengerPagesMarkPaidProperties.class */
public final class MessengerPagesMarkPaidProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(10);
    public String A00;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
