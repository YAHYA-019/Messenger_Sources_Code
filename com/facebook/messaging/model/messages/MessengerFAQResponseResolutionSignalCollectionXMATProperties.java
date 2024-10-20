package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: MessengerFAQResponseResolutionSignalCollectionXMATProperties.class */
public final class MessengerFAQResponseResolutionSignalCollectionXMATProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(7);
    public final String A00;

    public MessengerFAQResponseResolutionSignalCollectionXMATProperties(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
