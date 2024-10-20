package com.facebook.messaging.notify;

import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: MessengerSupportInboxNotification.class */
public final class MessengerSupportInboxNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(78);
    public long A00;
    public String A01;
    public boolean A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
