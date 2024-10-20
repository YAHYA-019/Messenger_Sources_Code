package com.facebook.messaging.notify;

import X.1BL;
import X.AbK;
import X.C53v;
import X.C5ap;
import X.C6jR;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import com.facebook.user.model.UserKey;

/* loaded from: JoinRequestNotification.class */
public final class JoinRequestNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(62);
    public boolean A00;
    public final ThreadKey A01;
    public final C6jR A02;
    public final UserKey A03;
    public final String A04;
    public final String A05;

    public JoinRequestNotification(Parcel parcel) {
        super(parcel);
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = AbK.A0X(parcel);
        this.A03 = (UserKey) 1BL.A0C(parcel, UserKey.class);
        this.A00 = C53v.A0S(parcel);
        this.A02 = (C6jR) C53v.A07(parcel, C6jR.class);
    }

    public JoinRequestNotification(ThreadKey threadKey, C6jR c6jR, PushProperty pushProperty, UserKey userKey, String str, String str2) {
        super(C5ap.A10, pushProperty);
        this.A05 = str;
        this.A04 = str2;
        this.A01 = threadKey;
        this.A03 = userKey;
        this.A02 = c6jR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A00 ? 1 : 0);
        C53v.A0J(parcel, this.A02);
    }
}
