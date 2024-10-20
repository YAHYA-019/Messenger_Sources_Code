package com.facebook.messaging.publicchats.notify;

import X.11T;
import X.7zT;
import X.C5ap;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerChannelsNewChannelNotification.class */
public final class MessengerChannelsNewChannelNotification extends BaseMessengerChannelsNotification {
    public static final Parcelable.Creator CREATOR = CSS.A00(36);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final PushProperty A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerChannelsNewChannelNotification(PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6) {
        super(C5ap.A1A, pushProperty);
        7zT.A1W(str, str2, str3, str4);
        this.A05 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A02 = str4;
        this.A04 = str5;
        this.A06 = pushProperty;
        this.A01 = str6;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A01);
    }
}
