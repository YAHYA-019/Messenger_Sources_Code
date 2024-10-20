package com.facebook.messaging.notify;

import X.AbK;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerAFSCancelationIncompleteNotification.class */
public final class MessengerAFSCancelationIncompleteNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(64);
    public final String A00;
    public final String A01;
    public final String A02;
    public final ThreadKey A03;

    public MessengerAFSCancelationIncompleteNotification(Parcel parcel) {
        super(parcel);
        this.A03 = AbK.A0X(parcel);
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        parcel.readInt();
    }

    public MessengerAFSCancelationIncompleteNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3) {
        super(C5ap.A2G, pushProperty);
        this.A03 = threadKey;
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
