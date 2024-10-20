package com.facebook.messaging.notify;

import X.C5ap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: BICConsentRequestNotification.class */
public final class BICConsentRequestNotification extends MessagingNotification {
    public final ThreadKey A00;
    public final String A01;

    public BICConsentRequestNotification(ThreadKey threadKey, PushProperty pushProperty, String str) {
        super(C5ap.A02, pushProperty);
        this.A01 = str;
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
