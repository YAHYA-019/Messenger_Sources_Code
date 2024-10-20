package com.facebook.messaging.sharedalbum.notifications;

import X.C5ap;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerSharedAlbumNotification.class */
public abstract class MessengerSharedAlbumNotification extends MessagingNotification implements Parcelable {
    public final ThreadKey A00;
    public final PushProperty A01;

    public MessengerSharedAlbumNotification(ThreadKey threadKey, C5ap c5ap, PushProperty pushProperty) {
        super(c5ap, pushProperty);
        this.A00 = threadKey;
        this.A01 = pushProperty;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
