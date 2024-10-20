package com.facebook.messaging.friending.notifications;

import X.11T;
import X.7zL;
import X.7zT;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: FriendRequestNotification.class */
public final class FriendRequestNotification extends MessagingNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(60);
    public boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final PushProperty A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendRequestNotification(PushProperty pushProperty, String str, String str2, String str3, String str4, boolean z) {
        super(C5ap.A0x, pushProperty);
        7zT.A1W(str, str2, str3, str4);
        this.A04 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A05 = pushProperty;
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
