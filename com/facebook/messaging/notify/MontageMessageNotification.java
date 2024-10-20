package com.facebook.messaging.notify;

import X.C5ap;
import android.os.Parcel;
import com.facebook.push.constants.PushProperty;

/* loaded from: MontageMessageNotification.class */
public final class MontageMessageNotification extends SimpleMessageNotification {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public MontageMessageNotification(C5ap c5ap, PushProperty pushProperty, String str, String str2, String str3, String str4, String str5) {
        super(c5ap, pushProperty, str);
        this.A03 = str2;
        this.A00 = str3;
        this.A02 = str4;
        this.A01 = str5;
    }

    @Override // com.facebook.messaging.notify.SimpleMessageNotification, com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
