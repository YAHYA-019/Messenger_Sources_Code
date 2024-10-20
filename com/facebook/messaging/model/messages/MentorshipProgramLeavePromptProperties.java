package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: MentorshipProgramLeavePromptProperties.class */
public final class MentorshipProgramLeavePromptProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(3);
    public int A00;
    public String A01;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
