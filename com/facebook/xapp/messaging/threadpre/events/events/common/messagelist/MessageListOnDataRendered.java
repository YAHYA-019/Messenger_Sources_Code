package com.facebook.xapp.messaging.threadpre.events.events.common.messagelist;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: MessageListOnDataRendered.class */
public final class MessageListOnDataRendered extends PRELoggingEvent {
    public static final List A02 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final Boolean A00;
    public final boolean A01;

    public MessageListOnDataRendered(Boolean bool, int i, boolean z) {
        super(i);
        this.A00 = bool;
        this.A01 = z;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListOnDataRendered";
    }

    public List B1L() {
        return A02;
    }
}
