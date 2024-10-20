package com.facebook.messaging.notify;

import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: SimpleMessageNotification.class */
public class SimpleMessageNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(84);
    public final String A00;

    public SimpleMessageNotification(C5ap c5ap, PushProperty pushProperty, String str) {
        super(c5ap, pushProperty);
        this.A00 = str;
    }

    public SimpleMessageNotification(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
