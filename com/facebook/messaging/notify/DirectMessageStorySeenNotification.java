package com.facebook.messaging.notify;

import X.24X;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: DirectMessageStorySeenNotification.class */
public final class DirectMessageStorySeenNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(59);
    public 24X A00;
    public String A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
    }
}
