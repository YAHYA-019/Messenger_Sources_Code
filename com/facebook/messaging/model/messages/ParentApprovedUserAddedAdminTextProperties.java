package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: ParentApprovedUserAddedAdminTextProperties.class */
public final class ParentApprovedUserAddedAdminTextProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(14);
    public boolean A00;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
