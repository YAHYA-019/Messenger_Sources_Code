package com.facebook.messaging.notify;

import X.C5ap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: NotesNotification.class */
public final class NotesNotification extends MessagingNotification {
    public final ThreadKey A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public NotesNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3, String str4) {
        super(C5ap.A14, pushProperty);
        this.A04 = str;
        this.A01 = str2;
        this.A00 = threadKey;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
