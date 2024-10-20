package com.facebook.messaging.notify;

import X.02W;
import X.1BL;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerFbPayReferralExpirationNotification.class */
public final class MessengerFbPayReferralExpirationNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(75);
    public final ThreadKey A00;
    public final String A01;

    public MessengerFbPayReferralExpirationNotification(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        02W.A02(readString);
        this.A01 = readString;
        Parcelable A0C = 1BL.A0C(parcel, ThreadKey.class);
        A0C.getClass();
        this.A00 = (ThreadKey) A0C;
    }

    public MessengerFbPayReferralExpirationNotification(ThreadKey threadKey, PushProperty pushProperty, String str) {
        super(C5ap.A24, pushProperty);
        this.A00 = threadKey;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
