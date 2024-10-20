package com.facebook.messaging.cowatch.notifications;

import X.11T;
import X.7zL;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerLivingRoomCreateNotification.class */
public final class MessengerLivingRoomCreateNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(29);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public MessengerLivingRoomCreateNotification(Parcel parcel) {
        super(parcel);
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public MessengerLivingRoomCreateNotification(PushProperty pushProperty, String str, String str2, String str3, String str4, String str5) {
        super(C5ap.A1p, pushProperty);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A00 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
