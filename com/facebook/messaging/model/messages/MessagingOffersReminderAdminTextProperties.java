package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: MessagingOffersReminderAdminTextProperties.class */
public final class MessagingOffersReminderAdminTextProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(4);
    public final String A00;
    public final String A01;

    public MessagingOffersReminderAdminTextProperties(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
