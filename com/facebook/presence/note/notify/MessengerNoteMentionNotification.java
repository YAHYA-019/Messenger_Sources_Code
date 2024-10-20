package com.facebook.presence.note.notify;

import X.11T;
import X.AnonymousClass001;
import X.C5ap;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerNoteMentionNotification.class */
public final class MessengerNoteMentionNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = new FKW(57);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public MessengerNoteMentionNotification(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = readString3;
        String readString4 = parcel.readString();
        if (readString4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = readString4;
    }

    public MessengerNoteMentionNotification(PushProperty pushProperty, String str, String str2, String str3, String str4) {
        super(C5ap.A1y, pushProperty);
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
