package com.facebook.orca.notify;

import X.C53v;
import X.C5ap;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: SwitchToFbAccountNotification.class */
public final class SwitchToFbAccountNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = new FKY(15);
    public boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public SwitchToFbAccountNotification(Parcel parcel) {
        super(parcel);
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = C53v.A0S(parcel);
    }

    public SwitchToFbAccountNotification(String str, String str2, String str3) {
        super(C5ap.A2d, null);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
