package com.facebook.messaging.analytics.ttrc.surface.notification.event;

import X.11T;
import X.C0s8;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: OnNotification.class */
public final class OnNotification extends PRELoggingEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnNotification(String str) {
        super("on_notification");
        11T.A0F(str, 1);
        this.A00 = str;
    }
}
