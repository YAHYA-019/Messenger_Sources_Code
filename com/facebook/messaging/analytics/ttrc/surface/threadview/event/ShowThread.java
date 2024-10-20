package com.facebook.messaging.analytics.ttrc.surface.threadview.event;

import X.11T;
import X.C0s8;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: ShowThread.class */
public final class ShowThread extends PRELoggingEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");
    public final ThreadKey A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowThread(ThreadKey threadKey, String str) {
        super("nav/thread");
        11T.A0F(str, 2);
        this.A00 = threadKey;
    }
}
