package com.facebook.messaging.publicchats.notify;

import X.11T;
import X.7zT;
import X.C5ap;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerChannelsDirectInviteNotification.class */
public final class MessengerChannelsDirectInviteNotification extends BaseMessengerChannelsNotification {
    public static final Parcelable.Creator CREATOR = CSS.A00(35);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final PushProperty A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerChannelsDirectInviteNotification(PushProperty pushProperty, String str, String str2, String str3, String str4, String str5) {
        super(C5ap.A19, pushProperty);
        7zT.A1W(str, str2, str3, str4);
        this.A04 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A03 = str5;
        this.A05 = pushProperty;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A05, i);
    }
}
