package com.facebook.messaging.accountrecovery.notifications;

import X.11T;
import X.1BL;
import X.7zT;
import X.C5ap;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import java.util.HashMap;

/* loaded from: PushToSessionNotification.class */
public final class PushToSessionNotification extends MessagingNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(85);
    public final String A00;
    public final String A01;
    public final C5ap A02;
    public final PushProperty A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushToSessionNotification(C5ap c5ap, PushProperty pushProperty, String str, String str2) {
        super(c5ap, pushProperty);
        7zT.A1T(str, str2, c5ap);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = pushProperty;
        this.A02 = c5ap;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification
    public HashMap A03() {
        return super.A03();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A03, i);
        1BL.A12(parcel, this.A02);
    }
}
