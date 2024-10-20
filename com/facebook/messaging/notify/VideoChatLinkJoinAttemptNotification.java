package com.facebook.messaging.notify;

import X.AbM;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: VideoChatLinkJoinAttemptNotification.class */
public final class VideoChatLinkJoinAttemptNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(89);
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;

    public VideoChatLinkJoinAttemptNotification(Parcel parcel) {
        super(parcel);
        this.A02 = AbM.A0t(parcel);
        this.A01 = AbM.A0t(parcel);
        this.A00 = AbM.A0t(parcel);
        this.A03 = parcel.readBoolean();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeBoolean(this.A03);
    }
}
