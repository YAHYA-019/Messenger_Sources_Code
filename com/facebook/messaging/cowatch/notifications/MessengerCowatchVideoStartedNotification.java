package com.facebook.messaging.cowatch.notifications;

import X.11T;
import X.1BL;
import X.7zL;
import X.AnonymousClass001;
import X.C53v;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerCowatchVideoStartedNotification.class */
public final class MessengerCowatchVideoStartedNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(28);
    public final ThreadKey A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public MessengerCowatchVideoStartedNotification(Parcel parcel) {
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
        this.A01 = readString2;
        Parcelable A0C = 1BL.A0C(parcel, ThreadKey.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = (ThreadKey) A0C;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = readString3;
        this.A04 = C53v.A0S(parcel);
    }

    public MessengerCowatchVideoStartedNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3, boolean z) {
        super(C5ap.A1g, pushProperty);
        this.A03 = str;
        this.A01 = str2;
        this.A00 = threadKey;
        this.A02 = str3;
        this.A04 = z;
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
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}