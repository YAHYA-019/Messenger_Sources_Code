package com.facebook.messaging.notify;

import X.C53v;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: PageAdminIncomingCallNotification.class */
public final class PageAdminIncomingCallNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(80);
    public boolean A00;
    public final String A01;
    public final String A02;

    public PageAdminIncomingCallNotification(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = C53v.A0S(parcel);
    }

    public PageAdminIncomingCallNotification(String str) {
        super(C5ap.A2U, null);
        this.A02 = str;
        this.A01 = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
