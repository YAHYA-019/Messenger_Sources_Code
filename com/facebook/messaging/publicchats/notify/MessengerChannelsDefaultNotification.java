package com.facebook.messaging.publicchats.notify;

import X.11T;
import X.1BL;
import X.C5ap;
import X.C9i;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerChannelsDefaultNotification.class */
public final class MessengerChannelsDefaultNotification extends BaseMessengerChannelsNotification {
    public static final Parcelable.Creator CREATOR = CSS.A00(34);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final C5ap A07;
    public final PushProperty A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerChannelsDefaultNotification(C5ap c5ap, PushProperty pushProperty, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        super(c5ap, pushProperty);
        1BL.A1H(str, str2, str3);
        11T.A0F(c5ap, 9);
        this.A06 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A04 = str5;
        this.A00 = num;
        this.A01 = str6;
        this.A08 = pushProperty;
        this.A07 = c5ap;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C9i.A01(num));
        }
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A08, i);
        1BL.A12(parcel, this.A07);
    }
}
