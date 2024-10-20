package com.facebook.messaging.aibot.notify;

import X.11T;
import X.1BL;
import X.C5ap;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerAiAgentsUserOffWaitlistNotification.class */
public final class MessengerAiAgentsUserOffWaitlistNotification extends MessagingNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(89);
    public boolean A00;
    public final String A01;
    public final String A02;
    public final PushProperty A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerAiAgentsUserOffWaitlistNotification(PushProperty pushProperty, String str, String str2, boolean z) {
        super(C5ap.A17, pushProperty);
        1BL.A1F(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = pushProperty;
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
