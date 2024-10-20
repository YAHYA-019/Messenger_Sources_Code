package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: P2pPaymentRequestReminderProperties.class */
public final class P2pPaymentRequestReminderProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(13);
    public final String A00;

    public P2pPaymentRequestReminderProperties(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
