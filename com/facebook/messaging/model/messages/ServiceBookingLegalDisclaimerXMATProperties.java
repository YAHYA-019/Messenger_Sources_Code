package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: ServiceBookingLegalDisclaimerXMATProperties.class */
public final class ServiceBookingLegalDisclaimerXMATProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(16);
    public final String A00;

    public ServiceBookingLegalDisclaimerXMATProperties(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
