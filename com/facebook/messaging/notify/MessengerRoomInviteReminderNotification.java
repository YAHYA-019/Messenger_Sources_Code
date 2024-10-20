package com.facebook.messaging.notify;

import X.AbK;
import X.C53v;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerRoomInviteReminderNotification.class */
public final class MessengerRoomInviteReminderNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(77);
    public boolean A00;
    public final ThreadKey A01;
    public final String A02;

    public MessengerRoomInviteReminderNotification(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readString();
        this.A01 = AbK.A0X(parcel);
        this.A00 = C53v.A0S(parcel);
    }

    public MessengerRoomInviteReminderNotification(ThreadKey threadKey, PushProperty pushProperty, String str) {
        super(C5ap.A2b, pushProperty);
        this.A02 = str;
        this.A01 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
