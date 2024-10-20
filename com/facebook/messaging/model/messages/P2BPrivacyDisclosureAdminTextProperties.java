package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: P2BPrivacyDisclosureAdminTextProperties.class */
public final class P2BPrivacyDisclosureAdminTextProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(11);
    public final String A00;

    public P2BPrivacyDisclosureAdminTextProperties(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
