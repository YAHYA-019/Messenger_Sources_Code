package com.facebook.messaging.sharedalbum.notifications;

import X.11T;
import X.1BL;
import X.C5ap;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerSharedAlbumAdditionNotification.class */
public final class MessengerSharedAlbumAdditionNotification extends MessengerSharedAlbumNotification {
    public static final Parcelable.Creator CREATOR = CSU.A00(36);
    public final ThreadKey A00;
    public final String A01;
    public final String A02;
    public final PushProperty A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerSharedAlbumAdditionNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2, boolean z) {
        super(threadKey, C5ap.A25, pushProperty);
        1BL.A1H(str, str2, threadKey);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = threadKey;
        this.A03 = pushProperty;
        this.A04 = z;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
