package com.facebook.messaging.deepsleepmode;

import X.11T;
import X.7zL;
import X.AnonymousClass001;
import X.C53v;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerDeepSleepModeNotification.class */
public final class MessengerDeepSleepModeNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(36);
    public boolean A00;
    public final String A01;
    public final String A02;

    public MessengerDeepSleepModeNotification(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = readString2;
        this.A00 = C53v.A0S(parcel);
    }

    public MessengerDeepSleepModeNotification(PushProperty pushProperty, String str, String str2) {
        super(C5ap.A1h, pushProperty);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
