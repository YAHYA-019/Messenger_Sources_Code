package com.facebook.messaging.tincan.tincanoverwamsys.backgroundsync.generic.notify;

import X.11T;
import X.AnonymousClass001;
import X.C5ap;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerGenericTincanMessage.class */
public final class MessengerGenericTincanMessage extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = new CSU(85);
    public final String A00;
    public final String A01;

    public MessengerGenericTincanMessage(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = readString2;
    }

    public MessengerGenericTincanMessage(PushProperty pushProperty, String str, String str2) {
        super(C5ap.A1m, pushProperty);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
