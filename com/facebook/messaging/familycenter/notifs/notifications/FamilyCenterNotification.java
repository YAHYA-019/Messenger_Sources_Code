package com.facebook.messaging.familycenter.notifs.notifications;

import X.11T;
import X.1BL;
import X.7zL;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: FamilyCenterNotification.class */
public final class FamilyCenterNotification extends MessagingNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(59);
    public final String A00;
    public final String A01;
    public final String A02;
    public final C5ap A03;
    public final PushProperty A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyCenterNotification(C5ap c5ap, PushProperty pushProperty, String str, String str2, String str3) {
        super(c5ap, pushProperty);
        1BL.A1H(str, str2, str3);
        11T.A0F(c5ap, 5);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A04 = pushProperty;
        this.A03 = c5ap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A04, i);
        1BL.A12(parcel, this.A03);
    }
}
