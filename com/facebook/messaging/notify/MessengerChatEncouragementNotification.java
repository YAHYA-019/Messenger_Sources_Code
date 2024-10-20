package com.facebook.messaging.notify;

import X.AbK;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerChatEncouragementNotification.class */
public final class MessengerChatEncouragementNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(74);
    public final ThreadKey A00;
    public final String A01;
    public final String A02;

    public MessengerChatEncouragementNotification(Parcel parcel) {
        super(parcel);
        this.A00 = AbK.A0X(parcel);
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        parcel.readString();
        parcel.readInt();
    }

    public MessengerChatEncouragementNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2) {
        super(C5ap.A1B, pushProperty);
        this.A00 = threadKey;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
