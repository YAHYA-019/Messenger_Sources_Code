package com.facebook.messaging.notify;

import X.C53v;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: FriendInstallNotification.class */
public final class FriendInstallNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(61);
    public boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public FriendInstallNotification(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = C53v.A0S(parcel);
    }

    public FriendInstallNotification(PushProperty pushProperty, String str, String str2, String str3, String str4) {
        super(C5ap.A0w, pushProperty);
        this.A02 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
